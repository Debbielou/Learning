package profileAtBeanLevel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class GatewayProfileManager {
	
	@Autowired
	private Environment environment;
	
	public void getActiveProfiles() {
		for(String gatewayPayment : environment.getActiveProfiles()) {
			System.out.println("The active profile is " + gatewayPayment);
		}
		
	}

}
