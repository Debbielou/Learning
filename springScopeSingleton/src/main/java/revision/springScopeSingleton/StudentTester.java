package revision.springScopeSingleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student stud1 = context.getBean("student1", Student.class);
		stud1.getAge();
        
		Student stud2 = context.getBean("student2", Student.class);
		stud2.getAge();
		
		System.out.println(stud1.equals(stud2));
		
	}

}
