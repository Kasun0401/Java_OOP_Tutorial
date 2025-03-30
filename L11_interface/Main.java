package L11_interface;

public class Main {
    public static void main(String[] args) {

        // interface =  A blueprint for a class that specifies a set of abstract methods
        //              that implementing classes MUST define
        //              Support multiple inheritance-like behaviour

        Rabbit rabbit = new Rabbit();
        Fish fish = new Fish();
        Hawk hawk = new Hawk();

        rabbit.flee();
        
        hawk.hunt();

        fish.flee();
        fish.hunt();
        
    }
    
}
