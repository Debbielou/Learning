package springAutoDependency;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component("omutima")
public class Humans implements Hearts{

	@Override
	public void pump() {
		System.out.println("The heart is pumping blood normally.");
		
	}

	@Override
	public void sick() {
		System.out.println("The heart is very sick.");
		
	}

}
