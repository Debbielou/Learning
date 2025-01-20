package demoMvc.springMvcDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String sayHello() {
        return "Hello, welcome to Spring REST!";
        
	}
    
	@RequestMapping(value = "/Yo", method = RequestMethod.GET)  
	public String giveAccess() {
        return "Yo, give Debbie access to DCLM!";
	}
}
