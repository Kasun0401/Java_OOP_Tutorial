package L12_polymorphism;

public class Main {
    public static void main(String[] args){

        // Polymorphism =   "POLY" = "MANY"
        //                  "MORPH" = "SHAPE"
        //                  objects can identify as other objects.
        //                  Objects can be treated as object of a common superclass
        //                  Polymorphism can be archive using interface also

        Car car = new Car();
        Bike bike = new Bike();
        Ship ship = new Ship();

        //car.go();
        //bike.go();
        //ship.go();

        Vehicle[] vehicles = {car ,bike, ship};  // declare array that common class 

        for(Vehicle vehicle : vehicles){

            vehicle.go();
        }

    }
    
}
