package mvc.springMvcDatabase.Service;


import java.util.List;

import mvc.springMvcDatabase.Model.Employer;

public interface EmployerService {
    void saveEmployer(Employer employer);
    List<Employer> getAllEmployers();
    Employer getEmployerById(int id);
    void updateEmployer(Employer employer);
    void deleteEmployer(int id);
}

