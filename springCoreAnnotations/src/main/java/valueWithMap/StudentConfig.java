package valueWithMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "valueWithMap")
@PropertySource("classpath:college-info.properties")
public class StudentConfig {

    @Bean
    public School school() {
        return new School();
    }
}
