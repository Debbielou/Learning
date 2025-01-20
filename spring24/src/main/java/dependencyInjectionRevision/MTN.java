package dependencyInjectionRevision;

import org.springframework.stereotype.Service;

@Service
public class MTN implements Sim {
	
		
	@Override
	public void call() {
		System.out.println("The number you're calling is not available at the moment");
		
	}
	
	@Override
	public void data() {
		System.out.println("Sim data is switched off");

}
}