package revision.springScopeSingleton;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


public class Student {

	
private int age;

			
	public Student() {
 }

	public Student(int age) {
	this.age = age;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	}


