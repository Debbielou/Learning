package revision.springAssignment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

    public static void main( String[] args ){
    
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserServiceConfig.class);//creating IOC container
    	UserServiceImplementation service1 = context.getBean(UserServiceImplementation.class);
    	UserServiceImplementation service2 = context.getBean(UserServiceImplementation.class);
//    	System.out.println(service1.equals(service2));
    	service1.checkUsers();
    	context.close();
    }
}
