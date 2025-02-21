package mvc.springMvcDatabase.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Employee_Id")
	private Integer employeeId;

	@Column(name = "FirstName")
	private String firstName;

	@Column(name = "LastName")
	private String lastName;

	@Column(name = "Age")
	private Integer age;

	@Column(name = "Education")
	private String education;

	@Column(name = "Salary")
	private Double salary;

	public Employee() {
	}

	public Employee(String firstName, String lastName, Integer age, String education, Double salary) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.education = education;
		this.salary = salary;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeId:" + employeeId + ", FirstName:" + firstName + ", LastName:" + lastName + ", Age:"
				+ age + ", Education:" + education + ", Salary:" + salary;
	}
	
	
}
