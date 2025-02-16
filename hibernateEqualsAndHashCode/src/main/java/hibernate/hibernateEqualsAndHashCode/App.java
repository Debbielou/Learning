package hibernate.hibernateEqualsAndHashCode;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;


public class App {
	
	private static SessionFactory sf;
	private static Session ses;
    private static Transaction trans;
    

    public App() {
        try {
            sf = new Configuration()
                    .setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/madfa_supermarket")
                    .setProperty("hibernate.connection.username", "root")
                    .setProperty("hibernate.connection.password", "Debbie@2024%")
                    .configure("hibernate.cfg.xml") 
                    .buildSessionFactory();

            ses = sf.openSession();
            trans = ses.beginTransaction();
            
                             } catch (Exception e) {  
            System.err.println("Error initializing Hibernate: " + e.getMessage());
            e.printStackTrace();  
            
        }
    }
	
	 public static void addProduct(Product product) {
	        try {
	            ses.persist(product);
	            System.out.println("Product added: " + product.name);
	        } catch (Exception e) {
	            System.out.println("Duplicate product skipped: " + product.name);
	        }
	    }
	
    
   	public static void displayAllProducts() {
   		Query<Product> query = ses.createQuery("FROM Product", Product.class);
		query.setMaxResults(4);
	    List<Product> productList = query.getResultList(); 
	    Set<Product> products = new HashSet<>(productList); // converting the list into a hashset
	     for (Product product : products) {
	        System.out.println("ID: " + product.getId() + 
	                         ", Name: " + product.getName() + 
	                         ", Category: " + product.getCategory());
	    }
	}
	
	public static void displayById(int id) {
		try {
            TypedQuery<Product> query = ses.createNamedQuery("Product.byId", Product.class);
            query.setParameter("productId", id); 
            Product product = query.getSingleResult();
            System.out.println(product); 
        } catch (NoResultException e) {
            System.out.println("Oops....invalid Id" + e); 
        }
    }

	public static void findProductByName(String productName) {
	    try {
	        TypedQuery<Product> query = ses.createQuery("FROM Product WHERE name = :productName", Product.class);
	        query.setParameter("productName", productName);
	        Product product = query.getSingleResult();
	        System.out.println(product.getName() + " " + "has been found");
	    } catch (NoResultException e) {
	        System.out.println(productName + " " + "is not found");
	    }
	}
	  
		 	 	
    public static void main( String[] args ){
    	    	App app = new App();
    	    	
//        App.displayById(40);
//        App.findProductByName("Rice");
//   	    	displayAllProducts();
//    	App.trans.commit();
//        App.ses.close();
//        sf.close();
    	    	
    	    	
//    }
//}
   
  Set<Product> productSet = new HashSet<>();
      
  
      productSet.add(new Product("Cupboard", "Furniture"));
      productSet.add(new Product("Air Fryer", "Electronics")); 
      productSet.add(new Product("Ketchup", "Kitchen")); 
      productSet.add(new Product("Air Fryer", "Electronics")); 
      productSet.add(new Product("Cupboard", "Furniture")); 
      productSet.add(new Product("Rice", "Food")); 
      
           for (Product product : productSet) {
           addProduct(product); 
                      
           }
           System.out.println("Final set of products:");
           Query query = ses.createQuery("FROM Product");
           List<Product> allProducts = query.list();
           for (Product p : allProducts) {
               System.out.println(p.name);
           }
        App.trans.commit();
        App.ses.close();
        sf.close();
    }
   }

        
   

