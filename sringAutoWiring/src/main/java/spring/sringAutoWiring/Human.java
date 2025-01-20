package spring.sringAutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
    
	
	public Heart getHeart() {
		return heart;
	}
    
//	@Autowired
//	@Qualifier("octopusHeart")
//    public void setHeart(Heart heart) { // setter injection
//	this.heart = heart;
//	System.out.println("setter injection in use.");
//	}
	
//	@Autowired
//	public Human(Heart heart) { // constructor injection
//		this.heart = heart;
//	}
	
	
	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("Name of animal is " + heart.getNameOfAnimal());
		}else {
			System.out.println("Forget it!");
		}
		
	}
	
}
