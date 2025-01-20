package profileWithXml;


public class MobileMoney implements PaymentGateway {

	@Override
	public void pay(int amount) {
		System.out.println("Paying " + amount + " " + "through mobilemoney.");
		
	}
 
	
}
