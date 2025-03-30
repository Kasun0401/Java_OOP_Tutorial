package L6_Inheritance;

public class Inheritance {
    public static void main(String[] args) {

        //   Inheritance   = One class inherits the attributes and methods
        //                 = from another class
        //                 =  child <- parent <- grand Parent


        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.eat();
        cat.eat();

        dog.speak();
        cat.speak();

        System.out.println("the dog has" + dog.lives + " lives");
        System.out.println("the dog has" + cat.lives + " lives");

        plant.photosyntasis();

        
    }
    
}
