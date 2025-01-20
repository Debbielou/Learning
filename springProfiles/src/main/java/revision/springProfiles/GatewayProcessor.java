package revision.springProfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GatewayProcessor {
	
	@Autowired
	PaymentGateway payment;
	
	public void makePayment(int amount) {
		payment.pay(amount);
	}

}
