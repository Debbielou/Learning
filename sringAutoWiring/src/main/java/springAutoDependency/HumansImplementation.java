package springAutoDependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HumansImplementation {
	
//	@Autowired
//	@Qualifier("animalHeart")
	private Hearts hearts;      //autowiring by field
	
	
	@Autowired //autowiring by constructor
	public  HumansImplementation(@Qualifier("animals") Animals animals) { 
		this.hearts= animals; 
		}
	
	public void heartBreak() {
		hearts.pump();
		hearts.sick();
	}

}
