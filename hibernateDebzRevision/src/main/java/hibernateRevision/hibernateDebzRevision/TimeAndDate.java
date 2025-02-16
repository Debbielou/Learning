package hibernateRevision.hibernateDebzRevision;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class TimeAndDate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date utilDate;
	@Temporal(TemporalType.DATE)
	private Calendar utilCalendar;

	public TimeAndDate() {
		
	}

	public int getId() {
		return id;
	}

	public Date getUtilDate() {
		return utilDate;
	}

	public void setUtilDate(Date utilDate) {
		this.utilDate = utilDate;
	}

	public Calendar getUtilCalendar() {
		return utilCalendar;
	}

	public void setUtilCalendar(Calendar utilCalendar) {
		this.utilCalendar = utilCalendar;
	}


	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		TimeAndDate dAt = new TimeAndDate();
	      
	      Configuration config = new Configuration();
	      config.configure("hibernate.cfg.xml");
	      SessionFactory sf = config.buildSessionFactory();
	      Session ses = sf.openSession();
	      Transaction trans = ses.beginTransaction();
	      dAt.setUtilDate(new Date(1980,07,23));
	      dAt.setUtilCalendar(new GregorianCalendar(1972,12,21));
	      ses.persist(dAt);
	      trans.commit();
	      System.out.println("time example successful");
	      ses.close();

	}
}
