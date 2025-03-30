package L2_Constructors;

public class L2_Constructors {
    public static void main(String[] args){

        //   Constructor  = A special method to initialize object
        //                = You can pass arguments to a constructor
        //                =  and set up initial value

        Student student1 = new Student("Kasun", 23, 2.34);
        Student student2 = new Student("Milan", 34, 3.4);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);


        student1.study();
        student2.study();




    }
    
}
