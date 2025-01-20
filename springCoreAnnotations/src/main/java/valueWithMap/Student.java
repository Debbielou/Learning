package valueWithMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Student {
	
	String studentName;
    Map<String, Integer> grades;
    Integer mathGrade;
    Integer unknownSubjectGrade; 
    Map<String, Integer> defaultGrades;
    Integer unknownSubjectGradeWithDefault;
    Map<String, Integer> passingGrades;
   

    @Autowired
    private School school;

    public Student(
            @Value("${student.name:Default Student}") String studentName,
            @Value("#{${grades}}") Map<String, Integer> grades,
            @Value("#{${grades}.math}") Integer mathGrade,
            @Value("#{${grades}['mystery']}") Integer unknownSubjectGrade, 
            @Value("#{${defaultGrades : {math: 80, science: 90, sst: 75, engligh: 95}}}") Map<String, Integer> defaultGrades,
            @Value("#{${grades}['mystery'] ?: 60}") Integer unknownSubjectGradeWithDefault,
            @Value("#{${grades}.?[value>70]}") Map<String, Integer> passingGrades) 
           
         {
            this.studentName = studentName;
            this.grades = grades;
            this.mathGrade = mathGrade;
            this.unknownSubjectGrade = unknownSubjectGrade;
            this.defaultGrades = defaultGrades;
            this.unknownSubjectGradeWithDefault = unknownSubjectGradeWithDefault;
            this.passingGrades = passingGrades;
          
         }
   
    public void testStudents() {
        school.setExams(); 
        System.out.println(studentName + " is going to sit for UNEB this year.");
        System.out.println("Grades: " + grades);
        System.out.println("Math Grade: " + mathGrade);
        System.out.println("Mystery Grade: " + unknownSubjectGrade); 
        System.out.println("Default Grades: " + defaultGrades);
        System.out.println("Mystery Grade with Default: " + unknownSubjectGradeWithDefault);
        System.out.println("Passing Grades: " + passingGrades); 
        
    }
}

	
	
	

