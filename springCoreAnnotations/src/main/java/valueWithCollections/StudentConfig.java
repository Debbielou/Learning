package valueWithCollections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration 
@ComponentScan(basePackages = "valueWithCollections") 
@PropertySource("classpath:college-info.properties") 
public class StudentConfig { 
	
	@Value("${student.names}") //this injects a value from the properties file to the studentNames field
	private String[] studentNames; 
	
	@Autowired 
	private School school;
	
	@Bean 
	public Student[] students() { 
	Student[] students = new Student[studentNames.length]; 
	for (int i = 0; i < studentNames.length; i++) { 
		students[i] = new Student(studentNames[i]); 
		students[i].setSchool(school); // Injecting School dependency to avoid nullpointer exception
		} 
	return students;
  }
}