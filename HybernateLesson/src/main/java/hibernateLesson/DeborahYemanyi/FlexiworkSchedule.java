package hibernateLesson.DeborahYemanyi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class FlexiworkSchedule {
	
	@Id
	private int id;
	private String name;
	private int salary;
	@Enumerated(EnumType.STRING)
	private Workdays day;

	public FlexiworkSchedule() {
		
	}
	
		public FlexiworkSchedule(int id, String name, int salary, Workdays day) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.day = day;
	}

	public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
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

		public Workdays getDay() {
			return day;
		}

		public void setDay(Workdays day) {
			this.day = day;
		}
		

	@Override
		public String toString() {
			return "FlexiworkSchedule [id=" + id + ", name=" + name + ", salary=" + salary + ", day=" + day + "]";
		}

	public static void main(String[] args) {
		
		FlexiworkSchedule flexi = new FlexiworkSchedule(133513, "Deborah", 10000, Workdays.TUESDAY);
		Configuration conf = new Configuration();
        conf.configure("hibernate.cfg.xml");
        SessionFactory sef = conf.buildSessionFactory();
        Session session = sef.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(flexi);
        transaction.commit();
        System.out.println("Table created successfully");
        session.close();;
        
		

	}

}
