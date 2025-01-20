package valueAnnotationWithFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Student {
    
	@Value("${student.Name}")
	private String studentName;
	
	@Value("${student.Age}")
	private int studentAge;
	
	@Autowired
	private School school;
	
	
	public void testStudents() {
		school.setExams();
		System.out.println(studentName + " is going to sit for UNEB this year at the age of " + studentAge + ".");
		
	}

	
	
	
}
