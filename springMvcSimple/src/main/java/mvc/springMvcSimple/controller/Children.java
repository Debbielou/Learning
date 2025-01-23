package mvc.springMvcSimple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Children {
	
	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar() {
		
		return "Ok; here's the sugar for your tea.";
	}

}
