package valueFieldValueFromOthers;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "valueFieldValueFromOthers")
@PropertySource("classpath:college-info.properties")
public class StudentConfig {

    @Bean
    public College college() {
        return new College();
    }
}
