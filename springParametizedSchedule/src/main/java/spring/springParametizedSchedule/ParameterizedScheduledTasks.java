package spring.springParametizedSchedule;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ParameterizedScheduledTasks {

    @Value("${fixedDelay.in.milliseconds}")
    private String fixedDelay;

    @Value("${fixedRate.in.milliseconds}")
    private String fixedRate;

    @Value("${cron.expression}")
    private String cronExpression;

    @Scheduled(fixedDelayString = "${fixedDelay.in.milliseconds}")
    public void fixedDelayTask() {
    	 int seconds = LocalTime.now().getSecond(); 
        System.out.println("Fixed delay task with delay: " + fixedDelay + "-" + seconds);
    }

    @Scheduled(fixedRateString = "${fixedRate.in.milliseconds}")
    public void fixedRateTask() {
    	 int seconds = LocalTime.now().getSecond(); 
        System.out.println("Fixed rate task with rate: " + fixedRate + "-" + seconds);
    }

    @Scheduled(cron = "${cron.expression}")
    public void cronTask() {
    	 int seconds = LocalTime.now().getSecond(); 
        System.out.println("Cron task with expression: " + cronExpression + "-" + seconds);
    }
}