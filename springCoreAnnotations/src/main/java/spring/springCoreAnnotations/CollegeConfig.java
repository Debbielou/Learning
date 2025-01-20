package spring.springCoreAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "spring.springCoreAnnotations")
@PropertySource("classpath:college-info.properties")//this works like 'toString' method
public class CollegeConfig {
	

//	@Bean 
//	@Bean(name = "bugema")// override the method name
//	@Bean(name = {"bugema" ,"anotherCollege"})//assigning multiple names
//	public College collegeInfo() {
//  College college = new College(principalBean()); // method name works as the bean id. this uses a constructor injection
//		return college;
//	}

@Bean
public Principal principalBean() {
	return new Principal();
}
	public Teacher musomesa() {
		return new ScienceTeacher(); // we cant create objects of interfaces. We only return objects of implementing classes
	}


@Bean
public College collegeBean() { 
    College college = new College();
    college.setPrincipal(principalBean()); // Injecting Principal bean
    college.setTeacher(musomesa());
    return college;
}
}
