package hibernateMappingAssignment.hibernateHospitalSystem;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Visit {
	
	@Id
	@Column(name = "visit_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String date;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;
	
    @ManyToMany(mappedBy = "visits")
	private Set<Encounter>encounters = new HashSet<Encounter>();

		public Visit(String date, Patient patient, Set<Encounter> encounters) {
		this.date = date;
		this.patient = patient;
		this.encounters = encounters;
	}

	public Visit() {
	}

	public int getId() {
		return id;
	}

		public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	

	public Set<Encounter> getEncounters() {
		return encounters;
	}

	
	public void setEncounter(Set<Encounter> encounters) {
		this.encounters = encounters;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Date: " + date + ", Patient: " + patient;
	}
	
	

}
