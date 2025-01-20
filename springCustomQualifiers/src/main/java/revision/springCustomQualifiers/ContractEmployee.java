package revision.springCustomQualifiers;

import org.springframework.stereotype.Component;

import revision.springCustomQualifiers.CustomQualifiers.Version2;

@Component
@Version2
public class ContractEmployee implements Employment {

	@Override
	public void leave() {
		System.out.println("Contract staff should take 15 days of leave annually.");
		
	}

	@Override
	public void salary() {
		System.out.println("Your salary is paid on 30th monthly.");
		
	}
	
	public void workDays() {
		System.out.println("Contract staff should work 3 days per week.");
	}

}
