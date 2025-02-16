package hibernate.hibernateEqualsAndHashCode;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Products {
	 int id;
	 String name;
	 String category;
	 
	 	
	public Products(int id, String name, String category) {
		this.id = id;
		this.name = name;
		this.category = category;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}



	@Override
    public boolean equals(Object j) {
        if (this == j) return true;
        if (j == null || getClass() != j.getClass()) return false; 

        Product product = (Product) j;
        return name.equals(product.name) && category.equals(product.category); 

    }
// Example 1:
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, category);
//    }

    // Example 2:  Simple concatenation and hashing
//    @Override
//    public int hashCode() {
//        return (name + category).hashCode();
//    }
	
//	@Override
//    public int hashCode() {
//        int result = 17;
//        result = 31 * result + name.hashCode();
//        result = 31 * result + category.hashCode();
//        return result;
//    }
	
	private static void addProductAndDisplayHashCode(Set<Product> productSet, Product product) {
        productSet.add(product);
        System.out.println("Product: " + product.getName() + ", " + product.getCategory() +
                ", HashCode: " + product.hashCode());
    }



    public static void main(String[] args) {
    	Set<Product> productSet = new HashSet<>();

        // implementation of example 1
//        Product product1 = new Product("Blanket", "Bedroom");
//        Product product2 = new Product("Pillows", "Bedroom");
//        Product product3 = new Product("Blanket", "Bedroom"); 

        // Add products to the HashSet
//        productSet.add(product1);
//        productSet.add(product2);
//        productSet.add(product3); 

        // Print the set (duplicates will be removed)
//        for (Product p : productSet) {
//            System.out.println(p.getName() + ", " + p.getCategory());
//        }
        
        
        Product product4 = new Product("Kettle", "Kitchen ware");
        Product product5 = new Product("Body Scrub", "Cosmetics");
        Product product6 = new Product("Kettle", "Kitchen ware"); 

        // Add products to the HashSet and display their hash codes
        addProductAndDisplayHashCode(productSet, product4);
        addProductAndDisplayHashCode(productSet, product5);
        addProductAndDisplayHashCode(productSet, product6);

        // Print the set (duplicates will be removed)
        System.out.println("\nFinal set of products:");
        for (Product p : productSet) {
            System.out.println(p.getName() + ", " + p.getCategory());
        }
    }
        
    }


//	}


