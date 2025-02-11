package mvc.springRestApiValidation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import mvc.springRestApiValidation.model.Employee;
import mvc.springRestApiValidation.dao.EmployeeInter;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeInter employeeInter;

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        employeeInter.addEmployee(employee);
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeInter.updateEmployee(employee);
    }

    @Override
    @Transactional
    public Employee getEmployeeById(int id) {
        return employeeInter.getEmployeeById(id);
    }

    @Override
    @Transactional
    public void deleteEmployee(int id) {
        employeeInter.deleteEmployee(id);
    }

    @Override
    @Transactional
    public List<Employee> listEmployee() {
        return employeeInter.listEmployee();
    }
}

