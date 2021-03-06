package day45_Abstraction_Interface.shape;

public final class Sphere extends Shape implements Volume{

    private final static double pi =3.14;

    private double radius;

    public Sphere(double radius) {
        super("Sphere");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius <= 0){
            throw new RuntimeException("Invalid radius" +radius);
        }
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4/3*pi*radius*radius*radius;
    }

    @Override
    public double area() {
        return 4*pi*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                super.toString()+
                ", volume = "+ volume()+
                ", radius = " + radius +
                '}';
    }
}
