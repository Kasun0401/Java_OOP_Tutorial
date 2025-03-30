package L16_Composition;

public class Car {

    String model;
    int year;
    Engine engine;

    Car(String model, int year, String type){
        this.model = model;
        this.year = year;
        this.engine =new Engine(type);
    }

    void display(){

        System.out.println(this.model +" has "+ this.engine.type +" engine");
    }

}
