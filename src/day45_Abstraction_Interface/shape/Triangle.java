package day45_Abstraction_Interface.shape;

public final class Triangle extends Shape implements Volume{

    private double side;
    private double height;
    private double base;

    public Triangle(double side,double height,double base){
        super("Triangle");
        setSide(side);
        setHeight(height);
        setBase(base);

    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base <=0){
            throw new RuntimeException("Invalid base" +base);
        }
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<= 0){
            throw new RuntimeException("Invalid height" + height);
        }
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0){
            throw new RuntimeException("Invalid side" +side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return 0.5*height*base;
    }

    @Override
    public double perimeter() {
        return side*side*side;
    }

    @Override
    public double volume() {
        return  0.5*height*base *height;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                super.toString()+
                ", volume = "+ volume()+
                ", side = " + side +
                ", height = " + height +
                ", base = " + base +
                '}';
    }
}
