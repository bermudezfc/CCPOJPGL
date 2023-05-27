package Attendance7;

public class Test {
	public static void main(String[] args) {
		// Instansiate the car
		Toyota_VIOS vios = new Toyota_VIOS();
	
		System.out.println("Toyota Vios");
		System.out.println("Speed: " + vios.carSpeed);
		System.out.println("Color: " + vios.carColor);
		System.out.println("Price: " + vios.carPrice);
		System.out.println("Tire Type: " + vios.tireType);
		vios.Drive();
		vios.Stop();
		
		System.out.println();
		U2_SpyPlane plane = new U2_SpyPlane();
		
		System.out.println("U2 Spy Plane");
		System.out.println("Speed: " + plane.planeSpeed);
		System.out.println("Color: " + plane.planeColor);
		System.out.println("Price: " + plane.planePrice);
		System.out.println("Wing Span: " + plane.WingSpan);;
		plane.Fly();
		plane.Stop();
		
		System.out.println();
		Fandango_Yacht yacht = new Fandango_Yacht();
		
		System.out.println("Fandango Yacht");
		System.out.println("Speed: " + yacht.boatSpeed);
		System.out.println("Color: " + yacht.boatColor);
		System.out.println("Price: " + yacht.boatSpeed);
		System.out.println("Main Sail Color: " + yacht.MainSailColor);
		yacht.Float();
		yacht.Stop();
		
		
	}
}