package dependencyInjectionRevision;

import org.springframework.stereotype.Service;

@Service
public class Airtel implements Sim{
	
//	public Airtel() {
//		System.out.println("Airtel constructor working.");//testing the constructor when airtel object is called
//	}
	
	@Override
	public void call() {
		System.out.println("The number you're calling is busy");
		
	}
	
	@Override
	public void data() {
		System.out.println("No data on sim");

	}
}
