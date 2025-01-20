package spring.debz.springScheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CronSchedule {
	
	@Scheduled(cron = "0 30 07 30 * ?", zone = "Africa/Nairobi")//sec,min,hr,dayofmonth,month,dayofweek
	public void scheduleTaskUsingCronExpression() {
	 
	    long now = System.currentTimeMillis() / 1000;
	    System.out.println(
	      "schedule tasks using cron jobs - " + now);
	}

}
