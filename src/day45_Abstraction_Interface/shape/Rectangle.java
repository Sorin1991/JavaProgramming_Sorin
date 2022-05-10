package day45_Abstraction_Interface.shape;

public class Rectangle extends Shape implements Volume{

    private  double length;
    private  double width;
    private double height;


    public Rectangle(double length, double width, double height) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0){
            throw new RuntimeException("Invalid length" +length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            throw new RuntimeException("Invalid width" +width);
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0){
            throw  new RuntimeException("Invalid height" +height);
        }
        this.height = height;
    }

    @Override
    public double perimeter() {
        return (2*length + 2*width);
    }

    @Override
    public double area() {
        return length*width;
    }

    @Override
    public double volume() {
        return length*width*height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString()+
                "length=" + length +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
