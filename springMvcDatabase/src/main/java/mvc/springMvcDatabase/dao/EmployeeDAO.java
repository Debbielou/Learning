package mvc.springMvcDatabase.dao;

import java.util.List;

import mvc.springMvcDatabase.model.Employee;


public interface EmployeeDAO {
	
	public void addEmployee(Employee employee);
	
	public void updateEmployee(Employee employee);
	
	public Employee getEmployeeById(int id);
	
	public void removeEmployee(int id);
	
	public List<Employee> listEmployees();

}
