package profileWithXml;


public class Flexipay implements PaymentGateway {

	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " " + "through Flexipay.");
	}

}
