package hibernateRelationshipMapping.hibernateRelationships;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "passport")
public class PassportOneToOne {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String passportNumber;
    private String colour;
    
    @OneToOne
    @JoinColumn(name = "citizen_id")// shows the foreign key in this class
    private CitizenOneToOne citizen;

    public PassportOneToOne() {
    }

    public PassportOneToOne(String passportNumber, String colour, CitizenOneToOne citizen) {
        this.passportNumber = passportNumber;
        this.colour = colour;
        this.citizen = citizen;
    }

    public int getId() {
        return id;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public CitizenOneToOne getCitizen() {
        return citizen;
    }

    public void setCitizen(CitizenOneToOne citizen) {
        this.citizen = citizen;
    }

    @Override
    public String toString() {
        return "PassportOneToOne [id=" + id + ", passportNumber=" + passportNumber + ", colour=" + colour + ", citizen=" + citizen + "]";
    }
}
