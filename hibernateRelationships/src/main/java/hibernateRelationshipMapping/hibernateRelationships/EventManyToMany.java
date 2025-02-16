package hibernateRelationshipMapping.hibernateRelationships;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "event")
public class EventManyToMany {
	
	@Id
	@Column(name = "event_id")
	private int id;
	@Column(name = "event_name")
	private String name;
	private String attendee;
	
	@ManyToMany
    @JoinTable(name = "delegate_event",
        joinColumns = @JoinColumn(name = "event_id"),
        inverseJoinColumns = @JoinColumn(name = "delegate_id"))
	private List<DelegateManyToMany>delegate;

	public EventManyToMany() {
	}

	public EventManyToMany(int id, String name, String attendee, List<DelegateManyToMany> delegate) {
		this.id = id;
		this.name = name;
		this.attendee = attendee;
		this.delegate = delegate;
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

	public String getAttendee() {
		return attendee;
	}

	public void setAttendee(String attendee) {
		this.attendee = attendee;
	}
	
	public List<DelegateManyToMany> getDelegate() {
		return delegate;
	}

	public void setDelegate(List<DelegateManyToMany> delegate) {
		this.delegate = delegate;
	}

	@Override
	public String toString() {
		return "EventManyToMany [id=" + id + ", name=" + name + ", attendee=" + attendee + ", delegate=" + delegate
				+ "]";
	}
	
	

}
