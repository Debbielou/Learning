package mvc.springRestApiValidation;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mvc.springRestApiValidation.model.Employee;
import mvc.springRestApiValidation.service.EmployeeService;

@RestController
public class EmployeeController {
	
	private final EmployeeValidator employeeValidator = new EmployeeValidator();
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/enroll")
	public Employee enrollEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return employee;
	}
	
	@PostMapping("/enrolled")	    
    public String registerUser(@RequestBody @Valid Employee employee, BindingResult result) {
        if (result.hasErrors()) {
            return "Email validation failed: " + result.getAllErrors();
        }
        else {
        	employeeService.addEmployee(employee);
        	 return "User registered successfully";
        }
       
    }
	
	@PostMapping("/en")	    
    public String registerEmployee(@RequestBody @Validated Employee employee, BindingResult result) {
		  employeeValidator.validate(employee, result);
        if (result.hasErrors()) {
            return "Njakusabulira bwerere: " + result.getAllErrors();
        }
        else {
        	employeeService.addEmployee(employee);
        	 return "Oli wa tabbu nnyo man";
        }
	} 

}
