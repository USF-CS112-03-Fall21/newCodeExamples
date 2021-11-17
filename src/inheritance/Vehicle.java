package inheritance;
// Super class of class Truck.

class Vehicle {
    private int numDoors;
    private int numSeats;
    private String vin;
    private String make;

    public Vehicle() {
        this.numDoors= 4;
        this.numSeats = 4;
        this.vin = "";
        this.make = "Toyota";

    }

    public Vehicle(int numDoors, int numSeats, String vin, String make) {
        this.numDoors= numDoors;
        this.numSeats = numSeats;
        this.vin = vin;
        this.make = make;
    }

    public String toString() {
        return make +  " " + numDoors + " " + numSeats;
    }

    // Other methods

    protected int getNumDoors() {
        return numDoors;
    }
}



