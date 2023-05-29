package subClass;

public class Main {
public static void main (String[] args) {
		
		// Create an instance of FandagoYacht using constructor
		FandagoYacht fy = new FandagoYacht("Titanic", "White & Black");
		fy.doFloat(); //this will invoke methods on FandagoYacht
		
		// Create an instance of U_2SpyPlane using constructor
		 U_2SpyPlane u2 = new U_2SpyPlane("Boeing 747", 224.4 );
		 u2.fly();// this will invoke methods on U_2SpyPlane
		
		Vehicle vehicle = new Vehicle("Toyota-VIOS", "Touring tires");
		vehicle.drive();
	}

}
