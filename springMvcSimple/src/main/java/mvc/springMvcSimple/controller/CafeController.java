package mvc.springMvcSimple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CafeController {
	
//	@RequestMapping("/cafe")
//	public String showWelcomePage() {
	
//	  return "welcome-page";
		
//	}
	
//	@RequestMapping("/cafe")
//	public String showWelcomePage(Model model) {
		
//		String menu = "FOOD MENU:";
		
//		model.addAttribute("theMenu", menu);
//		model.addAttribute("Item1", "Chips & Chicken");
//		model.addAttribute("Item2", "Chips & Sausages");
//		return "welcome-page";

//}
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {
	
		String menu = "FOOD MENU:";
	
		model.addAttribute("theMenu", menu);
		model.addAttribute("Item1", "Chips & Chicken");
		model.addAttribute("Item2", "Chips & Sausages");
		return "welcome-page";
}
	@RequestMapping("/processOrder")
	public String processOrder() {
		
		return "order-page";
	}
}
