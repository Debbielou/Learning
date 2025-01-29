package mvc.springMvcDatabase.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import mvc.springMvcDatabase.Model.Employer;
import mvc.springMvcDatabase.Service.EmployerService;


@Controller
public class EmployerController {

    @Autowired
    private EmployerService employerService;

    @RequestMapping("/")
    public String showWelcomePage(Model model) {
        model.addAttribute("employer", new Employer());
        return "welcome";
    }

    @RequestMapping(value = "/submitRegistration", method = RequestMethod.POST)
    public String submitRegistration(@ModelAttribute("employer") Employer employer, Model model) {
        employerService.saveEmployer(employer);
        model.addAttribute("employer", employer);
        return "success";
    }
}

