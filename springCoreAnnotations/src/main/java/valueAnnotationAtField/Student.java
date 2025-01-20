package valueAnnotationAtField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Student {
    
	@Value("Deborah Nakamatte")
	private String studentName;
	
	@Value("20")
	private String studentAge;
	
	@Autowired
	private School school;
	
	
	public void testStudents() {
		school.setExams();
		System.out.println(studentName + " of age " + studentAge + " is going to sit for UNEB this year.");
	}

	
	
	
}
