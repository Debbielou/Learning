package spring.springAOP;

import org.springframework.stereotype.Component;

@Component
public class MyService {
	
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



	public void doSomething() {
        System.out.println("Revising AOP so that the teacher doesnt beat me.");
    }

}
