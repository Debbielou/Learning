package hibernateLesson.DeborahYemanyi;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Alien myThing = new Alien(1,"kk", "ghjgjh");
   
    	
    	Configuration conf = new Configuration().configure();
    	SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
//    	session.persist(myThing);
        myThing = session.get(Alien.class, 1);
    	transaction.commit();
//    	session.close();
    	System.out.println(myThing);
    }
}
