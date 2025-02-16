package hibernateQueryLanguage.LearningHqL;

import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Map;

public class App {

    private static SessionFactory sf;
    private Session session;
    private Transaction transaction;

    public App() {
    	Connection connection = DatabaseConnection.getConnection();
        if (connection != null) {
            Configuration conf = new Configuration().configure("hibernate.cfg.xml");
            sf = conf.buildSessionFactory();
            session = sf.openSession();
            transaction = session.beginTransaction();
    }
    }

 public void displayCustomers() {
        
        try {
            String hql = "FROM Customers";
            Query<Customers> query = session.createQuery(hql, Customers.class);
            query.setMaxResults(3);
            List<Customers> results = query.getResultList();
            for (Customers customer : results) {
                System.out.println("Customer ID: " + customer.getCustomer_ID());
                System.out.println("Customer Name: " + customer.getCustomer_name());
                System.out.println("Contact Name: " + customer.getContact_name());
                System.out.println("Address: " + customer.getAddress());
                System.out.println("City: " + customer.getCity());
                System.out.println("Postal Code: " + customer.getPostal_code());
                System.out.println("Country: " + customer.getCountry());
                System.out.println("Oh yes, i did it!");
                System.out.println();
                            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
        
    public void numberOfCustomers() {
        
        try {
            String hql = "FROM Customers";
//            Query<Customers> query = session.createQuery(hql, Customers.class);
            Query<Customers> query = session.createQuery("From Customers where customer_ID > 20");
//        	 Query<Customers>query = session.createQuery("FROM Customers");
             List<Customers> customers = query.list();
            System.out.println("Number of customers is: " + customers.size());
            for(Customers c : customers) {
            	System.out.println(c.getCountry());
            }

            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
        
        public void keepChecking() {
        	
            try {
            	Query<Customers>query = session.createQuery("FROM Customers where customer_ID > 18");
            	query.setMaxResults(3);
            	List<Customers> customers = query.getResultList();
            	for(Customers c : customers) {
            		System.out.println(c.getCity());
            	}
            	transaction.commit();
            	session.close();
            } catch (Exception e) {
                if (transaction != null) transaction.rollback();
                e.printStackTrace();
            } finally {
        }
    }
//      using parameter setting  
        public void customersInUSA() {
                try {
                String hql = "FROM Customers WHERE country = :country";
                Query<Customers> query = session.createQuery(hql, Customers.class);
                query.setParameter("country", "USA");
                List<Customers> customers = query.list();
                for(Customers c : customers) {
                	System.out.println(c.getCustomer_name());
                }
                
//                System.out.println("Number of customers in USA is: " + customers.size());
                
                transaction.commit();
            } catch (Exception e) {
                if (transaction != null) transaction.rollback();
                e.printStackTrace();
            } finally {
                session.close();
            }
        }
//     pagination   
        public void pagination() {
        	try{
        	Query<Customers>query = session.createQuery("FROM Customers");
        	query.setFirstResult(10);
        	query.setMaxResults(3);
        	List<Customers>customers= query.getResultList();
        	    for(Customers x : customers) {
        		System.out.println(x.getCustomer_ID() + " " + x.getContact_name());
        		
//        		Query<String>query = session.createQuery("select city from Customers");
//        		query.setFirstResult(18);
//            	query.setMaxResults(4);
//            	List<String>cities = (List<String>) query.list();
//            	    for(String y : cities) {
//            		System.out.println(y);
        	}
        	  transaction.commit();
            } catch (Exception e) {
                if (transaction != null) transaction.rollback();
                e.printStackTrace();
            } finally {
                session.close();
            }
        }
        	
        	public void displayMore() {
        	     Query<Object[]> query = session.createQuery("SELECT city, contact_name, customer_ID FROM Customers", Object[].class);
//                Query<Map> query = session.createQuery("SELECT new map(customer_ID as id, country as country) FROM Customers", Map.class);

                query.setFirstResult(0);
                query.setMaxResults(2);

//                List<Map> results = query.list();
                
                // Print the results
//                for (Map<String, Object> row : results) {
//                    int customerId = (int) row.get("id");
//                    String country = (String) row.get("country");
//                    System.out.println("Customer ID: " + customerId + ", Country: " + country);
//                }

                // For the Object[] query, uncomment the following section
                
                List<Object[]> results = query.list();
                for (Object[] row : results) {
                    String city = (String) row[0];
                    String contactName = (String) row[1];
                    int customerId = (int) row[2];
                    System.out.println("City: " + city + ", Contact Name: " + contactName + ", Customer ID: " + customerId);
                }
                
                transaction.commit();
            
                session.close();
            }


    public static void main(String[] args) {
       
            
             App app = new App();
//            app.displayCustomers();
//             app.numberOfCustomers();
//             app.keepChecking();
//            app.customersInUSA();
//             app.pagination();
//             app.displayMore();
             
             
    }
    

             
        }
        
    


