package revision.springProfiles;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary //this annotation solves 'no unique bean exception'.
@Profile("momo")
public class MobileMoney implements PaymentGateway {

	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " " + "through mobilemoney.");
		
	}
 
	
}
