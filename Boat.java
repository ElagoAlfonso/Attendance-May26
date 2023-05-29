package subClass;



class Boat {
    private String Name; //this is to call the name of the boat
    
    // this is the constructor for the Boat class
    public Boat(String name) {
        this.Name = name;
    }
 //this is the method to make the boat float
    public void doFloat() {
        System.out.println(Name + " is now rotting under the Atlantic Ocean");
    }
}



