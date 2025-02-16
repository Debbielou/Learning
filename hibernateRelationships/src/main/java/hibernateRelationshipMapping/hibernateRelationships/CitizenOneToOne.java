package hibernateRelationshipMapping.hibernateRelationships;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "citizen")
public class CitizenOneToOne {
	
	@Id
    @Column(name = "citizen-number")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String nationality;

    @OneToOne(mappedBy = "citizen", cascade = CascadeType.ALL)// shows who's the master of the relationship
    private PassportOneToOne passport;

    public CitizenOneToOne() {
    }

    public CitizenOneToOne(String name, String nationality, PassportOneToOne passport) {
        this.name = name;
        this.nationality = nationality;
        this.passport = passport;
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

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public PassportOneToOne getPassport() {
        return passport;
    }

    public void setPassport(PassportOneToOne passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "CitizenOneToOne [id=" + id + ", name=" + name + ", nationality=" + nationality + ", passport=" + passport + "]";
    }
}

