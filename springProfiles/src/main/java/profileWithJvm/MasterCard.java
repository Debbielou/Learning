package profileWithJvm;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class MasterCard {
	
	public void makePayment() {
		System.out.println("Pay through mastercard.");
	}

}
