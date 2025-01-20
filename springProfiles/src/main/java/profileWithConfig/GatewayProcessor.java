package profileWithConfig;


public class GatewayProcessor {
	
	
	PaymentGateway payment;
	
	
	public GatewayProcessor(PaymentGateway payment) {
		this.payment = payment;
	}


	public void makePayment(int amount) {
		payment.pay(amount);
	}

}
