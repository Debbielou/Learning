package hibernateLesson.hibernateEmbeddables;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aliens {
	
	@Id
	int aid;
	AlienName aname;
	String colour;
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	

	public AlienName getAname() {
		return aname;
	}
	public void setAname(AlienName aname) {
		this.aname = aname;
	}

	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Aliens [aid=" + aid + ", aname=" + aname + ", colour=" + colour + "]";
	}
	
	
	

}
