package scheduleAtFixedDelay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PayRollTester {

	public static void main(String[] args) {
		
  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PayRollConfing.class); // The TaskScheduler bean will be automatically picked up and scheduled // No need to manually retrieve the bean // Keep the application running to observe the scheduled task 
  
  PayRollScheduler payRoll = context.getBean(PayRollScheduler.class);
  payRoll.scheduleFixedDelayTask();
  
  try { Thread.sleep(5000); // Run for 5 seconds
  } catch (InterruptedException e) { e.printStackTrace(); 
  } 
  context.close();
  }
  
	}
	

