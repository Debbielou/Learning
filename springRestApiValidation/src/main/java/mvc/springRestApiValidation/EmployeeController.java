package mvc.springRestApiValidation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mvc.springRestApiValidation.model.Employee;
import mvc.springRestApiValidation.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/enroll")
	public Employee enrollEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
		return employee;
	}

}
