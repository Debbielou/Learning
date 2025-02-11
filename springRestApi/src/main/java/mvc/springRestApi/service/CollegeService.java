package mvc.springRestApi.service;

import java.util.List;

import mvc.springRestApi.model.CollegeModel;

public interface CollegeService {
	
	public CollegeModel addCollege(CollegeModel college);
	public void updateCollege(CollegeModel college);
	public CollegeModel getCollegeById(int id);
	public void removeCollege(int id);
	public List<CollegeModel> listColleges();

}
