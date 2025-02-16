package hibernateLesson.DeborahYemanyi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Touchnot {

	public static void main(String[] args) {
    Alien myThing = new Alien(1,"kk", "ghjgjh");
    
 
    	
    	
    	Configuration conf = new Configuration().configure();
    	SessionFactory sf = conf.buildSessionFactory();
        Session session = sf.openSession();
    	session.persist(myThing);

	}

}
