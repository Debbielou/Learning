package valueWithSpEl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest{

    public static void main(String[] args) {
        
    	System.setProperty("priority", "High"); // Setting a system property for demonstration

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
        
        Student student = context.getBean(Student.class);
        student.showPriority();
        student.testStudents();

//        Student[] students = context.getBean(Student[].class);
//        for (Student student : students) {
//            student.testStudents();
//        }

        context.close();
    }
}

