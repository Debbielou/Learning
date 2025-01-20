package spring.springCoreAnnotations;

import org.springframework.context.annotation.Primary;

@Primary
public class ScienceTeacher implements Teacher{

	@Override
	public void teach() {
		System.out.println("Welcome your science teacher.");
		
	}

	@Override
	public void reportCard() {
		System.out.println("Science marks are missing.");
		
	}

}
