package valueWithCollections;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    
	private String studentName; 
	private School school; 
	
	public Student(@Value("${student.names}") String studentName) { 
		this.studentName = studentName; 
		} 
	
	
	public void setSchool(School school) {
		this.school = school;
	}
   
	
	public School getSchool() {
		return school;
	}


	public void testStudents() { 
	System.out.println(studentName + " is going to sit for UNEB this year."); 
		}

	
	
	}