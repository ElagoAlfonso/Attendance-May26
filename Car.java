package subClass;

public class Car {
	
	private String Name;
	private String Tire;
	
	
	                                       // this is the constructor for the Car class
    public Car(String name, String tire) {
        this.Name = Name;
        this.Tire = Tire;
    }
    
                                           //this is the method to make the Car flat
    public void drive() {
        System.out.println("The "  + Name + " has " + Tire);
    }
    
}


