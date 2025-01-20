package fieldBasedInjectionDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Store {
	
	String orderName;
	int orderId;
	
	@Autowired
	private ItemStore itemStore;
	
	public void payForItem() {
	itemStore.orderItem();

}
}