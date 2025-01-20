package valueCountryCapitalMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 

public class CountryCapitalMain {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("country-capital.xml");
	    CountryCapital countryCapital = (CountryCapital) context.getBean("countryCapital");
	    countryCapital.printCountryCapital();
	    System.out.println("Capital of Burundi is " + countryCapital.getCapitalByCountry("Burundi"));
	  }
	

	}


