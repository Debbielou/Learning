package revision.springProfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("flexi")
public class Flexipay implements PaymentGateway {

	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " " + "through Flexipay.");
	}

}
