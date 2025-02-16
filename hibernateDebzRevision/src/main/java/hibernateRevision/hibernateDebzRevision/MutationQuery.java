package hibernateRevision.hibernateDebzRevision;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;
import jakarta.persistence.Version;

@Entity
public class MutationQuery {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String firstName;
	private String lastName;
	@Transient
	private String middleName;
	private int age;
	@Column(name = "email", nullable = false, length = 20)
	private String emailAddress;
	@Version
    private int version;



	public MutationQuery() {
	}

	public MutationQuery(String firstName, String lastName, String middleName, int age, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.age = age;
		this.emailAddress = emailAddress;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "id: " + id + ", firstName: " + firstName + ", lastName: " + lastName + ", middleName: "
				+ middleName + ", age: " + age + ", emailAddress: " + emailAddress;
	}
	
	public void prePersist() {
		System.out.println("Okikubye");
	}
	
		public static void main(String[] args) {
		
//		  MutationQuery mtq = new MutationQuery("Marky", "Kimbugwe", "William", 38, "williek@gmail.com");
//	      Configuration conf = new Configuration();
//	      conf.configure("hibernate.cfg.xml");
//	      SessionFactory sf = conf.buildSessionFactory();
//	      Session session = sf.openSession();
//	      Transaction transaction = session.beginTransaction();
//	      session.persist(mtq);
//	      transaction.commit();
//	      session.close();
	

	
		}

}
