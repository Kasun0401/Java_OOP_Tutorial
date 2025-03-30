package L15_Aggregation;

public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name,int year, Book[] books){
        this.name = name;
        this.year = year;
        this.books = books;

    }

    void displayInfo(){
        System.out.println(this.name +" has established on " + this.year);
        System.out.println("Books available : ");

        for(Book book:books){
            book.displayInfo();
        }
    }
}
