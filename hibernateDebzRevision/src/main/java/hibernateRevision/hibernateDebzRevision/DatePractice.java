package hibernateRevision.hibernateDebzRevision;

import java.time.LocalDate;
import java.time.Period;

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
@Table(name = "Date_Time")
public class DatePractice {
		
	@Id
	@Column(name = "employee_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int salary;
	private String department;
	private LocalDate employmentDate;
	private int yearsOfService;


	public DatePractice(String name, int salary, String department, LocalDate employmentDate) {
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.employmentDate = employmentDate;
		this.setYearsOfService();
	}


	public DatePractice() {
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


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public LocalDate getEmploymentDate() {
		return employmentDate;
	}


	public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
        this.setYearsOfService();

	}


	public int getYearsOfService() {
		return yearsOfService;
		
	}


	public void setYearsOfService() {
		LocalDate now = LocalDate.now();
		this.yearsOfService = Period.between(this.employmentDate, now).getYears();
	}


	public static void main(String[] args) {
		
		DatePractice dp = new DatePractice();
		dp.setName("Stella Yobu");
		dp.setSalary(380000);
		dp.setDepartment("EBU");
		dp.setEmploymentDate(LocalDate.of(2000,05,15));
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.persist(dp);
		transaction.commit();
		session.close();
	}

}
