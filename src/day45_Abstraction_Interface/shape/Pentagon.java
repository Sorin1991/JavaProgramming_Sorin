package day45_Abstraction_Interface.shape;

public class Pentagon extends Shape implements Volume{

    private double apothem;
    private double side;
    private double length;
    private double base;
    public double height;


    public Pentagon(double apothem, double side, double length,double base,double height) {
        super("Pentagon");
        setApothem(apothem);
        setSide(side);
        setLength(length);
        setBase(base);
        setHeight(height);

    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height <= 0){
            throw  new RuntimeException("Invalid height" + height);
        }
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if(base <= 0){
            throw new RuntimeException("Invalid base" +base);
        }
        this.base = base;
    }

    public double getApothem() {
        return apothem;
    }

    public void setApothem(double apothem) {
        if(apothem <= 0){
            throw new RuntimeException("Apothem invalid" +apothem);
        }
        this.apothem = apothem;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if(side <= 0 ){
            throw new RuntimeException("Invalid side" +side);
        }
        this.side = side;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if( length <= 0){
            throw new RuntimeException("Invalid length" +length);
        }
        this.length = length;
    }

    @Override
    public double area() {
        return side * 5 *0.5 * apothem;
    }

    @Override
    public double perimeter() {
        return side *5;
    }

    @Override
    public double volume() {
        return 5/2 *apothem*base*height;
    }

    @Override
    public String toString() {
        return "Pentagon{" +
                super.toString()+
                "apothem=" + apothem +
                ", side=" + side +
                ", length=" + length +
                ", base=" + base +
                ", height=" + height +
                '}';
    }
}
