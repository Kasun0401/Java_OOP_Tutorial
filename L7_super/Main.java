package L7_super;

public class Main {
    public static void main(String[] args){

        // super =  Refer to the parent class ( subclass <- superclass)
        //          used in constructor and method overriding
        //          call the parent constructor to initialize atributes

        Person person = new Person("Tom", "Riddle");

        Student student = new Student("Harry", "Potter", 2.34);

        Employ employ = new Employ("Kasun", "Amaraweera", 60000);

        person.showName();

        student.showResult();

        employ.showSalary();


    }
    
}
