package uniqueConstraints;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainPersonAddress {

	public static void main(String[] args) {
		
		  try (SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		             Session session = sf.openSession()) 
		 {

		            Transaction transaction = session.beginTransaction(); 


		            // Create and save 3 Address objects
		            Address address1 = new Address();
		            address1.setStreetAddress("123 Main St");
		            Address address2 = new Address();
		            address2.setStreetAddress("456 Oak Ave");
		            Address address3 = new Address();
		            address3.setStreetAddress("789 Elm St");
		            session.persist(address1);
		            session.persist(address2);
		            session.persist(address3);

		            // Create and save 3 Person objects, associating them with the addresses
		            Person person1 = new Person("Alice", "password123", "alice@example.com", 101, true, "SEC1", "DEPT1", address1);
		            Person person2 = new Person("Bob", "securepass", "bob@example.com", 102, false, "SEC2", "DEPT2", address2);
		            Person person3 = new Person("Charlie", "pass456", "charlie@example.com", 103, true, "SEC3", "DEPT3", address3);
		            

		            session.persist(person1);
		            session.persist(person2);
		            session.persist(person3);

		            transaction.commit();
		        } catch (Throwable ex) {
		            System.err.println("Error: " + ex);
		            ex.printStackTrace();
		        }
		    }
		}

