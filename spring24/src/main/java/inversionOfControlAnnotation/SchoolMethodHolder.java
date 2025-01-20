package inversionOfControlAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SchoolMethodHolder {
	
	@Bean
	public School goToSchool(){
		return new School();
	}
	
	@Bean
	public Customer getCustomer() {
		return new Customer();
	}

}
