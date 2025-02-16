package hibernateRelationshipMapping.hibernateRelationships;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainManyToMany {
	
	
	 public static void main( String[] args ){
	
	CourseManyToMany course1 = new CourseManyToMany();
	course1.setDepartment("Organisation Studies");
	course1.setId(11);
	course1.setName("Communication Skills");
	
	CourseManyToMany course2 = new CourseManyToMany();
	course2.setDepartment("Humanities");
	course2.setId(12);
	course2.setName("Sociology");
	
	CourseManyToMany course3 = new CourseManyToMany();
	course3.setDepartment("Sciences");
	course3.setId(7);
	course3.setName("Philisophy");
	
	Set<CourseManyToMany>courses = new HashSet();
	courses.add(course1);
	courses.add(course2);
	courses.add(course3);
	
//	StudentManyToMany student1 = new StudentManyToMany(1, "Tina Tinde", courses);
	StudentManyToMany student2 = new StudentManyToMany(2, "Peter Piper", courses);
	
	Configuration config = new Configuration();
    config.configure("hibernate.cfg.xml");
    SessionFactory sessionFactory = config.buildSessionFactory();
    Session session = sessionFactory.openSession();
    Transaction transaction = session.beginTransaction();
    session.persist(student2);
    transaction.commit();
    session.close();
	
	

}
}