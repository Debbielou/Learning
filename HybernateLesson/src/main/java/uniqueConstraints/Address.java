package uniqueConstraints;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
		@Id
	    @GeneratedValue
	    private int id;
	    private String streetAddress;
	    	    
		public Address() {
		}

		
		public Address(String streetAddress) {
			this.streetAddress = streetAddress;
			
		}



		public int getId() {
			return id;
		}


		public String getStreetAddress() {
			return streetAddress;
		}

		public void setStreetAddress(String streetAddress) {
			this.streetAddress = streetAddress;
		}
		
		
		
		@Override
		public String toString() {
			return "Address [id=" + id + ", streetAddress=" + streetAddress + "]";
		}
		
		


	    
	    
}
