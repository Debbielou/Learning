package valueWithDefault;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Student {
    
	@Value("${student.name:Swansabule}")
	private String studentName;
	
//	public Student(@Value("${student.name:Nakamatte}") String studentName) { 
//		this.studentName = studentName; 
//		}

	@Autowired
	private School school;
	
	
	public void testStudents() {
		school.setExams();
		System.out.println(studentName + " is going to sit for UNEB this year.");
		
	}

	
	
	
}
