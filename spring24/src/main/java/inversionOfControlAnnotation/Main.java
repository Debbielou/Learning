package inversionOfControlAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationContext = new AnnotationConfigApplicationContext();

        // Register the configuration class
        annotationContext.register(SchoolMethodHolder.class);
        
        // Refresh the context to load the beans
        annotationContext.refresh();

        // Retrieve the bean and use it
        School mySchool = annotationContext.getBean(School.class);
        mySchool.driveCar();
        System.out.println(mySchool.getGender());
        
     // Retrieve the bean and use it
        Customer myCustomer = annotationContext.getBean(Customer.class);
        System.out.println(myCustomer.addNumbers());
        

        // Close the context to release resources
        annotationContext.close();
	}

}
