package hibernateLesson.DeborahYemanyi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Abakozi_table")

public class Testing {

		@Id
		private int employeeId;
		private String firstName;
		private String lastName;
		private String email;
		
		
		public Testing(int employeeId, String firstName, String lastName, String email) {
		
			this.employeeId = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
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

		public static void main(String[] args) {
			  Testing emp = new Testing(1, "Debz", "Nakamatte", "debz@gmail.com");
			  Configuration conf = new Configuration();
			  conf.configure("hibernate.cfg.xml");
			  SessionFactory sef = conf.buildSessionFactory();
			  Session session= sef.openSession();
			  Transaction transaction = session.beginTransaction();  // Start the transaction
			  session.persist(emp);
			  transaction.commit();  // Commit the transaction
			  session.close();  // Close the session

		}

	}
