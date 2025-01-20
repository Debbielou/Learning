package fieldBasedInjectionDependency;

import org.springframework.stereotype.Service;

@Service
public class Item implements ItemStore{
	
	String itemName = "Rice";
	int itemId = 1;
	
	@Override
	public void orderItem() {
		System.out.println("Item order placed successfully");
	}

}
