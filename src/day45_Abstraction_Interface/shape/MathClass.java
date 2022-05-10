package day45_Abstraction_Interface.shape;

public class MathClass {
    public static void main(String[] args) {

        Circle circle = new Circle(2.5);
        System.out.println(circle);



        Cube cube = new Cube(5);
        System.out.println(cube);



        Cylinder cylinder = new Cylinder(1.5,5);
        System.out.println(cylinder);


        Pentagon pentagon = new Pentagon(1.5,2.8,2.3,5,7);
        System.out.println(pentagon);



        Rectangle rectangle = new Rectangle(4.3,5.6,4.5);
        System.out.println(rectangle);

        Sphere sphere = new Sphere(5.5);
        System.out.println(sphere);


        Square square = new Square(4);
        System.out.println(square);

        
        Triangle triangle = new Triangle(4.5,3.4,5.4);
        System.out.println(triangle);


    }

}
