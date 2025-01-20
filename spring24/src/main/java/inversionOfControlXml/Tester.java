package inversionOfControlXml;


import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("school.xml");

        School myService = (School) context.getBean("myService1");
//        System.out.println(myService.getLeftFoot());
         myService.greetMe();
         
      
       
	}

}
