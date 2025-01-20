package valueWithSpEl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Student {
    
    @Value("${student.name:Default Student}")
    private String studentName;
    @Value("#{systemProperties['priority']}") 
    private String priority;
    @Value("#{systemProperties['unknown'] ?: 'some default'}")
    private String someDefault;

    @Autowired
    private School school;
    
    public void showPriority() {
    	System.out.println("Priority is " + priority);
    }

	public void setSchool(School school) {
		this.school = school;
	}



	public void testStudents() {
        school.setExams();
        System.out.println(studentName + " is going to sit for UNEB this year.");
        System.out.println("Priority: " + priority);
        System.out.println("Some Default: " + someDefault);
    }

	}

