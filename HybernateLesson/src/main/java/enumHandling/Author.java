package enumHandling;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
	
	@Id
	@Column(name = "dept-id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="dept-Head")
	private String name;
	
	private Category category;
	
	public Author() {
		
	}

	public Author(String name, Category category) {
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public String toString() {
	    return "AuthorId: " + id + ", Name: " + name + ", Category: " + category; 
	}
	
	
	

}
