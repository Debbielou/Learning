package fieldBasedInjectionDependency;

import org.springframework.stereotype.Component;

@Component
public class InventoryService {

	 public boolean isItemInStock(String itemId) {
	        
	        return true; 
	    }
	}

