package profileWithJvm;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "profileWithJvm")
public class MasterCardTester {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MasterCardTester.class);
		MasterCard masterCard = context.getBean(MasterCard.class);
		masterCard.makePayment();

	}

}
