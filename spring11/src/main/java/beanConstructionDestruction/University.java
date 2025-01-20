package beanConstructionDestruction;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class University {
	
	private String name;
	
	
	public University() {
	System.out.println("I am testing postconstructs & predestroy.");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@PostConstruct
	public void doExams() {
		System.out.println("The exam period has started.");
		}
	
	@PreDestroy
	public void destroyingBean() {
		System.out.println("Sooka olindeko.");
		
	}

}
