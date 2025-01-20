package revision.springScheduling;

import org.springframework.scheduling.annotation.Scheduled;


public class BasicScheduling {
	
	@Scheduled(fixedRate = 5000) // Run every 5 seconds
    public void reportCurrentTime() {
        System.out.println("The time is now " + new java.util.Date());
    }

}
