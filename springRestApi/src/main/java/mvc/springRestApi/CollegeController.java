package mvc.springRestApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mvc.springRestApi.model.CollegeModel;
import mvc.springRestApi.service.CollegeService;

@RestController
public class CollegeController {
	
	@Autowired
	CollegeService collegeService;
	
	    @PostMapping("/register")
	    public String registerStudent() {
	       
	        return "Student registered successfully: ";
	    }
	    
	    @PostMapping("/registered")
	    public String registerStudent(@RequestBody String studentName) {
	       
	        return "Student registered successfully: " + studentName;
	    }
	    
	    @PostMapping("/colleges")
	    public CollegeModel createCollege(@RequestBody CollegeModel college) {
	        return collegeService.addCollege(college);
	    }
	    
	    @GetMapping("/fetch")
	    public List<CollegeModel> listColleges(){
	    	return collegeService.listColleges();
	    	
	    }
	    
	    @GetMapping("/fetches/{id}")
	    public CollegeModel getCollegeById(@PathVariable int id) {
	    	return collegeService.getCollegeById(id);
	    }
	    
	    @PutMapping("/update/{id}")
	    public void updateCollegeById(@PathVariable int id, @RequestBody CollegeModel college) {
	    	collegeService.updateCollege(college);
	    	
	    }
	    
	    @DeleteMapping("/delete/{id}" )
	    public void deleteCollege(@PathVariable int id) {
	    	 collegeService.removeCollege(id);
	    }
	    
	   	 @RequestMapping(value = "/colleges/{id}", method = RequestMethod.OPTIONS)
	     public ResponseEntity<?> collegeOptions(@PathVariable int id) {
	        HttpHeaders headers = new HttpHeaders();
	        headers.add("Allow", "GET, POST, PUT, PATCH, DELETE, OPTIONS"); 

	        return new ResponseEntity<>(headers, HttpStatus.OK);
	    }


}
