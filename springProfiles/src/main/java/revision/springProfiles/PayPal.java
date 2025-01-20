package revision.springProfiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("payPal")
public class PayPal implements PaymentGateway {

	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " " + "through paypal.");
		
	}

}
