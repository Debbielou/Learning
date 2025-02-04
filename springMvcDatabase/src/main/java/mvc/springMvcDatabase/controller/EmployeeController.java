package mvc.springMvcDatabase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mvc.springMvcDatabase.model.Employee;
import mvc.springMvcDatabase.service.EmployeeService;



@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/employeeRegester", method = RequestMethod.GET)
	public String listemployees(Model model) {
		model.addAttribute("employee", new Employee());
		model.addAttribute("employeeList", employeeService.listEmployees());
		return "employee";
	}

	@RequestMapping(value = "/employees", method = RequestMethod.GET)
	public String listemployees() {
		return "success";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		System.out.println("Omukozi omulungi " + employee);
		employeeService.addEmployee(employee);
		return "save";
	}
	
	@RequestMapping(value = "/display", method = RequestMethod.GET)
	public String displayEmployees(Model model) {
		List<Employee> employees = employeeService.listEmployees();
        model.addAttribute("employeeList", employees);
		return "display";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
    public String updateEmployee(@ModelAttribute("employee") Employee employee, Model model) {
        employeeService.updateEmployee(employee);
        String message = "Employee, " + employee.getFirstName() + " " + employee.getLastName() + " has been updated successfully.";
        model.addAttribute("updateMessage", message);
        return "update";
    }
	
	   @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	    public String showUpdateForm(@PathVariable("id") int id, Model model) {
	        Employee employee = employeeService.getEmployeeById(id);
	        model.addAttribute("employee", employee);
	        return "update_form";
	    }
	 
	    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	    public String deleteEmployee(@PathVariable("id") int id, Model model) {
	        employeeService.removeEmployee(id);
	        String message = "Employee has been deleted successfully.";
	        model.addAttribute("deleteMessage", message);
	        return "delete_form";
	    }



}
