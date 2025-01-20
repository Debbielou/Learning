package revision.springAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class UserServiceImplementation  {
	
	@Autowired
	private UserRepository users;
		
		// Setter method for injection
//	   public void setUsers(UserRepository users) {
//	   	System.out.println("setter method in use.");
//	       this.users = users;
//	   }
	   
//		@Bean (name = "constructorBean")
//		public UserRepository userRepository() { 
//			UserRepository userRepository = new UserService(users);
//			setUsers(userRepository); // Injecting bean through setter method to return userRepository;
//			return users;
//		}
			
//	@Bean
//	public UserRepository repository() {
//		return users;
//	}	
		public void checkUsers() {
        users.addData();
        users.retrieveData();
}
}