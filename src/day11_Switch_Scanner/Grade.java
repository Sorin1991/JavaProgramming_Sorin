package day11_Switch_Scanner;

public class Grade {
    public static void main(String[] args) {
        char ch = 'B';
        switch (ch) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Great job");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid character");


        }


        System.out.println("------------------------------------------");


        char ch1 = 'B';
        String result = "";
        switch (ch1) {
            case 'A':
                result = ("Excellent");
                break;
            case 'B':
                result = ("Great job");
                break;
            case 'C':
                result = ("Good");
                break;
            case 'D':
                result = ("Passed");
                break;
            case 'F':
                result = ("Failed");
                break;

            default:
                result = ("Invalid character");
                break;
        }


            System.out.println(result);




        }


    }

