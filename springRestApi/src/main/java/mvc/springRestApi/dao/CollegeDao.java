package mvc.springRestApi.dao;

import java.util.List;
import mvc.springRestApi.model.CollegeModel;

public interface CollegeDao {
    void addCollege(CollegeModel college);
    void updateCollege(CollegeModel college);
    CollegeModel getCollegeById(int id);
    void removeCollege(int id);
    List<CollegeModel> listColleges();
}
