package mvc.springCollegeMvc.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.springCollegeMvc.Model.CollegeModel;

@Controller
public class CollegeController {
	
	private List<CollegeModel> colleges;

    public CollegeController() {
        this.colleges = new ArrayList<>();
    }
	

	    @RequestMapping("/")
	    public String showWelcomePage(Model model) {
	        return "welcome";
	    }

	    @RequestMapping(value = "/register", method = RequestMethod.POST)
	    public String submitRegistration(@ModelAttribute("college") CollegeModel college, Model model) {
	        
	    	System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS" + college);
	    	model.addAttribute("myCollege", college);
	        return "register";
	    }
	    
	    @RequestMapping(value = "/colleges", method = RequestMethod.GET)
	    public String getAllColleges(Model model) {
	       
	        colleges.add(new CollegeModel(1, "Bugema University", "Gayaza"));
	        colleges.add(new CollegeModel(2, "Makerere University", "Wandegeya"));
	        colleges.add(new CollegeModel(3, "Nkozi University", "Buwama"));
	        colleges.add(new CollegeModel(4, "Muteesa Royal University", "Masaka"));
	        colleges.add(new CollegeModel(5, "Victoria University", "Kampala"));

	        model.addAttribute("colleges", colleges);
	        return "colleges"; 
	    }
	}
