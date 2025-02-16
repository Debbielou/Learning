package uniqueConstraints;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {

	public static void main(String[] args) {
		

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myThings"); 
		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin(); 
		
		Writer writer = new Writer();
		writer.setName("Daniel Steel");
		
		Book book1 = new Book();
		book1.setTitle("River runs dry");
		book1.setSerialNumber("001-90807060");
		book1.setAuthor(writer);
		
		Book book2 = new Book();
		book2.setTitle("The Dark Valley");
		book2.setSerialNumber("001-90807080");
		book2.setAuthor(writer);
		
		List<Book>books = new ArrayList();
		books.add(book1);
		books.add(book2);
		
		writer.setBooks(books);
		em.persist(writer);
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		
	}

}
