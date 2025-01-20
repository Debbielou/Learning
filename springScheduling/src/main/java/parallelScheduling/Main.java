package parallelScheduling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);     
         TaskScheduler scheduler = context.getBean(TaskScheduler.class); 

        // Keep the main thread alive to allow scheduled tasks to run
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

	}

}
