package hibernateRevision.hibernateDebzRevision;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

		@SuppressWarnings("deprecation")
		public static void main(String[] args) {
		ViennaEmployees emp = new ViennaEmployees("Kalibobo", "Anthony Anguria", new Date("2022/05/31"), "IT");
	      
	      Configuration config = new Configuration();
	      config.configure("hibernate.cfg.xml");
	      SessionFactory sf = config.buildSessionFactory();
	      Session ses = sf.openSession();
	      Transaction trans = ses.beginTransaction();
	      ses.persist(emp);
	      trans.commit();
	      ses.close();
	      
	  	      
// UPDATE MUTATIONQUERY RAW
//	        MutationQuery mtq = new MutationQuery();
//	        Configuration conf = new Configuration();
//			conf.configure("hibernate.cfg.xml");
//			SessionFactory sf = conf.buildSessionFactory();
//			Session ses = sf.openSession();
//	        Transaction transaction = ses.beginTransaction();
//	        ses.get(MutationQuery.class, 202);
//	        if (mtq != null) {
//	            // Update the entity properties
//	            mtq.setAge(20);
//	            mtq.setEmailAddress("kasali@mtn.com");
//	            mtq.setFirstName("Cathy");
//	            mtq.setLastName("Nansereko");
//	            mtq.setMiddleName("Baibe");
	            // Persist the changes
//	            ses.update(mtq);
//	            transaction.commit();
//	            System.out.println("Record updated successfully");     
//	            ses.close();
	}
}
//}