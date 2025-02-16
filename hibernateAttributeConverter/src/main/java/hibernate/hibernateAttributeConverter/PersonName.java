package hibernate.hibernateAttributeConverter;

public class PersonName {
	
	private String firstName;
	private String secondName;
	
	public PersonName() {
		
	}

	public PersonName(String firstName, String secondName) {
		this.firstName = firstName;
		this.secondName = secondName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	@Override
	public String toString() {
		return "FirstName: " + firstName + ", SecondName: " + secondName;
	}
	
	
	

}
