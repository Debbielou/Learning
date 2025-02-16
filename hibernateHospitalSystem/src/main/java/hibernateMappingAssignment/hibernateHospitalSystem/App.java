package hibernateMappingAssignment.hibernateHospitalSystem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.HashSet;
import java.util.Set;

public class App {

    private static SessionFactory sf;
    private Session session;
    private Transaction transaction;

    public App() {
        sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        session = sf.openSession();
        transaction = session.beginTransaction();
    }
    
    public void createPatient() {
        
        Patient patient1 = new Patient();
        patient1.setName("China Town");
        patient1.setGender("Female");
        patient1.setAge(22);

        Visit visit1 = new Visit();
        visit1.setDate("2024-02-14");
        visit1.setPatient(patient1);

        Visit visit2 = new Visit();
        visit2.setDate("2024-05-31");
        visit2.setPatient(patient1);

        Visit visit3 = new Visit();
        visit3.setDate("2024-08-19");
        visit3.setPatient(patient1);

        Encounter encounter1 = new Encounter();
        encounter1.setDescription("Surgery");

        Encounter encounter2 = new Encounter();
        encounter2.setDescription("Dressing");

        Encounter encounter3 = new Encounter();
        encounter3.setDescription("Review");
        
        session.persist(encounter1);
        session.persist(encounter2);
        session.persist(encounter3);

        Set<Encounter> encounters = new HashSet<>();
        encounters.add(encounter1);
        encounters.add(encounter2);
        encounters.add(encounter3);
        
        Set<Visit> visits = new HashSet<>();
        visits.add(visit1);
        visits.add(visit2);
        visits.add(visit3);
        
        encounter1.setVisits(visits);
        encounter2.setVisits(visits);
        encounter3.setVisits(visits);
        
        visit1.setEncounter(encounters);
        visit2.setEncounter(encounters);
        visit3.setEncounter(encounters);
        

        patient1.setVisits(visits);
       
        session.persist(patient1);

        transaction.commit();
    
        session.close();
        sf.close();
    
}
    

@SuppressWarnings("deprecation")
public void updatePatient(int patientId, String newVisitDate, String newEncounterDescription) {
       
        Patient patient = session.get(Patient.class, patientId);
        for (Visit visit : patient.getVisits()) {
            visit.setDate(newVisitDate);
            for (Encounter encounter : visit.getEncounters()) {
                encounter.setDescription(newEncounterDescription);
                session.update(encounter);
            }
            session.update(visit);
        }
        session.update(patient);

        transaction.commit();
        System.out.println("Updated successfully");
    } 

	public void displayPatientById(int id) {
	Patient patient = session.get(Patient.class, id);
    if (patient != null) {
        int patientID = patient.getId();
        String patientName = patient.getName();
        String patientGender = patient.getGender();
        int patientAge = patient.getAge();
        Set<Visit> visits = patient.getVisits();

        StringBuilder patientInfo = new StringBuilder();
        patientInfo.append("Patient ID: ").append(patientID)
                   .append(", Name: ").append(patientName)
                   .append(", Gender: ").append(patientGender)
                   .append(", Age: ").append(patientAge)
                   .append(", Visits: [");

        for (Visit visit : visits) {
            String visitDate = visit.getDate();
            Set<Encounter> encounters = visit.getEncounters();
            patientInfo.append("Visit Date: ").append(visitDate).append(", Encounters: [");
            for (Encounter encounter : encounters) {
                String encounterDescription = encounter.getDescription();
                patientInfo.append("Encounter Description: ").append(encounterDescription).append(", ");
            }
            patientInfo.append("], ");
        }
        patientInfo.append("]");

        System.out.println(patientInfo.toString());
    } else {
        System.out.println("Patient not found with ID: " + id);
    }

    transaction.commit();

    session.close();
    sf.close();
	}
        

@SuppressWarnings("deprecation")
public void deletePatient(int id) {
	Patient patient = session.get(Patient.class, id);
	     if (patient != null) {
	    	 for (Visit visit : patient.getVisits()) {
	                for (Encounter encounter : visit.getEncounters()) {
	                    session.delete(encounter);
	                }
	                session.delete(visit);
	            }
	            session.delete(patient);
         System.out.println("Patient deleted successfully.");
     } else {
         System.out.println("Patient not found with ID: " + id);
     }

     transaction.commit();
     session.close();
     sf.close();
 }

    public static void main(String[] args) {
        App app = new App();
//        app.createPatient();
//        app.updatePatient(1, "2024-08-15", "Review");
        app.displayPatientById(7);
//        app.deletePatient(8);
    }

   
}
