package libraryBookRelationship;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("myPersistence");
    EntityManager em = getEntityManager();

    private EntityManager getEntityManager() {
        return emf.createEntityManager(); 
    }

    public void createAuthor() {
        em.getTransaction().begin();

            Author author1 = new Author();
            author1.setName("Ken Follet");
            author1.setNationality("Ugandan");

            Book book1 = new Book();
            book1.setTitle("Eye of the needle");
            book1.setGenre("Thriller");
            book1.setAuthor(author1); 

            Book book2 = new Book();
            book2.setTitle("The Demon Code");
            book2.setGenre("Thriller");
            book2.setAuthor(author1);
            
            List<Book>books = new ArrayList();
            books.add(book1);
            books.add(book2);
         
            author1.setBooks(books);
            
            em.persist(author1); 
//            em.persist(book1);  
//            em.persist(book2);
          

            em.getTransaction().commit();
        }
    
    public Author getAuthor(int id) {
        Author author = em.find(Author.class, id);
        if (author != null) {
        System.out.println("Author name: " + author.getName());
        }
        return author; 
    }
    
    public void mergeAuthor(int id) {
        Author author = getAuthor(id);
        em.detach(author);
        author.setNationality("Sudanese");
        em.getTransaction().begin();
        em.merge(author);
        em.getTransaction().commit();
        System.out.println("successfully merged.");
    }
    
    public void removeAuthor(int id) {
    	em.getTransaction().begin();
        Author author = em.find(Author.class, id);
        if (author != null) { 
         em.remove(author);
        } else {
            System.out.println("Author not found."); 
        }

        em.getTransaction().commit();
        System.out.println("Author " + id + " " + "has been removed successfully");
       
    }
    
    public void displayAllAuthor() {
    	em.getTransaction().begin();
    	List<Author> authors = em.createQuery("SELECT a FROM Author a", Author.class).getResultList();
              for (Author author : authors) {
            System.out.println("Author ID: " + author.getId() + ", Name: " + author.getName()+ ",Nationality: " + author.getNationality());
        }
        em.getTransaction().commit();
           em.close();
    }
    	
    public void displayAuthorById(int id) {
    	em.getTransaction().begin();
    	Author author = em.find(Author.class, id);
    	if(author != null) {
    		System.out.println("Author name: "+ author.getName());
    	}
    	 em.getTransaction().commit();
         em.close();
    }
    
	public static void main(String[] args) {
		
		Main main = new Main();
//        main.createAuthor();
//		main.getAuthor(3);
//		main.mergeAuthor(6);
//		main.removeAuthor(2);
//		main.displayAllAuthor();
//		main.displayAuthorById(6);
//        main.emf.close(); 
//		
	}


}
