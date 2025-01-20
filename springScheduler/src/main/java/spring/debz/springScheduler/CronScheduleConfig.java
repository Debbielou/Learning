package spring.debz.springScheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan(basePackages = "spring.debz.springScheduler")
@EnableScheduling
public class CronScheduleConfig {

}
