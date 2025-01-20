package spring.springParametizedSchedule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class App {

    public static void main(String[] args) {
    	
        ApplicationContext context = new ClassPathXmlApplicationContext("parameterized.xml");

        ParameterizedScheduledTasks tasks = context.getBean(ParameterizedScheduledTasks.class);
        tasks.cronTask();

        // Keep the application running to observe the scheduled task
        try {
            Thread.sleep(60000); // Run for 1 minute
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ((ClassPathXmlApplicationContext) context).close();
    }
}

