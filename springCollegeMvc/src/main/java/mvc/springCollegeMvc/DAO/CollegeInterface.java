package mvc.springCollegeMvc.DAO;

import java.util.List;

import mvc.springCollegeMvc.Model.CollegeModel;

public interface CollegeInterface {
	
    void saveCollege(CollegeModel college);

    
    void updateCollege(CollegeModel college);

   
    void deleteCollege(int id);

    
    CollegeModel getCollegeById(int id);

  
    List<CollegeModel> getAllColleges();

}
