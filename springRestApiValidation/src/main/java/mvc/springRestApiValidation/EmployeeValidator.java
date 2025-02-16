package mvc.springRestApiValidation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import mvc.springRestApiValidation.model.Employee;


public class EmployeeValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;

        if (employee.getSalary() < 50000) {
            errors.rejectValue("salary", "salary.invalid", "Minimum wage is 50000");
        }

        if (employee.getEmail() == null || !employee.getEmail().matches(".+@.+\\..+")) {
            errors.rejectValue("email", "email.invalid", "Invalid email format");
        }

        if (employee.getFirstName() == null || employee.getFirstName().length() < 4) {
            errors.rejectValue("firstName", "firstName.invalid", "First name must be at least 4 characters long");
        }

        if (employee.getLastName() == null || employee.getLastName().length() < 6) {
            errors.rejectValue("lastName", "lastName.invalid", "Last name must be at least 6 characters long");
        }

        if (employee.getDepartment() == null || employee.getDepartment().length() < 3) {
            errors.rejectValue("department", "department.invalid", "Department should be at least 3 characters");
        }
    }
}
