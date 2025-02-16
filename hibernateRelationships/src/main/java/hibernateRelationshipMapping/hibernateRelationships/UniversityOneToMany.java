package hibernateRelationshipMapping.hibernateRelationships;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "university")
public class UniversityOneToMany {
	
	@Id
	@Column(name = "university_id")
	private int id;
	private String name;
	private String location;
	
	@OneToMany(mappedBy = "university", cascade = CascadeType.ALL)
	private List<DepartmentManyToOne> department;
	
	public UniversityOneToMany() {
		
	}

	
	public UniversityOneToMany(int id, String name, String location, List<DepartmentManyToOne> department) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.department = department;
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


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public List<DepartmentManyToOne> getDepartment() {
		return department;
	}


	public void setDepartment(List<DepartmentManyToOne> department) {
		this.department = department;
	}


//	public void setDepartments(List<DepartmentManyToOne> departments) {
//		
//		
//	}

	@Override
	public String toString() {
		return "UniversityOneToMany [id=" + id + ", name=" + name + ", location=" + location + "]";
	}



}
