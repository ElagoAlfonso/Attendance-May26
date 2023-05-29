package subClass;

class Plane {
	 private String Name;     //this is to call the name of the plane
	 private double WingSpan; //this is to call the wingspan of the plane

	 // this is the will call the constructor for the Plane class
   public Plane(String Name, double WingSpan) {
       this.Name = Name;
       this.WingSpan = WingSpan;
   }
   
                                        // this is the will call the method to make the plane fly
   public void fly() {
       System.out.println("The" + Name + " has a wingspan of " + WingSpan + " meters.");
   }
}
