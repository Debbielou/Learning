package hibernetRevision.hibernetCrudOperation;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Student {
	
    @Id
	private int studentID;
    @Column(name = "Student_name")
	private String name;
	private String course;
	private int tuition;
	
	
	public Student(int studentID, String name, String course, int tuition) {
		this.studentID = studentID;
		this.name = name;
		this.course = course;
		this.tuition = tuition;
	}

	public Student() {
       
	}
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getTuition() {
		return tuition;
	}

	public void setTuition(int tuition) {
		this.tuition = tuition;
	}

	@Override
	public String toString() {
		return "studentID:" + studentID + ", name:" + name + ""
				+ ", course:" + course + ", tuition:" + tuition
				;
	}

        
        }
    

	
	
	

