package scheduleAtFixedDelay;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PayRollScheduler {
	
	@Scheduled(fixedDelay = 5000) 
	public void scheduleFixedDelayTask() { 
		
		long currentTimeMillis = System.currentTimeMillis();

        // Convert to seconds
        long currentTimeSeconds = currentTimeMillis / 1000;

        // Convert to Instant
        Instant instant = Instant.ofEpochSecond(currentTimeSeconds);

        // Convert to East African Time (EAT)
        ZoneId eatZoneId = ZoneId.of("Africa/Nairobi"); // EAT is represented by Nairobi
        ZonedDateTime eatTime = instant.atZone(eatZoneId);

        // Get the hour in EAT
        int hourInEAT = eatTime.getSecond();

        System.out.println("Fixed delay task is " + hourInEAT + "seconds.");
    }
		
}
