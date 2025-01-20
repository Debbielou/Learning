package aopWildCard;

public class Service {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void orderService() {
		System.out.println("The service is very poor.");
	}
	
}
