package springAssignmentXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("assignment.xml");
		UserRepositoryImplementor users = context.getBean(UserRepositoryImplementor.class);
		System.out.println(context);
		users.addData();
		users.retrieveData();
		
		
	}

}
