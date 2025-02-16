package hibernetLifeCycle.hibernateCreatedAt;

import java.sql.Timestamp;
import java.util.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
public class CreatedAt {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	@Column(updatable = false)
	private Timestamp createdAt;
	@Column(nullable = false)
	private String customer;
	

	public CreatedAt(int orderId, Timestamp createdAt, String customer) {
		this.orderId = orderId;
		this.createdAt = createdAt;
		this.customer = customer;
	}


	public CreatedAt() {
		
		
	}


	public int getOrderId() {
		return orderId;
	}


	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}


	public Timestamp getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}


	public String getCustomer() {
		return customer;
	}


	public void setCustomer(String customer) {
		this.customer = customer;
	}

	@PrePersist
  protected void onCreate() {
  LocalDateTime localDateTime = LocalDateTime.now();
  ZoneId zoneId = ZoneId.systemDefault();
  ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
  createdAt = Timestamp.valueOf(zonedDateTime.toLocalDateTime());
}
		 

	public static void main(String[] args) {
		
		CreatedAt cat = new CreatedAt();
		cat.setCustomer("Junior");
		
	  Configuration conf = new Configuration();
      conf.configure("hibernate.cfg.xml");
      SessionFactory sef = conf.buildSessionFactory();
      Session session = sef.openSession();
      Transaction transaction = session.beginTransaction();
      session.persist(cat);
      transaction.commit();
      session.close();
  	

	}

}
