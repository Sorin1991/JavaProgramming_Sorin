package day45_Abstraction_Interface.shape;

public final class Square extends Shape implements Volume {

    private double side;

    public Square(double side) {
        super("Square");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if( side <=0){
            throw new RuntimeException("Invalid Side "+ side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public double volume() {
        return side*side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                ", volume = "+ volume()+
                ", side = " + side +
                '}';
    }




}
