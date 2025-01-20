package spring.debz.springScheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        

//		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CronScheduleConfig.class);
//		 CronSchedule cron = context.getBean(CronSchedule.class);
//		 cron.scheduleTaskUsingCronExpression();
//		 context.close();
		
		
		 
//	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("debz.xml"); 
   AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class); 
		 
       ScheduledTasks scheduledTasks = context.getBean(ScheduledTasks.class);
//       scheduledTasks.fixedRateTask();
       scheduledTasks.cronTask();

        while (true) {
            try {
                Thread.sleep(60000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           
         
            context.close();
        }
	}
}
    

		 
	

