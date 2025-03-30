package L9_toStringMethod;

public class Car {

    String make;
    String model;
    int year;
    String color;

    Car(String make, String model, int year, String color){

        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    
    }

    @Override

    public String toString(){

        return this.color +" "+this.model +" "+this.make+" "+ this.year;
    }

}
