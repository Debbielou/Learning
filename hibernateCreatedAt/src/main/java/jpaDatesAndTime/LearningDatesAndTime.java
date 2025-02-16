package jpaDatesAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "date_time")
public class LearningDatesAndTime {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
//	@Temporal(TemporalType.DATE)
	private LocalDateTime date;
	
	public LearningDatesAndTime() {
			
	}

		
	public LearningDatesAndTime(String name, LocalDateTime date) {
		this.name = name;
		this.date = date;
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

		
	public LocalDateTime getDate() {
		return date;
	}


	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	
	@Override
	public String toString() {
		return "LearningDatesAndTime [id=" + id + ", name=" + name + ", date=" + date + "]";
	}


	public static void main(String[] args) {
		
		LocalDateTime ld = LocalDateTime.now();
		
		LearningDatesAndTime  ldt = new LearningDatesAndTime("Nsibimaana", ld);
	       
	       Configuration conf = new Configuration().configure("hibernate.cfg.xml");
	       SessionFactory sf = conf.buildSessionFactory();
	       Session session = sf.openSession();
//	       Session session = sf.withOptions().jdbcTimeZone(TimeZone.getTimeZone("Africa/Nairobi")).openSession();
	       Transaction trans = session.beginTransaction();
	       session.persist(ldt);
	       trans.commit();
	       System.out.println("Date inserted successfully");
	       session.close();
		
	}

}
