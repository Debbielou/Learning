package hibernateRevision.hibernateDebzRevision;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@EntityListeners(EventListener.class)
@Entity
public class ViennaEmployees {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int staffID;
	String firstName;
	@Transient
	String fullName;
	@Temporal(TemporalType.DATE)
	Date employmentDate;
	String department;
	

	public ViennaEmployees(String firstName, String fullName, Date employmentDate, String department) {
		this.firstName = firstName;
		this.fullName = fullName;
		this.employmentDate = employmentDate;
		this.department = department;
	}

	public int getStaffID() {
		return staffID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getEmploymentDate() {
		return employmentDate;
	}

	public void setEmploymentDate(Date employmentDate) {
		this.employmentDate = employmentDate;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	

	}


