package hibernate.hibernateAttributeConverter;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
	  private static SessionFactory sf;
	  private Session session; 
	  private Transaction tx;
	
	  static {
	        Configuration config = new Configuration().configure("hibernate.cfg.xml");
	        sf = config.buildSessionFactory();
	    }

	    public App() {
	        session = sf.openSession(); 
	        tx = session.beginTransaction(); 
	    }

    public static void main( String[] args ) {
    
    	App main = new App();
    	
       Customer customers = new Customer();
       customers.setId(5);
       customers.setPersonName(new PersonName("Jerome","Birungi"));
       customers.setEmail("jeromeB@gmail.com");
       customers.setPhonenumber(new PhoneNumber("256","772122408"));
       
       main.session.persist(customers);
       main.tx.commit();
       main.session.close();
       sf.close();
      
    }
}
