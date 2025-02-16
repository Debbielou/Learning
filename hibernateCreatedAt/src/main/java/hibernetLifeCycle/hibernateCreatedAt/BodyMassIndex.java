package hibernetLifeCycle.hibernateCreatedAt;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BodyMassIndex {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int entryNumber;
	@Column(insertable = false)
	private double height;
	@Column(insertable = false)
	private int weight;
	private double bmi;
	

	public BodyMassIndex(double height, int weight, double bmi) {
		this.height = height;
		this.weight = weight;
		this.bmi = bmi;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getBmi() {
		return bmi;
	}


	public void setBmi() {
		this.bmi = weight / (height * height);
	}


	public BodyMassIndex() {
		
	}

	public static void main(String[] args) {
		BodyMassIndex bmi = new BodyMassIndex();
		bmi.setWeight(70);
		bmi.setHeight(140.48);
		
	  Configuration conf = new Configuration();
      conf.configure("hibernate.cfg.xml");
      SessionFactory sef = conf.buildSessionFactory();
      Session session = sef.openSession();
      Transaction transaction = session.beginTransaction();
      session.persist(bmi);
      transaction.commit();
      session.close();

	}

}
