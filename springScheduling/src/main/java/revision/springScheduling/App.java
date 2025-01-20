package revision.springScheduling;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main( String[] args ){
    
       
   AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BasicSchedulingConfig.class); 
    BasicScheduling schedule = context.getBean(BasicScheduling.class);
    schedule.reportCurrentTime();
       
        while (true) {
            try {
                Thread.sleep(5000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            context.close(); 
        }
    }
    }

