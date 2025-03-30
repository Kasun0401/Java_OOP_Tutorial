package L13_dynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism =   When the method that gets executed is decided
        //                          at runtime based on the casual type of the object

        Scanner sc = new Scanner(System.in);

        Animal animal;

        System.out.println("Choose which animal do you want? (cat = 1), (dog = 2) : ");
        int choose = sc.nextInt();

        if (choose == 1) {
            animal = new Cat();
            animal.speak();
            
        }

        else if (choose == 2) {

            animal = new Dog();
            animal.speak();
            
        }

        sc.close();
        
    }


    
}
