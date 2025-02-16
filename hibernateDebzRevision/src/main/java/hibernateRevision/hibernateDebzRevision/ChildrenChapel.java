package hibernateRevision.hibernateDebzRevision;

import java.time.LocalDate;
import java.time.Period;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "KCC_Children")
public class ChildrenChapel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String firstName;
	private String lastName;
	private String fullName;
	private LocalDate dateOfBirth;
	private int age;

	public ChildrenChapel() {
		
	}

	public ChildrenChapel(String firstName, String lastName, String fullName, LocalDate dateOfBirth, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.setFullName();
		this.setAge();
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		this.setFullName();
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		this.setFullName();
	}

	public String getFullName() {
		return fullName;
		
	}

	public void setFullName() {
		this.fullName = this.firstName + " " + this.lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {	
		this.dateOfBirth = dateOfBirth;
		this.setAge();
	}

	public int getAge() {
		return age;
	}

	public void setAge() {
		LocalDate now = LocalDate.now();
        this.age = Period.between(this.dateOfBirth, now).getYears();
		
	}
	

	public static void main(String[] args) {
		
		ChildrenChapel cp = new ChildrenChapel();
		cp.setFirstName("Ethel");
		cp.setLastName("Malaika");
		cp.setDateOfBirth(LocalDate.of(2012,02,04));
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(cp);
		transaction.commit();
		session.close();
	}

}
