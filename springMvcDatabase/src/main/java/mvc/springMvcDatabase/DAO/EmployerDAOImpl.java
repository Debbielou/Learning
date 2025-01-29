package mvc.springMvcDatabase.DAO;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mvc.springMvcDatabase.Model.Employer;

import java.util.List;

@Repository
@Transactional
public class EmployerDAOImpl implements EmployerDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveEmployer(Employer employer) {
        sessionFactory.getCurrentSession().saveOrUpdate(employer);
    }

    @Override
    public List<Employer> getAllEmployers() {
        return sessionFactory.getCurrentSession().createQuery("from Employer", Employer.class).list();
    }

    @Override
    public Employer getEmployerById(int id) {
        return sessionFactory.getCurrentSession().get(Employer.class, id);
    }

    @Override
    public void updateEmployer(Employer employer) {
        sessionFactory.getCurrentSession().update(employer);
    }

    @Override
    public void deleteEmployer(int id) {
        Employer employer = getEmployerById(id);
        if (employer != null) {
            sessionFactory.getCurrentSession().delete(employer);
        }
    }
}

