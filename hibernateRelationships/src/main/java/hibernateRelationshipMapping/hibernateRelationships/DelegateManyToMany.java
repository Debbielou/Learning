package hibernateRelationshipMapping.hibernateRelationships;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "delegate")
public class DelegateManyToMany {
	
	@Id
	@Column(name = "delegate_id")
	private int id;
	private String name;
	
    @ManyToMany(mappedBy = "delegate")
	private List<EventManyToMany>event;

	public DelegateManyToMany() {
	}

	public DelegateManyToMany(int id, String name, List<EventManyToMany> event) {
		this.id = id;
		this.name = name;
		this.event = event;
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

	public List<EventManyToMany> getEvent() {
		return event;
	}

	public void setEvent(List<EventManyToMany> event) {
		this.event = event;
	}

	@Override
	public String toString() {
		return "DelegateManyToMany [id=" + id + ", name=" + name + ", event=" + event + "]";
	}
	
	
	
	

}
