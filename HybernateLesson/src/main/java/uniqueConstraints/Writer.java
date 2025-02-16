package uniqueConstraints;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Writer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "writer_name")
	private String name;
	
	@OneToMany(mappedBy = "writer", cascade = CascadeType.ALL)
	private List<Book>books;

	public Writer() {
	}

	public Writer(String name, List<Book> books) {
		this.name = name;
		this.books = books;
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

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", books=" + books + "]";
	}
	
	
	

}
