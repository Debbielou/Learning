package hibernateRelationshipMapping.hibernateRelationships;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "course")
public class CourseManyToMany {
	
	@Id
	@Column(name = "course_id")
	private int id;
	private String name;
	private String department;
	
	@ManyToMany (mappedBy = "courses")
	private Set<StudentManyToMany>students = new HashSet();

	public CourseManyToMany() {
	}

	public CourseManyToMany(int id, String name, String department, Set<StudentManyToMany> students) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.students = students;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	

	public Set<StudentManyToMany> getStudents() {
		return students;
	}

	public void setStudents(Set<StudentManyToMany> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "CourseManyToMany [id=" + id + ", name=" + name + ", department=" + department + ", students=" + students
				+ "]";
	}
	
	
	
	

}
