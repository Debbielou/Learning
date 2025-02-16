package hibernetLifeCycle.hibernateCreatedAt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {

    public static void main( String[] args ){
    
       User theUser = new User("nakamad", "Deborah", "Nakamatte", "Deborah Nakamatte");
       
       Configuration conf = new Configuration();
       SessionFactory sf = conf.buildSessionFactory();
       Session session = sf.openSession();
       Transaction trans = session.beginTransaction();
       session.persist(theUser);
       trans.commit();
       System.out.println("User info inserted successfully");
       session.close();
    }
}