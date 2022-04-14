package Week05;

import java.util.Scanner;

public class BankExample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email address:");
        String email = input.nextLine();

        boolean condition1 = email.indexOf("@") > 0 && email.indexOf("@") == email.lastIndexOf("@");
        boolean condition2 = email.lastIndexOf(".") > email.indexOf("@");

        if (condition1 && condition2) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
        input.close();





    }

}

/*
Your team has created a new bank website that requires email address to be validated.
The email string must contain an '@' character.
The email string must contain an '.' character.
The '@' must contain at least one character in front of it.
e.g. "a@example.com" is valid while "@example.com" is invalid.
The '.' and '@' must be in the appropriate places.
e.g. "mike.smith@com" is invalid while "mike.smith@example.com" is valid.
For a given string, find a solution that writes true on the console if an email is valid and false if it is invalid.
Examples:
str = "test@example.com" --> true
str = "test@example.co.in --> true
str = "@example.com" --> false
 */
