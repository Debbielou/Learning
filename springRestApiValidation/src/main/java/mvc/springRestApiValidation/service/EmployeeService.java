package mvc.springRestApiValidation.service;

import java.util.List;

import mvc.springRestApiValidation.model.Employee;

public interface EmployeeService {
	
	void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    Employee getEmployeeById(int id);
    void deleteEmployee(int id);
    List<Employee> listEmployee();

}
