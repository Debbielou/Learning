package hibernateLesson.DeborahYemanyi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name="Ebisolo")
public class Animals {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(name = "species")
	private String type;
	private String colour;
	

	public Animals(String name, String type, String colour) {
	
		this.name = name;
		this.type = type;
		this.colour = colour;
	}



	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}


	public static void main(String[] args) {
		
		Animals animo = new Animals("Cat", "Domestic", "White");
		
		Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        SessionFactory sef = conf.buildSessionFactory();
        Session session = sef.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(animo);

        transaction.commit();

        
        session.close();
		

	}

}
