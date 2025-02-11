package mvc.springRestApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mvc.springRestApi.dao.CollegeDao;
import mvc.springRestApi.model.CollegeModel;

@Service
public class CollegeServiceImpl implements CollegeService{
	
	@Autowired
	CollegeDao collegeDao;
	
	public void setcollegeDao(CollegeDao collegeDao) {
		this.collegeDao = collegeDao;
	}

	@Override
    @Transactional
    public CollegeModel addCollege(CollegeModel college) {
        collegeDao.addCollege(college);
        return college;
		
	}

	@Override
	@Transactional
	public void updateCollege(CollegeModel college) {
		collegeDao.updateCollege(college);
		
	}

	@Override
	@Transactional
	public CollegeModel getCollegeById(int id) {
		return collegeDao.getCollegeById(id);
	}

	@Override
	@Transactional
	public void removeCollege(int id) {
		collegeDao.removeCollege(id);
		
	}

	@Override
	@Transactional
	public List<CollegeModel> listColleges() {
		return this.collegeDao.listColleges();
	}
	
	}
