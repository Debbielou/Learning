package hibernateLesson.hibernateEmbeddables;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       
    	AlienName aln = new AlienName();
    	aln.setFname("Monkey");
    	aln.setLname("Twist");
    	
       Aliens al = new Aliens();
       al.setAid(01);
       al.setAname(aln);
       al.setColour("Black");

       Configuration conf = new Configuration();
       conf.configure("hibernate.cfg.xml");
       SessionFactory sef = conf.buildSessionFactory();
       Session session = sef.openSession();
       Transaction transaction = session.beginTransaction();

       session.persist(al);

       transaction.commit();

       
       session.close();
    }
}
