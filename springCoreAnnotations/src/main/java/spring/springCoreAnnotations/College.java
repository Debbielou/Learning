package spring.springCoreAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("collegeBean") // renaming the bean id
//@Component  // bean id is same as class name but it starts with a small letter.This provides default bean id
public class College {
	
//	@Value("Makerere") // this annotation is used to inject literal values directly
	@Value("${college.Name}")
	private String collegeName;
	
	private Principal principal;
	
	private Teacher teacher;
	
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}


	public College(Principal principal) {
		this.principal = principal;
	}

	
	public void test() {
		
		principal.principalName();
		teacher.teach();
		teacher.reportCard();
		
		System.out.println("My college name is " + collegeName);
	}

		public College() {
	}

		public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("setter injection in use.");
	}

}
