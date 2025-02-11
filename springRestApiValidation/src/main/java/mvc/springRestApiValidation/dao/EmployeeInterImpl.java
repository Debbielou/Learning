package mvc.springRestApiValidation.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvc.springRestApiValidation.model.Employee;

@Repository
public class EmployeeInterImpl implements EmployeeInter{
	
	@Autowired
    private SessionFactory sessionFactory;
	 
	@Override
	public void addEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
       session.persist(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
        session.update(employee);
    }
	

	@Override
	public Employee getEmployeeById(int id) {
		 Session session = sessionFactory.getCurrentSession();
	        Employee employee = session.get(Employee.class, id);
	        return employee;
	    }

	@Override
	public void deleteEmployee(int id) {
		Session session = sessionFactory.getCurrentSession();
        Employee employee = session.get(Employee.class, id);
        if (employee != null) {
            session.delete(employee);
        }
	}

	@Override
	public List<Employee> listEmployee() {
		  Session session = sessionFactory.getCurrentSession();
	      List<Employee> employeeList = session.createQuery("from Employee").getResultList();
	      return employeeList;
	}

}
