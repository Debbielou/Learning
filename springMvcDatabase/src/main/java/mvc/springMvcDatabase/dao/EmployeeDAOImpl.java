package mvc.springMvcDatabase.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mvc.springMvcDatabase.model.Employee;



@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
	
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

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> listEmployees() {
		Session session = sessionFactory.getCurrentSession();
		List<Employee> employeesList = session.createQuery("from Employee").list();
		return employeesList;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Session session = sessionFactory.getCurrentSession();		
		Employee employee = (Employee) session.get(Employee.class, new Integer(id));
		return employee;
	}

	@Override
	public void removeEmployee(int id) {
		Session session = sessionFactory.getCurrentSession();
		Employee employee = (Employee) session.get(Employee.class, new Integer(id));
		if(null != employee){
			session.delete(employee);
		}
	}
}
