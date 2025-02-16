package entityManagerPractice;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Id;
import jakarta.persistence.Persistence;

@Entity
public class Person {

	@Id
	int id;
	String name;
	int age;
	
		
	public Person() {
		
	}

	public Person(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Age: " + age;
	}

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myThings"); 
		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin(); 
		Person person = new Person(); 
		  person.setId(1); 
		  person.setName("Tibo");
		  person.setAge(10);
		  em.persist(person); 
		  em.getTransaction().commit(); 
		  System.out.println("Yepee....i've done it.");
		  em.close(); 
		  emf.close();

	}

}
