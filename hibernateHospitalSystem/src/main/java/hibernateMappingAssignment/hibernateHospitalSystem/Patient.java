package hibernateMappingAssignment.hibernateHospitalSystem;

import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Patient {
	
	@Id
	@Column(name = "patient_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String gender;
	private int age;
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
	private Set<Visit>visits = new HashSet<Visit>();
	
	
	public Patient(String name, String gender, int age, Set<Visit> visits) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.visits = visits;
	}

	
	public Patient() {
		
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public Set<Visit> getVisits() {
		return visits;
	}
	public void setVisits(Set<Visit> visits) {
		this.visits = visits;
	}
	@Override
	public String toString() {
		return "PatientId: " + id + ", Name: " + name + ", Gender: " + gender + ", Age: " + age +
				"Visit: " + visits; 
				 
	}
	
	

}
