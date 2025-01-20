package revision.springCustomQualifiers;

import org.springframework.stereotype.Component;

import revision.springCustomQualifiers.CustomQualifiers.Version1;

@Component
@Version1
public class PermanentEmployee implements Employment {

	@Override
	public void leave() {
		System.out.println("You can carry over only 5 days of leave.");
		
	}

	@Override
	public void salary() {
		System.out.println("Your salary has a fuel benefit.");
		
	}
	
	public void overTime() {
		System.out.println("You qualify for overtime because you're a permanent employee.");
	}

} 
