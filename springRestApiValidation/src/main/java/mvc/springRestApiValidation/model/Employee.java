package mvc.springRestApiValidation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "Abakozi")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
    @NotEmpty(message = "First name is required") @Size(min = 4, message = "First name must be at least 4 characters long")
	String firstName;
    @NotEmpty(message = "Last name is required") @Size(min = 6, message = "Last name must be at least 6 characters long")
	String lastName;
	@NotEmpty(message = "Email is required") @Pattern(regexp = ".+@.+\\..+", message = "Invalid email format")
	String email;
	@Min(value = 50000, message = "Salary must be above 50000")
	int salary;
	@Size(min = 3, message = "Department should be atleast 3 characters" )
	String department;
	
	public Employee() {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	
	

}
