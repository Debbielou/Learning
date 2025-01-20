package fieldBasedInjectionDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component// tells spring that this is a componet that should be managed by the spring container
public class OrderService {

	@Autowired
    private InventoryService inventoryService;

    @Autowired
    private PaymentService paymentService;
    
    

    public void placeOrder(Order order) {
    	
                if (inventoryService.isItemInStock(order.getItemId())) {
           
            paymentService.processPayment(order.getPaymentDetails());

           
        } else {
            System.out.println("Out of stock!");
        }
    }
}

