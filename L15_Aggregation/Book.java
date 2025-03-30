package L15_Aggregation;

public class Book {

    String title;
    int pages;

    Book(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    void displayInfo(){

        System.out.println(this.title +" has ( "+ this.pages+" ) pages ");
    }
}
