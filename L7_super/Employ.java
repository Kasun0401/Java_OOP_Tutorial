package L7_super;

public class Employ extends Person {

    int salary;

    Employ(String first, String last, int salary){

        super(first,last);
        this.salary = salary;


    }

    void showSalary(){

        System.out.println(this.first + " having " + "$"+this.salary +" salary");
    }

}
