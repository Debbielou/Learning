package mvc.springRestApi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import mvc.springRestApi.model.CollegeModel;

@Repository
public class CollegeDaoImpl implements CollegeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void addCollege(CollegeModel college) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(college);
    }

    @Override
    public void updateCollege(CollegeModel college) {
        Session session = sessionFactory.getCurrentSession();
        session.update(college);
    }

    @Override
    public CollegeModel getCollegeById(int id) {
        Session session = sessionFactory.getCurrentSession();
        CollegeModel college = session.get(CollegeModel.class, id);
        return college;
    }

    @Override
    public void removeCollege(int id) {
        Session session = sessionFactory.getCurrentSession();
        CollegeModel college = session.get(CollegeModel.class, id);
        if (college != null) {
            session.delete(college);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<CollegeModel> listColleges() {
        Session session = sessionFactory.getCurrentSession();
        List<CollegeModel> collegeList = session.createQuery("from CollegeModel").getResultList();
        return collegeList;
    }
}
