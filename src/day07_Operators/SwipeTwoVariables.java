package day07_Operators;

public class SwipeTwoVariables {

    public static void main(String[] args) {


        int a = 10;
        int b = 15;
        int c = b;
        b = a;
        a = c;
        System.out.println("a= " + a + "\nb= "+b);


    }





}
/*
1. write a program that can swipe two variables' value by using a temporary variable

		    Ex:
		        if a= 10, b=15

		    output:
		        a = 15
		        b = 10
 */