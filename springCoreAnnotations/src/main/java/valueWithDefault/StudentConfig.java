package valueWithDefault;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "valueWithDefault")
@PropertySource("classpath:college-info.properties")
public class StudentConfig {
	
	
	

}
