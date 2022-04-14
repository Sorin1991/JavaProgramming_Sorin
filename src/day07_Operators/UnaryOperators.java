package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {
        int num1 = +25;
        int num2 = -25;
        System.out.println( num1 < 0);
        System.out.println(num2<0);

        System.out.println("--------");

        int a = 5;
        ++a;  //pre increment:increase the value by 1 right away
        System.out.println(a);
        --a; // pre decrement ; decrease the value by 1 immediately
        System.out.println(a);

        int b = 100;
        System.out.println(b++); // post increment
        System.out.println(b);
        int x = 200;

        System.out.println(--x); // pre decrement: decreases the value by 1 right away
        int y = 200;
        System.out.println(y--); // post decrement;first passes the current value then decreases the value by 1







    }
}
