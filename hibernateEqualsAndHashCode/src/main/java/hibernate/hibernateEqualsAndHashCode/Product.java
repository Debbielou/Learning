package hibernate.hibernateEqualsAndHashCode;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Product.byId", query = "from Product where id = :productId")
public class Product {
	
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column(name = "product_name")
	String name;
	String category;
	
	public Product() {
		
	}

	public Product(String name, String category) {
		this.name = name;
		this.category = category;
	}

	public int getId() {
		return id;
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
	public String toString() {
		return "Product ID: " + id + ", Product Name: " + name + ", Category: " + category;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Product product = (Product) obj;
	    return name.equals(product.name); 
	
	}

	 @Override
	 public int hashCode() {
	     return name.hashCode(); 
	 }
	 
	 

}
