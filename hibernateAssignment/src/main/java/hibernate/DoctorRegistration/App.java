package hibernate.DoctorRegistration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.NoResultException;
import jakarta.persistence.NonUniqueResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;

public class App {
	
	private EntityManagerFactory emf;
    private EntityManager em;

    public App() {
        emf = Persistence.createEntityManagerFactory("myRecords");
        em = emf.createEntityManager();
    }

      @SuppressWarnings("unchecked")
	public void addDoctor(Doctor doctor) {
            try {
                em.getTransaction().begin();
                em.persist(doctor);
                em.getTransaction().commit();
                System.out.println("Doctor registered successfully.");
                // Serialization after adding the doctor
                List doctors = new ArrayList<>();
                Set<Doctor> doctorSet = new HashSet<>(doctors); 

                // Retrieve all doctors from the database
                String hql = "FROM Doctor";
                Query query = em.createQuery(hql);
                doctors =  query.getResultList();

                try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("Doctor_Registry.txt"))) {
                    objOut.writeObject(doctors); 
                    objOut.flush();
                    objOut.close();;
                } catch (IOException e) {
                    System.err.println("Error serializing doctors: " + e);
                }

            } catch (Exception ex) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                System.err.println("Error adding doctor: " + ex.getMessage());
            }
        }

    
    // DISPLAY LIST METHOD
	@SuppressWarnings("unchecked")
	public void displayAllDoctors() {
		 em.getTransaction().begin();
    	try {
            List<Doctor> doctors = new ArrayList<>();

            // 1. Attempt to deserialize doctors from the file
            try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("Doctor_Registry.txt"))) {
                doctors = (List<Doctor>) objIn.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error deserializing doctors: " + e);
            }

            // 2. If deserialization failed or no doctors were loaded, get doctors from the database
            if (doctors.isEmpty()) {
                String hql = "FROM Doctor";
                Query query = em.createQuery(hql);
                doctors = query.getResultList(); 
                em.getTransaction().commit();
            }else {
            	System.out.println("Oli muyaaye just.");
            }
            // 3. Display the doctors
//            System.out.println("DOCTORS REGISTRATION RECORDS:");
            for (Doctor doctor : doctors) {
                System.out.println(doctor);
//            	System.out.println("DoctorID: " + doctor.getId());
//            	System.out.println("DoctorName: " + doctor.getName());
//            	System.out.println("Specialization: " + doctor.getSpecialization());
//            	System.out.println("Yeas of Experience: " + doctor.getYearsOfExperience());
//            	System.out.println("License Number: " + doctor.getLicenseNumber());
//            	System.out.println("Doctor contact: " + doctor.getContactNumber());
//            	   System.out.println();
            }
         

            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error displaying doctors: " + ex);
        }
    }
    
   //METHOD TO SEARCH DOCTOR BY ID
    public void searchDoctorById(int id) {
        try {
            em.getTransaction().begin();

             Doctor doctor = em.find(Doctor.class, id);
               if (doctor != null) {
                System.out.println("Found Doctor: " + doctor);
            } else {
                System.out.println("No doctor found with ID: " + id);
            }

            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error searching for doctor: " + ex);
        }
    }
    
    //METHOD TO SEARCH DOCTOR BY LICENSE NUMBER
    public void searchDoctorByLicense(String licenseNumber) {
        try {
            em.getTransaction().begin();
            String jpql = "SELECT d FROM Doctor d WHERE d.licenseNumber = :licenseNumber";
            TypedQuery<Doctor> query = em.createQuery(jpql, Doctor.class);
            query.setParameter("licenseNumber", licenseNumber);

            try {
                Doctor doctor = query.getSingleResult();
                if(doctor.getLicenseNumber() != null) {
                System.out.println("Found Doctor: " + doctor);
                }else {
                	System.out.println("invalid input");
                }
            } catch (NoResultException e) {
                System.out.println("No doctor found with license number: " + licenseNumber);
            } catch (NonUniqueResultException e) {
                System.out.println("Multiple doctors found with the same license number: " + licenseNumber);
            }

            em.getTransaction().commit();
        } catch (Exception ex) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
            System.err.println("Error searching for doctor: " + ex);
        }
    }
    
    //USING A NAMED QUERY
    public void searchDoctorBySpecialization(String specialization){
    	try {
    		em.getTransaction().begin();
    		TypedQuery<Doctor>doctors = em.createNamedQuery("Doctor.findBySpecialization", Doctor.class);
    		doctors.setParameter("specialization", specialization);
    		 List<Doctor> resultList = doctors.getResultList(); 

    	        if (!resultList.isEmpty()) { 
    	            for (Doctor doctor : resultList) {
    	                System.out.println(doctor);
    	            }
    	        } else {
    	            System.out.println("No doctor found with that specialization: " + specialization);
    	        }

    	        em.getTransaction().commit(); 
    	    } catch (Exception ex) {
    	        if (em.getTransaction().isActive()) {
    	            em.getTransaction().rollback();
    	        }
    	        System.err.println("Error searching for doctor: " + ex);
    	    }
    	}
    
    //METHOD TO UPDATE REGISTRY
          
    public void updateDoctor(int id, String newName, String newSpecialization) {
            try {
                em.getTransaction().begin();

                // 1. Update the doctor in the database using HQL
                String hql = "UPDATE Doctor d SET d.name = :newName, d.specialization = :newSpecialization WHERE d.Id = :id";
                Query query = em.createQuery(hql);
                query.setParameter("newName", newName);
                query.setParameter("newSpecialization", newSpecialization);
                query.setParameter("id", id);
                int updatedCount = query.executeUpdate();

                if (updatedCount > 0) {
                    System.out.println("Doctor updated successfully.");
                    // 2. Serialize the updated doctor list to the file
                    List<Doctor> doctors = new ArrayList<>();
                    // Retrieve all doctors from the database
                    String hqlGetAll = "FROM Doctor";
                    Query queryGetAll = em.createQuery(hqlGetAll);
                    doctors = queryGetAll.getResultList();
                    try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("Doctor_Registry.txt"))) {
                        objOut.writeObject(doctors);
                        objOut.flush();
                    } catch (IOException e) {
                        System.err.println("Error serializing doctors: " + e);
                    }
                } else {
                    System.out.println("No doctor found with ID: " + id);
                }

                em.getTransaction().commit();
            } catch (Exception ex) {
                if (em.getTransaction().isActive()) {
                    em.getTransaction().rollback();
                }
                System.err.println("Error updating doctor: " + ex);
            }
        }

       
    
    public static void main( String[] args ){
    	
    	App app = new App(); 

    	//implementation of add method
    	   Set<Doctor> doctorSet = new HashSet<>();
        doctorSet.add(new Doctor(1,"Dr. Timothy Paul", "Dentist", "DENT1214310", 2, "0782380638"));
//        doctorSet.add(new Doctor(3,"Dr. James Musoke", "Oncologist", "ONCO4567890", 8, "0777912332"));
//        doctorSet.add(new Doctor(4,"Dr. Davis Besigye", "Pediatrician", "PEDIA9012345", 12, "0772120201"));
//        doctorSet.add(new Doctor(5,"Dr. Wilson Kanyankore", "Surgeon", "SURG5678901", 7, "0776555540"));

        // Add the doctors to the database and serialize them
        for (Doctor doctor : doctorSet) { 
            app.addDoctor(doctor);
        }
       
       //implement method to list all doctors
//       app.displayAllDoctors();
       
    
    	//implement method to search a doctor by Id
//    	app.searchDoctorById(20);
    	
//    	app.searchDoctorByLicense("CARD1234567");
        
//        app.searchDoctorBySpecialization("Orthodontist");
    	
//        app.updateDoctor(5, "Yvonne Nakalema", "GP");
  
        
    }
}
