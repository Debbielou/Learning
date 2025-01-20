package constructorInjectionDependency;

public class Address {
	
	String district;
	String county;
	
	public Address(String district, String county) {
		this.district = district;
		this.county = county;
	}
	
	

	public Address() {
	}



	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCounty() {
		return county;
	}
	
	

	@Override
	public String toString() {
		return "Address [district=" + district + ", county=" + county + "]";
	}

	public void setCounty(String county) {
		this.county = county;
	}
	
	

}
