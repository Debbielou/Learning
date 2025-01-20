package applicationContextBean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "applicationContextBean")
public class Main {

	public static void main(String[] args) {
		
//		School school = new School();
//		school.getApplicationContext();
//		System.out.println(school.getApplicationContext());
		
		ApplicationContextProvider acp = new ApplicationContextProvider();
		System.out.println(acp.getApplicationContext());

	}

}
