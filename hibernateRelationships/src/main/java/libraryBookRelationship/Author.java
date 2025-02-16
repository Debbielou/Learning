package libraryBookRelationship;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Author {
    
	@Id
	@Column(name = "author_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String nationality;
	
	@OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
	private List<Book>books;

	public Author(int id, String name, String nationality, List<Book> books) {
		this.id = id;
		this.name = name;
		this.nationality = nationality;
		this.books = books;
	}

	public Author() {
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "AuthorId: " + id + ", AuthorName: " + name + ", Nationality=" + nationality + ", Books: " + books;
	}
	
	
	
}
