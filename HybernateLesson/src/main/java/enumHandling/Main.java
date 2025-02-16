package enumHandling;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Main {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myThings"); 
		EntityManager em = emf.createEntityManager(); 
		em.getTransaction().begin(); 
	
		// ENUM using @Enumerated annotator
//		DstvUsers dstv = new DstvUsers();
//		dstv.setUserName("Rose Tiko");
//		dstv.setUserStatus(UserStatus.NEUTRAL);
//		 em.persist(dstv); 
//		 em.getTransaction().commit(); 
//		 System.out.println("Oli wa tabbu nnyo dear.");
//		 em.close(); 
//		 emf.close();
		
		//custom enum mapping with AttributeConverter using convertToDatabaseColumn method.
//		Author author = new Author();
//		em.persist(author);
//		em.getTransaction().commit();
//		System.out.println("Gwaliko");
//		em.close();
//		emf.close();

		// implementation of convertToEntityAttribute method.
//		author = em.find(Author.class, 5);
//		System.out.println(author);
//		em.getTransaction().commit();
//		em.close();
//		emf.close();
		
	 
// implementing JPQL with ENUMS		
		Author author;
//	    String jpql = "select a from Author a where a.category = :category";
//		TypedQuery<Author> query = em.createQuery(jpql, Author.class);
//		query.setParameter("category", Category.MUSIC);
//		List<Author>authors = query.getResultList();
//		for (Author a : authors) {  
//		    em.persist(a);        
//		}
//		em.getTransaction().commit();
//		System.out.println(authors);
//		em.close();
//		emf.close();
		
		//Find all items with category SPORTS or MUSIC, ordered by name
//		String kweri = "SELECT a FROM Author a WHERE a.category IN (Category.SPORTS, Category.MUSIC) ORDER BY a.name";
//		TypedQuery<Author> query = em.createQuery(kweri, Author.class);
//		List<Author>authors = query.getResultList();
//		for (Author a : authors) {  
//		    em.persist(a);        
//		}
//		em.getTransaction().commit();
//		System.out.println(authors);
//		em.close();
//		emf.close();

//		Count the number of authors in each category
//		String kweshoni= "SELECT a.category, COUNT(a) FROM Author a GROUP BY a.category";
		String jpql = "SELECT new enumHandling.AuthorCount(a.category, COUNT(a)) " +
	               "FROM Author a GROUP BY a.category";
		TypedQuery<AuthorCount> query = em.createQuery(jpql, AuthorCount.class);
		List<AuthorCount> ac = query.getResultList(); 
//		System.out.println(ac);

		for (AuthorCount a : ac) {
		    System.out.println("Category: " + a.getCategory() + " " +  a.getCount());
		}
		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
