package dependencyInjectionRevision;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import inversionOfControlAnnotation.School;
import inversionOfControlAnnotation.SchoolMethodHolder;

import org.springframework.context.ApplicationContext;

@Component
public class Phone {
	

	public static void main(String[] args) {
		
	//hard coupling	
//		Sim sim = new Airtel();
//		sim.call();
//		sim.data();
		
	//loose coupling
		ApplicationContext context = new ClassPathXmlApplicationContext("school.xml");
//		System.out.println("Katandika butandisi.");
//		MTN mtn = (MTN)context.getBean("mtn");
//		mtn.call();
//		mtn.data();
		
		//second way to access beans
//		Airtel airtel =context.getBean("airtel", Airtel.class);
//	    airtel.call();
//	    airtel.data();
	    
	    //using the interface 
	    Sim sim = context.getBean("sim", Sim.class);
	    sim.call();
	    sim.data();
        
		
		}

	}


