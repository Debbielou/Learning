package hibernateLesson.DeborahYemanyi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employees {
	
	@Id
    private int employeeId;
    private String firstName;
    private String lastName;
    private String email;

  
    public Employees(int employeeId, String firstName, String lastName, String email) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    protected Employees() {
		
	}


	public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    @Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + "]";
	}


	public static void main(String[] args) {
        
        Employees emp = new Employees(2, "Tuta", "Nakalema", "tutaN@gmail.com");

        Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        SessionFactory sef = conf.buildSessionFactory();
        Session session = sef.openSession();
        Transaction transaction = session.beginTransaction();

//        session.persist(emp);
        emp = (Employees)session.get(Employees.class, 1);

        transaction.commit();

        System.out.println(emp);
//        session.close();
    }
}
