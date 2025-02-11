package mvc.springRestApiValidation.dao;

import java.util.List;

import mvc.springRestApiValidation.model.Employee;

public interface EmployeeInter {
	
	void addEmployee(Employee employee);
    void updateEmployee(Employee employee);
    Employee getEmployeeById(int id);
    void deleteEmployee(int id);
    List<Employee> listEmployee();

}
