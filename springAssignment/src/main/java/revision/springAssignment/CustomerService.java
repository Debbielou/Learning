package revision.springAssignment;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
public class CustomerService implements UserRepository{

	@Override
	public void addData() {
		System.out.println("Leave me alone.");
		
	}

	@Override
	public void retrieveData() {
		System.out.println("Nkwata mpola.");
		
	}

}
