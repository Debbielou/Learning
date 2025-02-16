package hibernateRevision.hibernateDebzRevision;


import java.util.Date;

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
public class DefaultColumn {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int staffID;
	@Column(columnDefinition = "varchar(255) default 'John Snow'")
	String name;
	String department;
	
	
	public DefaultColumn(int staffID, String name, String department) {
		this.staffID = staffID;
		this.name = name;
		this.department = department;
	}
	
	
	public DefaultColumn() {
	}


	public int getStaffID() {
		return staffID;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public static void main(String[] args) {
		
		DefaultColumn dColumn = new DefaultColumn();
//		dColumn.setName("Jane Doe");
		dColumn.setDepartment("IT");
	      
	      Configuration config = new Configuration();
	      config.configure("hibernate.cfg.xml");
	      SessionFactory sf = config.buildSessionFactory();
	      Session ses = sf.openSession();
	      Transaction trans = ses.beginTransaction();
	      ses.persist(dColumn);
	      trans.commit();
	      ses.close();
	}

}
