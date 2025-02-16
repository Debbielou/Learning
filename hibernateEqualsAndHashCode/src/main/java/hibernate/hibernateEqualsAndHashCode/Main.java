package hibernate.hibernateEqualsAndHashCode;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	private static SessionFactory sf;
	private static Session ses;
    private static Transaction trans;
    
    public Main() {
    	sf = new Configuration()
                .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/madfa_supermarket")
                .setProperty("hibernate.connection.username", "root")
                .setProperty("hibernate.connection.password", "Debbie@2024%")
                .configure("hibernate.cfg.xml") 
                .buildSessionFactory();

        ses = sf.openSession();
        trans = ses.beginTransaction();
        
    }
    
    
	public static void main(String[] args) {
		
		Main main = new Main();
		Set<Orders> orders = new HashSet<>(); 

		Person person = new Person(3, "Esther Kalungi", orders); 
		Person personQ = new Person(4, "Esther Kalungi", orders);

		// Create Order objects and associate them with the person (as before)
		Orders order1 = new Orders();
		order1.setId(400);
		order1.setProductName("Soda");
		order1.setPerson(personQ);

		Orders order2 = new Orders();
		order2.setId(401);
		order2.setProductName("Cakes");
		order2.setPerson(personQ);
		
		Orders order3 = new Orders();
		order3.setId(402);
		order3.setProductName("Soda");
		order3.setPerson(personQ);
		
		Orders order4 = new Orders();
		order4.setId(403);
		order4.setProductName("Soap");
		order4.setPerson(personQ);

		// Add the orders to the person's set of orders (as before)
		personQ.addOrder(order1);
		personQ.addOrder(order2);
		personQ.addOrder(order3);
		personQ.addOrder(order4);

//		System.out.println(person.getOrders().size());
				
		Main.ses.persist(personQ);
		Main.trans.commit();
		ses.close();
		sf.close();
		

	}

}
