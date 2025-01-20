package inversionOfControlXml;

public class School {

	private int regNumber;
	private String name;
	
	public School() {
	}

	public School(int regNumber, String name) {
		this.regNumber = regNumber;
		this.name = name;
	}

	public int getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLeftFoot() {
		
		return "I love mubisi";
	}
	
	public void greetMe() {
		System.out.println("Hello madam");
	}
	
	
}
