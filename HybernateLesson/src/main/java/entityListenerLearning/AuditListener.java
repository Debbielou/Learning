package entityListenerLearning;

import java.time.LocalDate;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class AuditListener {

	 @PrePersist
	    public void prePersist(Auditable auditable) {
	        LocalDate currentDate = LocalDate.now();
	        auditable.setCreatedAt(currentDate);
	        auditable.setUpdatedAt(currentDate);
	       	    }

	    @PreUpdate
	    public void preUpdate(Auditable auditable) {
	        auditable.setUpdatedAt(LocalDate.now());
	       
	    }
	}