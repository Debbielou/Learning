package mvc.springCollegeMvc.DAO;

import java.util.ArrayList;
import java.util.List;

import mvc.springCollegeMvc.Model.CollegeModel;

public class CollegeInterfaceImpl implements CollegeInterface {
	
	 List<CollegeModel>colleges;
	 
	 
	public CollegeInterfaceImpl() {
		this.colleges = new ArrayList<>();
	}
	@Override
    public void saveCollege(CollegeModel college) {
        colleges.add(college);
    }

    @Override
    public List<CollegeModel> getAllColleges() {
        // Create a list of 5 colleges
        colleges.add(new CollegeModel( 001,"Bugema University", "Gayaza"));
        colleges.add(new CollegeModel(002,"Makerere University", "Wandegeya"));
        colleges.add(new CollegeModel(003,"Nkozi University", "Buwama"));
        colleges.add(new CollegeModel(004,"Muteesa Royal University", "Masaka"));
        colleges.add(new CollegeModel(005,"Victoria University", "Kampala"));

        return colleges;
    }
	@Override
	public void updateCollege(CollegeModel college) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteCollege(int id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public CollegeModel getCollegeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
