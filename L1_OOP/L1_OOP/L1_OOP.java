/*
OOP stands for Object Oriented Programming. 
Object-oriented programming (OOP) is a programming language model 
organized around objects rather than "actions" and data rather than logic.
 */



package L1_OOP;

public class L1_OOP {
    public static void main(String[] args){

        //  object  = An entity that holds data (atributes)
        //          = and can perform action (methods)
        //          = It is reference data type

        // class    = A class is a blueprint for the object.
        //          = Before we create an object, we first need to define the class.

        /* 
            We can think of the class as a sketch (prototype) of a house. 
            It contains all the details about the floors, doors, windows, etc. 
            Based on these descriptions we build the house. House is the object. 

         */

        

        Car car = new Car();

        // These are the attributes

        System.out.println(car.model);
        System.out.println(car.make);
        System.out.println(car.year);
        System.out.println(car.price);
        System.out.println(car.isRunning);

        // These are the actions

        car.start();
        car.stop();


    }
    
}
