package spring.springAOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@EnableAspectJAutoProxy 
@ComponentScan("spring.springAOP") 
public class App {

    public static void main( String[] args ){
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class); 
    	
//    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");

         MyService service = context.getBean(MyService.class);
         service.doSomething(); 
         context.close();
         
//         Customer customer = context.getBean(Customer.class);
//         customer.orderFood("Debbie");
//         customer.setName("Deborah Nanfuka");
//         System.out.println(customer.getName());
//         context.close();
         
         
    }
}
