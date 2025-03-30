package L2_Constructors;

public class Student {

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){         // This is a constructor

        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;   

    }



    void study(){

        System.out.println(this.name + " is studying");
    }

    


}
