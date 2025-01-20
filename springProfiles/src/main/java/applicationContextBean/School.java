package applicationContextBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class School {
	
	@Autowired
	private ApplicationContext applicationContext;
	
	public ApplicationContext getApplicationContext() {
		System.out.println("Application context has been created.");
		return applicationContext;
	}

}
