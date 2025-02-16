package hibernate.hibernateAttributeConverter;

public class PhoneNumber {
	
	String countryCode;
	String number;
	
	public PhoneNumber() {
		
	}

	public PhoneNumber(String countryCode, String number) {
		this.countryCode = countryCode;
		this.number = number;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "CountryCode: " + countryCode + ", Number: " + number;
	}
	
	
	

}
