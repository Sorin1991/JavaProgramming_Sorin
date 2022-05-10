package day45_Abstraction_Interface.shape;

public class Cube extends Shape implements Volume{


    private double side;

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <=0){
            throw  new RuntimeException("Invalid side" + side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * 6;
    }

    @Override
    public double perimeter() {
        return side * 12;
    }

    @Override
    public double volume() {
        return side * side * side;
    }

    @Override
    public String toString() {
        return "Cube{" +
                super.toString()+
                "side=" + side +
                '}';
    }
}
