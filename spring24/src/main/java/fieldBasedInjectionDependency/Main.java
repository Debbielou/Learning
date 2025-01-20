package fieldBasedInjectionDependency;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	    public static void main(String[] args) {
	        // Create Spring context
	        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
	        context.scan("fieldBasedInjectionDependency"); 
	        context.refresh();

	        // Get OrderService bean
	        OrderService orderService = context.getBean(OrderService.class);

	        // Create an order
	        Order order = new Order("item123", new PaymentDetails("1234567890123456", "12/25", "123", 100.0));

	        // Place the order
	        orderService.placeOrder(order);

	        // Close the context
	        context.close();
	    }
	}
	