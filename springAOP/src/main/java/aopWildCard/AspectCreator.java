package aopWildCard;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AspectCreator {
	
	@Before("execution(* get*())") //wildcard expression for all getters
	public void logAdvice() {
		System.out.println("Logging an advice call.");
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {
		
	}
	
	@After("allGetters")
	public void secondLogAdvice() {
		System.out.println("This is how pointcut works.");
	}
    
	@Pointcut("execution(* * aopWildCard.Service.*(..))")//not specific abt access modifier, return type, method, parameters
	public void allServiceMethods() {
		
}
	@Pointcut("within(aopWildCard.Service)")//operates as the point cut on line 26
	public void serviceMethods() {
}
}