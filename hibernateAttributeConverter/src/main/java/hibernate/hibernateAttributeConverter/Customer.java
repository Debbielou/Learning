package hibernate.hibernateAttributeConverter;

import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
	
	@Id
	private int id;
	@Convert(converter = PersonNameConverter.class)
	private PersonName personName;
	private String email;
	@Convert(converter = PhoneNumberConverter.class)
	private PhoneNumber phonenumber;
	
	
	
	public Customer() {
		
	}

	
	public Customer(int id, PersonName personName, String email, PhoneNumber phonenumber) {
		this.id = id;
		this.personName = personName;
		this.email = email;
		this.phonenumber = phonenumber;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public PersonName getPersonName() {
		return personName;
	}


	public void setPersonName(PersonName personName) {
		this.personName = personName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public PhoneNumber getPhonenumber() {
		return phonenumber;
	}


	public void setPhonenumber(PhoneNumber phonenumber) {
		this.phonenumber = phonenumber;
	}


	@Override
	public String toString() {
		return "CustomerId: " + id + ", PersonName: " + personName + ", Email: " + email + 
				", Phonenumber=" + phonenumber;
				
	}

}
	