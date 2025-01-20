package profileAtBeanLevel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GatewayProcessor {
	
	@Autowired
	PaymentGateway payment;
	

	public void makePayment(int amount) {
		payment.pay(amount);
	}

}
