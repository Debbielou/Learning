package aopWildCard;

import org.springframework.stereotype.Component;

@Component
public class CustomerService {
	
	private Customer customer;
	private Service service;
	
	public CustomerService() { 
	this.customer = new Customer(); 
	this.service = new Service();
		}

	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Service getService() {
		return service;
	}
	public void setService(Service service) {
		this.service = service;
	}
}
	