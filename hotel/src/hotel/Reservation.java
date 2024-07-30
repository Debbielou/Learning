package hotel;

public class Reservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// initialize hotel with 30 rooms
		int totalRooms = 30;
//	get number of reserved rooms from the reception
int receptionistEntry = 27;
// get number of available rooms
int availableRooms = totalRooms - receptionistEntry;
// create an if statement to check the four scenarios
if(availableRooms == 0) {
	System.out.println("Sold out.");
}
else if(availableRooms > 10) {
System.out.println("Rooms available.");
}
else if(availableRooms <= 2) {
	System.out.println("Last remaining room.");
}
else if(availableRooms >=2 && availableRooms < 10) {
	System.out.println("Few remaining rooms left at this price.");
}
			
	}
	
	}

