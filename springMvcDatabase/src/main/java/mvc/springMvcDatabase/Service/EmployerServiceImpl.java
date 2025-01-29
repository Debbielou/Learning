package mvc.springMvcDatabase.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mvc.springMvcDatabase.DAO.EmployerDAO;
import mvc.springMvcDatabase.Model.Employer;

import java.util.List;

@Service
@Transactional
public class EmployerServiceImpl implements EmployerService {

    @Autowired
    private EmployerDAO employerDAO;

    @Override
    public void saveEmployer(Employer employer) {
        employerDAO.saveEmployer(employer);
    }

    @Override
    public List<Employer> getAllEmployers() {
        return employerDAO.getAllEmployers();
    }

    @Override
    public Employer getEmployerById(int id) {
        return employerDAO.getEmployerById(id);
    }

    @Override
    public void updateEmployer(Employer employer) {
        employerDAO.updateEmployer(employer);
    }

    @Override
    public void deleteEmployer(int id) {
        employerDAO.deleteEmployer(id);
    }
}

