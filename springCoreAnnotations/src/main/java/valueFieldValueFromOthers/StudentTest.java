package valueFieldValueFromOthers;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentTest {

    public static void main(String[] args) {
    	
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);

        Student student = context.getBean(Student.class);
        student.testStudents();

        context.close();
    }
}


