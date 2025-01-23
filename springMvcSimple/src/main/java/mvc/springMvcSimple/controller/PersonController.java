package mvc.springMvcSimple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {
	
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping(value = "/deb", method = RequestMethod.GET)
	public String dbz() {
		return "dbz";
	}
	
	@RequestMapping(value = "/Good/morning", method = RequestMethod.GET)
	public String greeting(Model model) {
	    String hey = "Good morning my wonderful student, Debbie.";
	    model.addAttribute("message", hey);
	    return "greeting"; 
	}

}
