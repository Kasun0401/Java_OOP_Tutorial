package L10_abstract;

public class Main {
    public static void main(String[] args) {
        
        // abstract =   used to define abstract classes and method
        //              Abstraction is the process of hidding implementation details
        //              and showing only the essential feature
        //              Abstract classes CANT be istalled directly
        //              Can contain 'abstract' methods (which must be implemented)
        //              Can contain 'concrete' methods (which are inherited)

        Circle circle = new Circle(7.12);
        Triangle triangle = new Triangle(2.12,2.34);
        Rectangle rectangle = new Rectangle(2.12,5.23);


        //circle.display();
        //triangle.display();
        //rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());









    }



    
}
