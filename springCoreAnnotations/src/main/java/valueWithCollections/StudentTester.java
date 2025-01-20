package valueWithCollections;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTester {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class); 
		Student[] students = context.getBean(Student[].class); 
		for (Student student : students) { 
			student.testStudents();
			} 
		context.close();
		} 
	}