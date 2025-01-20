package abstraction;
//create an abstract class
// abstraction is useful when one wants to create classes which have unique functionalities of the created methods
// e.g a sound method for an animal has different sounds for different animals so the parent method 'sound' would
// be overridden by each unique animal class which extends from it
abstract class Vehicle{
//	create a speed method
	public void speed() {
	System.out.println("The car is very fast");
}
	public void colour() {
	System.out.println("I love silver vehicles");
	}
	public abstract void mechanic();
	
public class AbstractLesson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		we cannot create an object of vehicle here because vehicle is an abstract class & it cannot be instantiated
//		to create an object, we create another class which extends Vehicle class & it must be public

	}

}
}

