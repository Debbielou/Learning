package springAutoDependency;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Animals implements Hearts {

	@Override
	public void pump() {
		System.out.println("You cow.");
	}

	@Override
	public void sick() {
		System.out.println("The cow is sick");
		
	}

}
