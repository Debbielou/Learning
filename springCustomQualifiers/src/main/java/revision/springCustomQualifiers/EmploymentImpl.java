package revision.springCustomQualifiers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import revision.springCustomQualifiers.CustomQualifiers.Version1;
import revision.springCustomQualifiers.CustomQualifiers.Version2;

@Component
public class EmploymentImpl {
	
//	@Autowired
//	@Version2
	private Employment job; // This will inject permanent employee. it has implemented ElementType.Field
	
	public void checkEmployee() {
		job.leave();
		job.salary();
	}
	
	// This is ElementType.PARAMETER implementation
    private final Employment permanentJob;
    private final Employment contractJob;

    @Autowired 
    public EmploymentImpl(@Version1 Employment permanentJob, @Version2 Employment contractJob) {
        this.permanentJob = permanentJob;
        this.contractJob = contractJob;
    }

    public void checkEmployee(String employeeType) {
        if ("permanentJob".equals(employeeType)) {
            permanentJob.leave();
            permanentJob.salary();
        } else if ("contractJob".equals(employeeType)) {
            contractJob.leave();
            contractJob.salary();
        } else {
            // Handle invalid employee type (e.g., throw an exception or log an error)
            System.err.println("Invalid employee type: " + employeeType);
        }
    }
}