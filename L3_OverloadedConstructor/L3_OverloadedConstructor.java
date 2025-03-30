package L3_OverloadedConstructor;

public class L3_OverloadedConstructor {
    public static void main(String[] args){

        // overloaded constructor = Allow a class to have multiple constructor 
        //                          with different parameter list
        //                          Enable object to be initialized in various ways.


        User user1 = new User("Kasun");
        User user2 = new User("Kasun", "kasun098@gmail.com");
        User user3 = new User("Dasun","Dasun324@gmail.com",34);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);








    }
    
}
