package L7_super;

public class Student extends Person {

    double gpa;

    Student(String first,String last, double gpa){

        super(first, last);
        this.gpa = gpa;
    }

    void showResult(){
        System.out.println(this.first + " having " +this.gpa + " gpa");
    }


}
