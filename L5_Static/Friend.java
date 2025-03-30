package L5_Static;

public class Friend {

    static int numOfStudent;

    String name;

    Friend(String name){

        this.name = name;
        numOfStudent++;
    }

    static void showFriends(){

        System.out.println("You have "+ numOfStudent + " friends");
    }

}
