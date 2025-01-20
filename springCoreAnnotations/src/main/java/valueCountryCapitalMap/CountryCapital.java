package valueCountryCapitalMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryCapital {
	
	@Autowired
	  private Map<String, String> countryCapitalMap;
	  
	  public void printCountryCapital() {
	    countryCapitalMap.forEach((country, capital) -> System.out.println(country + ": " + capital));
	  }
	  
	  public String getCapitalByCountry(String country) {
	    return countryCapitalMap.get(country);
	  }
			
	}
	


