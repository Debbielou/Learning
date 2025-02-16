package libraryBookRelationship;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;


@Entity
public class Book {

	@Id
	@Column(name = "book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String title;
	private String genre;
	
	@ManyToOne
	@JoinTable(name = "author_book", 
	joinColumns = @JoinColumn(name = "book_id"),  
	inverseJoinColumns = @JoinColumn(name = "author_id"))
    Author author = new Author();


	public Book() {
		
	}

		public Book(int id, String title, String genre, Author author) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.author = author;
	}



	public int getId() {
		return id;
	}

		public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

		
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "BookID: " + id + ", Title: " + title + ", Genre: " + genre + ", Authors: " + author;
	}
	
	
}
