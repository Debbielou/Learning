package springAutoDependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HumanConfig.class);
    	
    	
	HumansImplementation humansImplementation = context.getBean(HumansImplementation.class);
    humansImplementation.heartBreak();

    context.close(); 

}
}