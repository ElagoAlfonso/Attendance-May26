package subClass;

public class FandagoYacht extends Boat  {
	
	private String MainSail_color;         // //this is to call the color of the main sail
    
                                          // this is the constructor for the FandagoYacht class
    public FandagoYacht(String name, String mainSailColor) {
    	
        super(name);                      // this is the will call the constructor of the superclass (Boat)
        this.MainSail_color = MainSail_color;
    }

}
