package aopWildCard;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@EnableAspectJAutoProxy 
@ComponentScan("aopWildCard") 
public class Main {

	public static void main(String[] args) {
		
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Main.class); 
    	
//    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

    CustomerService cs = context.getBean(CustomerService.class);
    System.out.println(cs.getService().getId());
    context.close();

	}

}
