package L11_interface;

public class Fish implements Prey, Predator {

    @Override

    public void flee(){

        System.out.println("*The fish is swimming away*");
    }

    public void hunt(){

        System.out.println("*The fish is hunting*");
    }



}
