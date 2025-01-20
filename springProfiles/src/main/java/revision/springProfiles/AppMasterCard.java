package revision.springProfiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMasterCard {

    public static void main( String[] args ){
    	
    	//Testing singleton & use of @Primary
//    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GatewayConfig.class);
//    	GatewayProcessor processor = context.getBean(GatewayProcessor.class);
//    	processor.makePayment(20000);
//    	context.close();
    	
    	//Testing @Profile
//    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//     	context.getEnvironment().setActiveProfiles("momo");
    	context.register(GatewayConfig.class);
    	context.refresh(); // this reloads the application context to create anly the specified bean
    	context.getBean(GatewayProcessor.class).makePayment(20000);
    	
    	context.close();
    
    }
}
