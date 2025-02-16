package hibernateLesson.DeborahYemanyi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		 	Configuration conf = new Configuration();
	        conf.configure("hibernate.cfg.xml");
	        SessionFactory sef = conf.buildSessionFactory();
	        Session session = sef.openSession();
	        Transaction transaction = session.beginTransaction();

	        List<Employees> entities = session.createQuery("from Employees",Employees.class).list();
	        System.out.println(entities);	       
	        transaction.commit();
	}

}
