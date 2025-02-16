package hibernate.DoctorRegistration;

import java.io.Serializable;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Size;


@Entity
@NamedQuery(name = "Doctor.findBySpecialization", query = "FROM Doctor d WHERE d.specialization = :specialization")
//@Table(uniqueConstraints = { @UniqueConstraint(name = "UniqueLicenseAndContact", 
//columnNames = { "licenseNumber", "contactNumber" }) })
public class Doctor implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		private int id;
		
		@Column(name = "doctor_name")
		@Size(min = 3, max = 100)
		private String name;
		@Size(min = 5, max = 50)
		private String specialization;
		@NotNull
		@Length(min = 10, max = 10)
		@Column(unique=true)
		private String licenseNumber;
		@Null
		private int yearsOfExperience;
		@NotNull
		@Length(min = 15, max = 15)
		private String contactNumber;
		
		public Doctor() {
		}

				
		public Doctor(int id, @Size(min = 3, max = 100) String name, @Size(min = 5, max = 50) String specialization,
				@NotNull @Length(min = 10, max = 10) String licenseNumber, @Null int yearsOfExperience,
				@NotNull @Length(min = 15, max = 15) String contactNumber) {
			this.id = id;
			this.name = name;
			this.specialization = specialization;
			this.licenseNumber = licenseNumber;
			this.yearsOfExperience = yearsOfExperience;
			this.contactNumber = contactNumber;
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

		public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}

		public String getLicenseNumber() {
			return licenseNumber;
		}

		public void setLicenseNumber(String licenseNumber) {
			this.licenseNumber = licenseNumber;
		}

		public int getYearsOfExperience() {
			return yearsOfExperience;
		}

		public void setYearsOfExperience(int yearsOfExperience) {
			this.yearsOfExperience = yearsOfExperience;
		}

		public String getContactNumber() {
			return contactNumber;
		}

		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		
		@Override
		public boolean equals(Object o) {
		    if (this == o) return true;
		    if (o == null || getClass() != o.getClass()) return false;
		    Doctor doctor = (Doctor) o;

		    // Use id for equality check 
		    return id == doctor.id;
		}

		@Override
		public int hashCode() {
		    // Use id for hash code calculation
		    return Integer.hashCode(id); 
		}

		@Override
		public String toString() {
			return "DoctorId: " + id + ", DoctorName: " + name + ", "
					+ "Specialization: " + specialization + ","+ " LicenseNumber:"+ licenseNumber + ","
					+ " YearsOfExperience=" + yearsOfExperience + ", contactNumber=" + contactNumber;
		}
		
		

}
