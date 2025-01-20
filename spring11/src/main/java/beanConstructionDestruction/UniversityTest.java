package beanConstructionDestruction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;



@Configuration
@ComponentScan
public class UniversityTest {

	public static void main(String[] args) {
		
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UniversityTest.class); 
	    University uni = context.getBean(University.class);
//	    uni.doExams();
	    context.close();
	    
	}

}
