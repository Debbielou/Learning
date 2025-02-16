package hibernateRelationshipMapping.hibernateRelationships;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student")
public class StudentManyToMany {
    
	@Id
	@Column(name = "student_id")
	private int id;
	private String studentName;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "student_course",
	joinColumns = @JoinColumn(name = "student_id"),
    inverseJoinColumns = @JoinColumn(name = "course_id"))	
	private Set<CourseManyToMany>courses = new HashSet();

	public StudentManyToMany() {
	}


	public StudentManyToMany(int id, String studentName, Set<CourseManyToMany> courses) {
		this.id = id;
		this.studentName = studentName;
		this.courses = courses;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	

	public Set<CourseManyToMany> getCourses() {
		return courses;
	}


	public void setCourses(Set<CourseManyToMany> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "StudentManyToMany [id=" + id + ", studentName=" + studentName + ", courses=" + courses + "]";
	}
	
	
}
