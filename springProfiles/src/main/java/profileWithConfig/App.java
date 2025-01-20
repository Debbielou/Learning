package profileWithConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ){
    	
    	   	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
    	context.getEnvironment().setActiveProfiles("paypal");
    	context.register(GatewayConfig.class);
    	context.refresh(); // this reloads the application context to create anly the specified bean
    	context.getBean(GatewayProcessor.class).makePayment(20000);
    	
    	context.close();
    
    }
}
