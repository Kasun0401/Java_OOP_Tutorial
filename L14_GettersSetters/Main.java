package L14_GettersSetters;

public class Main {
    public static void main(String[] args){

        // They help protect object data and rules for accessing or modifying them
        // GETTERS = Method that make a field READABLE
        // SETTERS = Method tha make a field WRITEABLE

        Car car = new Car("Charger","Red",1234);

        car.setColor("Blue");
        car.setPrice(5678);

        System.out.println(car.getColor()+" "+ car.getModel()+ " "+ car.getPrice());

    }
}
