package L5_Static;

public class L5_Static {
    public static void main(String[] args){

        // static = Makes a variable or method belong to the class
        //        = rather than to any specific object
        //        = Commonly used for utility methods or shared resources....

        Friend friend1 = new Friend("Kasun");
        Friend friend2 = new Friend("Dasun");
        Friend friend3 = new Friend("Amal");


        System.out.println(Friend.numOfStudent);

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);

        Friend.showFriends();


    }

    
}
