package week02;

public class PrimitivesExample {
    public static void main(String[] args) {
        /*
        DataType variableName = Value; Declare and initialize a the same line
        DataType variableName;
        variableName = value;

        data Type variableNameOne = value;

         */
        byte num1; // declaring a variable
        num1 = 123;  // Initializing a variable,assigning
        num1 = 121; // re-assign a value
        short num2 = 12398; // Declare and initialize at the same line
        int distance = 1_000_000_000;
        long distanceMore = 3_000_000_000l; //we have to put L to define the variable
        long distanceShorted = 1_000_000_000; // if it does not pass the limit then we don't have to give l
        float rate = 100.5F;
        double dNumber = 123.6;

        System.out.println("------Casting----");

        System.out.println("Before Swapping Value");
        System.out.println("num1=" + num1);
        System.out.println("num2 =" + num2);

        // You might need to swap or re-assign some different range of value

        num2 = num1; // I am assigning num1 value to num2 is |Implicit casting Widening done by the compiler
        
        System.out.println("After swapping");
        System.out.println("num2 =" +num2);

        System.out.println("Explicit Casting");
        num2 = (short) distance; // narrowing done manually,possibility of loosing data
        System.out.println("num2 = " + num2); //concatenation

        System.out.println("Explicit casting of floating points");
        
        short rateTwo = (short)rate;
        System.out.println("rateTwo = " + rateTwo);







    }
}
