package entityListenerLearning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class HajjiFamily extends Auditable{
	
	@Id
	int id;
	String wife;
	
		public HajjiFamily() {
	}
		
	public HajjiFamily(int id, String wife) {
			this.id = id;
			this.wife = wife;
		}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWife() {
		return wife;
	}

	public void setWife(String wife) {
		this.wife = wife;
	}
	
	@Override
	public String toString() {
		return "HajjiFamily [id=" + id + ", wife=" + wife + "]";
	}

   public static void main(String[] args) {
    HajjiFamily hj = new HajjiFamily();

    Configuration conf = new Configuration();
    conf.configure("hibernate.cfg.xml"); 
    SessionFactory factory = conf.buildSessionFactory();
    Session session = factory.openSession();
    Transaction transaction = session.beginTransaction();

     hj.setId(4);
     hj.setWife("Faridah");
     hj.setCreatedBy("Saul");  
     hj.setUpdatedBy("Tim"); 


	 session.persist(hj); 

	 transaction.commit();
	 session.close();
	 factory.close(); 
		    }
		}
	


