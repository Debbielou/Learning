package abstraction;

public class Kigege extends Vehicle {
	
//	@override
	public void speed() {
		System.out.println("The has a speedlimit of 80");
	}
	public void mechanic() {
		System.out.println("repair my car");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kigege myCar = new Kigege();
		myCar.speed();
		myCar.colour();
		myCar.mechanic();

	}

}
