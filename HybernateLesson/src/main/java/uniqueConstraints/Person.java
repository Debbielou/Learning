package uniqueConstraints;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {
 @UniqueConstraint(name = "UniqueNumberAndStatus", columnNames = {"personNumber", "isActive"}),
 @UniqueConstraint(name = "UniqueSecurityAndDepartment", columnNames = {"securityNumber", "departmentCode"})})
public class Person implements Serializable {
		  
  private static final long serialVersionUID = 1L;
		@Id
	    @GeneratedValue
	    private int id;  
	    private String name;
	    private String password;
	    private String email;
	    private int personNumber;
	    private Boolean isActive;
	    private String securityNumber;
	    private String departmentCode;
	    
	    @ManyToOne(fetch = FetchType.LAZY) 
	    @JoinColumn(name = "address_id") // foreign key identification
	    private Address address;

		public Person() {
		}

		public Person(String name, String password, String email, int personNumber, Boolean isActive,
				String securityNumber, String departmentCode, Address address) {
			this.name = name;
			this.password = password;
			this.email = email;
			this.personNumber = personNumber;
			this.isActive = isActive;
			this.securityNumber = securityNumber;
			this.departmentCode = departmentCode;
			this.address = address;
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

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getPersonNumber() {
			return personNumber;
		}

		public void setPersonNumber(int personNumber) {
			this.personNumber = personNumber;
		}

		public Boolean getIsActive() {
			return isActive;
		}

		public void setIsActive(Boolean isActive) {
			this.isActive = isActive;
		}

		public String getSecurityNumber() {
			return securityNumber;
		}

		public void setSecurityNumber(String securityNumber) {
			this.securityNumber = securityNumber;
		}

		public String getDepartmentCode() {
			return departmentCode;
		}

		public void setDepartmentCode(String departmentCode) {
			this.departmentCode = departmentCode;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email
					+ ", personNumber=" + personNumber + ", isActive=" + isActive + ", securityNumber=" + securityNumber
					+ ", departmentCode=" + departmentCode + ", address=" + address + "]";
		}
	    
	    

}
