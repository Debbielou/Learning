package uniqueConstraints;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Book {
	
	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="book_title")
	private String title;
	@Column(name ="book_isdn", unique = true)
	private String serialNumber;
	
	@ManyToOne
	@JoinColumn(name = "writer_id")
	private Writer writer;

	public Book() {
	}

	public Book(String title, String serialNumber, Writer writer) {
		this.title = title;
		this.serialNumber = serialNumber;
		this.writer = writer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Writer getAuthor() {
		return writer;
	}

	public void setAuthor(Writer writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", serialNumber=" + serialNumber + ", author=" + writer + "]";
	}
	
	

}
