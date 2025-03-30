package L8_methodOverriding;

public class Fish extends Animal {

    @Override              // In the Fish class we overriding a move method

    void move(){

        System.out.println("This animal is swimming");
    }

}
