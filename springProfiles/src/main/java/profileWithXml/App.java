package profileWithXml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main( String[] args ){
    	  	
      System.setProperty("spring.profiles.active", "flexi"); 

      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("profile.xml");

      GatewayProcessor gatewayProcessor = context.getBean(GatewayProcessor.class);
      gatewayProcessor.makePayment(10000);

         context.close();
    
    }
}
