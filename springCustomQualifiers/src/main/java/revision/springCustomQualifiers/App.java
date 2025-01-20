package revision.springCustomQualifiers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {

    public static void main( String[] args ){
    
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmploymentConfig.class);
      
    	// Implementation using ElementType.PARAMETER
   	EmploymentImpl impl = context.getBean(EmploymentImpl.class);
   	impl.checkEmployee("permanentJob");
   	System.out.println(impl.hashCode());
    
    	
    	//Implementation using ElementType.FIELD
//    	EmploymentImpl impl = context.getBean(EmploymentImpl.class);
//    	impl.checkEmployee();
//    	System.out.println(impl);
	     
	     context.close();
    }
}
