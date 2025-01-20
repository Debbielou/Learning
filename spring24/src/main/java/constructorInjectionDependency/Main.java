package constructorInjectionDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import inversionOfControlXml.School;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("school.xml");

        Person person = (Person) context.getBean("person");
        System.out.println(person);
       
        
	}

}
