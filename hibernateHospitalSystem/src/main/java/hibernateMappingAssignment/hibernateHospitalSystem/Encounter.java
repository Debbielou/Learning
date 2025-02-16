package hibernateMappingAssignment.hibernateHospitalSystem;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Encounter {

    @Id
    @Column(name="encounter_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @ManyToMany
    @JoinTable(
        name = "visit_encounter",
        joinColumns = @JoinColumn(name = "encounter_id"),
        inverseJoinColumns = @JoinColumn(name = "visit_id")
    )
    private Set<Visit> visits = new HashSet<>();

    public Encounter() {}

   
    public Encounter(String description, Set<Visit> visits) {
		this.description = description;
		this.visits = visits;
	}


    public Long getId() {
        return id;
    }
    
   
	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Visit> getVisits() {
        return visits;
    }

    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }

    @Override
    public String toString() {
        return "EncounterId: " + id + ", Description: " + description + ", Visits: " + visits;
    }
}
