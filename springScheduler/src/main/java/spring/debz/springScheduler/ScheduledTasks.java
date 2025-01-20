package spring.debz.springScheduler;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {
	
	// Fixed Rate Task
    @Scheduled(fixedRate = 10000) // Runs every 1 minute
    public void fixedRateTask() {
        System.out.println("Fixed rate task executed at: " + System.currentTimeMillis() / 1000);
    }

    // Fixed Delay Task
    @Scheduled(fixedDelay = 10000) // Runs 1 minute after the previous task finishes
    public void fixedDelayTask() {
        System.out.println("Fixed delay task executed at: " + System.currentTimeMillis() / 1000);
        try {
            Thread.sleep(5000); // Simulate task taking 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Fixed Rate with Initial Delay
    @Scheduled(fixedRate = 10000, initialDelay = 10000) 
    public void fixedRateWithInitialDelayTask() {
        System.out.println("Fixed rate with initial delay task executed at: " + System.currentTimeMillis() / 1000);
    }

    // Cron Expression
    @Scheduled(cron = "0 24 * * * ?") // Runs at the 24th minute of every hour
    public void cronTask() {
        System.out.println("Cron task executed at: " + System.currentTimeMillis() / 1000);
    }
}


