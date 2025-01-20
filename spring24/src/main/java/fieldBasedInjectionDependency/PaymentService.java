package fieldBasedInjectionDependency;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {

	 public void processPayment(PaymentDetails paymentDetails) {
	      
	        System.out.println("Payment processed successfully!");
	    }
	}

