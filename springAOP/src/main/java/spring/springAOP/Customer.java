package spring.springAOP;

import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void orderFood(String name) {
		System.out.println("The customer called " + name + " " + "has ordered for chips.");
	}
	

}
