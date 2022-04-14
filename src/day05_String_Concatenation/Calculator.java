package day05_String_Concatenation;

public class Calculator {

    public static void main(String[] args) {

        int firstNumber = 100;
        int secondNumber = 50;
        int addition = firstNumber + secondNumber;
        int substraction = firstNumber - secondNumber;
        int muliplication = firstNumber * secondNumber;


        System.out.println(firstNumber - secondNumber);
        System.out.println(firstNumber * secondNumber);

        // 100 + 50 = 150
        System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber) );

        // 100 - 50 = 50
        System.out.println(firstNumber + " - " + secondNumber + " = " + substraction);

        // 100 * 50 = 5000

        System.out.println(firstNumber + " * " + secondNumber + " = " + muliplication);



    }
}
