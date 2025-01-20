package revision.springScopeSingleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Autowired
	private Student student1;
	
	@Autowired
	private Student student2;
	
	public void testSingleton() {
		student1.setAge(20);
		System.out.println("The age for student 1 is " + student1.getAge());
		System.out.println("The age for student 2 is " + student2.getAge());
		
		student1.setAge(30);
		System.out.println("The age for student 1 is " + student1.getAge());
		System.out.println("The age for student 2 is " + student2.getAge());
	}
	
	
}