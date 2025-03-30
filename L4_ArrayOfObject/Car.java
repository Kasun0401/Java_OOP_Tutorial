package L4_ArrayOfObject;


public class Car {
    
    String model;
    String color;

    Car(String model , String color){

        this.model = model;
        this.color = color;

    }

    void drive(){
        System.out.println("I will drive " + this.color + " " + this.model );

    }

}
