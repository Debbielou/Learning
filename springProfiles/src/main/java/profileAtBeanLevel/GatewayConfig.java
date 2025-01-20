package profileAtBeanLevel;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
public class GatewayConfig {

	
	@Bean
	@Profile("fexi")
	public Flexipay flexiPay() {
		return new Flexipay();
	}
	
	@Bean
	@Profile("momo")
	public MobileMoney mobileMoney() {
		return new MobileMoney();
	}
	
	@Bean
	@Profile("paypal")
	public PayPal payPal() {
		return new PayPal();
	}
	
}


