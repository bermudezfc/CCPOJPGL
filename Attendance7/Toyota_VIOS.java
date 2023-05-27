package Attendance7;

public class Toyota_VIOS extends Vehicle{

	String tireType = "Touring Tires";
	
	 void Drive() {
		System.out.println("The car is driving");
	}
	 
	 @Override
	 void Stop() {
		 super.Stop();
	 }
}
