package revision.springScheduling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = "revision.springScheduling" )
@EnableScheduling
public class BasicSchedulingConfig {
	
	
	@Bean
    public BasicScheduling basicScheduling() {
        return new BasicScheduling();
    }
    }

