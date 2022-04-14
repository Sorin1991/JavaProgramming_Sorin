package Week05;

import java.util.Scanner;

public class Replit_Quiz_Question {
    public static void main(String[] args) {


/*In the given program you have a quiz question and a scanner to get the user input which will be stored on string **a**.
        after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, or invalid answer.
        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune
        a
        a is wrong
        ```
        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune
        b
        b is correct
        ```
        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune
        c
        c is wrong
        ```
        ```
        what is the farthest planet in the solar system:
        a)venus
        b)pluto
        c)neptune
        z
        z is not a valid answer
        ```*/

        Scanner input = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:");
        System.out.println("a)venus");
        System.out.println("b)pluto");
        System.out.println("c)neptune");

        String result = input.next();

        // your code
/*
        switch (result){
            case "a":
                System.out.println("a is wrong");
                break;
            case  "b":
                System.out.println("b is correct");
                break;
            case "c" :
                System.out.println("c is wrong");
                break;
            default:
                System.out.println(result+" is not a valid answer");
                break;
        }
*/

        if (result.equals("a")) System.out.println(result + " is wrong");
        else if (result.equals("b")) System.out.println(result + " is correct");
        else if (result.equals("c")) System.out.println(result + "is worng");
        else System.out.println(result + " is not a valid answer");

        input.close();


    }

}



