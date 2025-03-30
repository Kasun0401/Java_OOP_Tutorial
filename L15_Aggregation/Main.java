package L15_Aggregation;

public class Main {
    public static void main(String[] args){

        // Aggregation = Represent a "has-a" relationship between objects
        //             = one object contains another object as part of its structure
        //             = but the contained objects can exist independently

        Book book1 = new Book("Harry potter",123);
        Book book2 = new Book("Lord of the rings",1789);
        Book book3 = new Book("petter pan",1456);

        Book[] books = {book1,book2,book3};

        Library library = new Library("Sri lanka library",1987, books);

        library.displayInfo();













    }
}
