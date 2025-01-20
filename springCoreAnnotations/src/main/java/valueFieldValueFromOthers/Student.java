package valueFieldValueFromOthers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String studentName;
    private Integer collegeBeanValue;

    @Autowired
    private School school;

    public Student(
        @Value("${student.name:Default Student}") String studentName,
        @Value("#{${college.rollNumber}}") Integer collegeBeanValue
    ) {
        this.studentName = studentName;
        this.collegeBeanValue = collegeBeanValue;
    }

    public void testStudents() {
        school.setExams();
        System.out.println(studentName + " is going to sit for UNEB this year.");
        System.out.println("Value from College: " + collegeBeanValue);
    }
}
