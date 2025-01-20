package spring.springCoreAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ){
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
	    College somero =  context.getBean("collegeBean", College.class);
	     System.out.println("Object has been created" + somero);
	     somero.test();
	     
	     context.close();
    }
}
