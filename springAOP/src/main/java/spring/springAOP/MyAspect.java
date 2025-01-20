package spring.springAOP;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {
	
	@Before("execution(* spring.springAOP.MyService.*(..))")
	 public void beforeAdvice() {
	 System.out.println("Before advice is executed!");
	}	   
	 
	 @After("execution(* spring.springAOP.Customer.*(..))")
	 public void afterOrder() {
	 System.out.println("Serving customer with a smile.");
			   
	 }
	 
	 @Before("execution(public String spring.springAOP.Customer.getName())") //specifies pointcut
	 public void log() {
		 System.out.println("Logging some advice");
	 }

}
