package hibernateRelationshipMapping.hibernateRelationships;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	
    public static void main( String[] args ){
    	  	
//    	Configuration conf = new Configuration().configure("hibernate.cfg.xml");
//        SessionFactory sessionFactory = conf.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        PassportOneToOne  passport1 = new PassportOneToOne();
//    	  passport1.setColour("Green");
//        passport1.setPassportNumber("A001008");
    //        CitizenOneToOne citizen1 = new CitizenOneToOne();
//    	citizen1.setName("Dee Lou");
//    	citizen1.setNationality("Congolese");
//    	passport1.setCitizen(citizen1);
//        citizen1.setPassport(passport1);
//        session.persist(citizen1);     
//        transaction.commit();
//        session.close();
//        sessionFactory.close();
    	
    	UniversityOneToMany university = new UniversityOneToMany();
    	university.setId(10);
    	university.setName("Bugema");
    	university.setLocation("Luwero");

    	DepartmentManyToOne department1 = new DepartmentManyToOne();
        department1.setDepartmentName("Medicine");
        department1.setId(11);
        department1.setNumberOfStudents(90);
        department1.setUniversity(university);

        DepartmentManyToOne department2 = new DepartmentManyToOne();
        department2.setDepartmentName("Philisopy");
        department2.setId(9);
        department2.setNumberOfStudents(5);
        department2.setUniversity(university);

        List<DepartmentManyToOne> departments = new ArrayList<>();
        departments.add(department1);
        departments.add(department2);

        university.setDepartment(departments);

        Configuration config = new Configuration();
        config.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = config.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(university);
        transaction.commit();
        session.close();
    }
}
