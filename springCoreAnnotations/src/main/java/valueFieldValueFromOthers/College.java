package valueFieldValueFromOthers;

import org.springframework.stereotype.Component;

@Component
public class College {

    private Integer rollNumber;

    
	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}

    
}

