package demoMvc.springMvcDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import modelUser.User;

@RestController
public class UserManual {
	
	@RequestMapping(value = "/Debz", method = RequestMethod.GET)
	public User eatFood() {
		return new User("Debz", 20);
	}

}
