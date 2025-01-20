package spring.springCoreAnnotations;

import org.springframework.stereotype.Component;

@Component
public class MathTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("I am your maths teacher.");
		
	}

	@Override
	public void reportCard() {
		System.out.println("Report cards are ready.");
		
	}
	
	

}
