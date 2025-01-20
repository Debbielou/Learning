package profileWithConfig;


public class PayPal implements PaymentGateway {

	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " " + "through paypal.");
		
	}

}
