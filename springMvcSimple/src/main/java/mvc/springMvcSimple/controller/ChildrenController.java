package mvc.springMvcSimple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/so") // example of RequestMapping at class level
public class ChildrenController {
	
	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar() {
		
		return "Ok; here's the sugar for your tea.";
	}
	
	@RequestMapping(value = "/*dear", method = RequestMethod.GET)
	public String daddy() {
		
		return "daddy";
	}

}
