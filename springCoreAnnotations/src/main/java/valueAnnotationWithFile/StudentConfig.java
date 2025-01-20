package valueAnnotationWithFile;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "valueAnnotationWithFile")
@PropertySource("classpath:college-info.properties") // this points us to a place where data is
public class StudentConfig {
	
	
	

}
