package valueCountryCapitalMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CountryCapitalConfig {
	
	 @Value("#{${country.capital}}")
	  private Map<String, String> countryCapitalMap;
	  
	  @Bean
	  public Map<String, String> getCountryCapitalMap() {
	    return countryCapitalMap;
	  }
	}


