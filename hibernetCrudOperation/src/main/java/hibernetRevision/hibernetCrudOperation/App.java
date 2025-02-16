package hibernetRevision.hibernetCrudOperation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App {
	
	private SessionFactory sessionFactory;

    
    public App() {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        sessionFactory = configuration.buildSessionFactory();
    }

//    method to update Student class
    public void updateStudent(Student candidate) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;
        transaction = session.beginTransaction();
        session.merge(candidate); // update is a deprecated method in my version. I have used merge
        transaction.commit();
        System.out.println("Student updated: " + candidate);
         session.close();
        }
    
    
 // method to delete a column from the table
    @SuppressWarnings("deprecation")// im using this anotation coz my method is deprecated & i couldnt find an alternative
	public void dropColumn(String columnName) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            String sql = "ALTER TABLE Student DROP COLUMN " + columnName;
            session.createNativeQuery(sql).executeUpdate();
            transaction.commit();
            System.out.println("Column " + columnName + " deleted successfully.");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
//    DELETE record using ID
    
    public void deleteRecord(int id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            Student student = session.get(Student.class, id); 
            if (student != null) { session.delete(student); }
            transaction.commit();
             } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

// method to retrieve the entire list of students in the table
    public void printAllStudents() {
        Session session = sessionFactory.openSession();
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            List<Student> students = session.createQuery("from Student", Student.class).list();
            transaction.commit();

            for (Student student : students) {
                System.out.println(student);
            }
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }


	public static void main( String[] args ){
    
    	Student candidate = new Student();
    	
    	//CREATE
    	
//    	candidate.setStudentID(9);
//    	candidate.setName("Nakate");
//    	candidate.setCourse("Education");
//    	candidate.setTuition(150000);
    	
//    	  Configuration conf = new Configuration();
//        conf.configure("hibernate.cfg.xml");
//        SessionFactory sef = conf.buildSessionFactory();
//        Session session = sef.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.persist(candidate);
//        transaction.commit();
//        session.close();
    	
      
        //RETRIEVE
        
//        Configuration conf = new Configuration();
//        conf.configure("hibernate.cfg.xml");
//        SessionFactory sef = conf.buildSessionFactory();
//        Session session = sef.openSession();
//        Transaction transaction = session.beginTransaction();
//        candidate = (Student)session.get(Student.class, 3);
//        transaction.commit();
//        System.out.println(candidate);
        
//        UPDATE
      
//    	  App myApp = new App();
//        candidate.setStudentID(5); 
//        candidate.setName("Pekeshe");
//        candidate.setCourse("Computing");
//        candidate.setTuition(800000);
//         myApp.updateStudent(candidate);

//        DELETE
        
//        myApp.dropColumn("sessionFactory");

//          RETRIEVE A FULL LIST 
//          myApp.printAllStudents();
//    	    myApp.deleteRecord(8);
    	
    	
    }
}
