package spring.sringAutoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


 public class App {

    public static void main( String[] args ){
    
    	ApplicationContext context = new ClassPathXmlApplicationContext("debbie.xml");
    	
    	Human person = context.getBean("human",Human.class);
    	System.out.println(person);
    	person.startPumping();
    	
    	((ClassPathXmlApplicationContext) context).close(); 
    	       
    }
}
