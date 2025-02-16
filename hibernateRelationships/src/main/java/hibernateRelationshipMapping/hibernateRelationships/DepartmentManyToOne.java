package hibernateRelationshipMapping.hibernateRelationships;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "department")
public class DepartmentManyToOne {
	
	@Id
	@Column(name = "department_id")
	private int id;
	private int numberOfStudents;
	private String departmentName;
	
	@ManyToOne
	@JoinColumn(name = "university_id")
	private UniversityOneToMany university;

	public DepartmentManyToOne() {
	}

	public DepartmentManyToOne(int id, int numberOfStudents, String departmentName, UniversityOneToMany university) {
		this.id = id;
		this.numberOfStudents = numberOfStudents;
		this.departmentName = departmentName;
		this.university = university;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public UniversityOneToMany getUniversity() {
		return university;
	}

	public void setUniversity(UniversityOneToMany university) {
		this.university = university;
	}

	@Override
	public String toString() {
		return "DepartmentManyToOne [id=" + id + ", numberOfStudents=" + numberOfStudents + ", departmentName="
				+ departmentName + ", university=" + university + "]";
	}
	
	

}
