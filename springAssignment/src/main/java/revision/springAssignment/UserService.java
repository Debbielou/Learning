package revision.springAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // this is not a bean but a service component
public class UserService implements UserRepository{
	private UserRepository users;
	
   	// Setter method for injection
//    public void setUsers(UserRepository users) {
//    	System.out.println("setter method in use.");
//        users.addData();
//        users.retrieveData();
//    }
	
	//constructor injection
//	@Autowired
//    public UserService(UserRepository users) {
//		System.out.println("cosntructor injection in use.");
//        this.users = users;
//    }

	
	@Override
	public void addData() {
		System.out.println("data added.");
		
	}

	@Override
	public void retrieveData() {
		System.out.println("data retrieved.");
	}

	
}
