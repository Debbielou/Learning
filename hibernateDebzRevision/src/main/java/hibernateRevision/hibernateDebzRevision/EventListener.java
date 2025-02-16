package hibernateRevision.hibernateDebzRevision;

import jakarta.persistence.PostPersist;
import jakarta.persistence.PostUpdate;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class EventListener {
	// prePersist, postPersist,preUpdate,postUpdate
	
	@PrePersist
	public void beforePersist(ViennaEmployees emp) {
		System.out.println("Wait please.");
		}
	@PostPersist
	public void afterPersist(ViennaEmployees emp) {
		System.out.println("Go on please.");
	}
//	@PreUpdate
//	public void beforeAnyUpdate(ViennaEmployees emp) {
//		System.out.println("Dont rush.");
//		}
//	@PostUpdate
//	public void afterAnyUpdate(ViennaEmployees emp) {
//		System.out.println("Tumalirizza.");
//		}

}
