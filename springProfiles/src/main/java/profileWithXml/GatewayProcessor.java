package profileWithXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GatewayProcessor {
	
	
	PaymentGateway payment;
	
	@Autowired
	public GatewayProcessor(PaymentGateway payment) {
		this.payment = payment;
	}


	public void makePayment(int amount) {
		payment.pay(amount);
	}

}
