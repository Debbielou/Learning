package valueAnnotationWithFile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTester {

	public static void main(String[] args) {
		
	   	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
	   	Student musomi = context.getBean("student", Student.class);
	   	System.out.println(musomi);
	   	musomi.testStudents();
	   	
	   	context.close();

	}

}
