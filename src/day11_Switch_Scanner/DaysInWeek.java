package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

       // long number =5
        //float number = 5;
        //double number = 5;
        // boolean number = 5;
        // you can not use <=  =>

        int number = 5;

        switch (number){  // I want to compare with 1,2,3,4,5,6,7
            case 1 :
                System.out.println("Monday");
                break;   // exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break;  // exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                break;   // exits the switch after executing the case block
            case 4:
                System.out.println("Thursday");
                break;  // exits the switch after executing the case block
            case 5:
                System.out.println("Friday");
                break; // exits the switch after executing the case block
            case 6 :
                System.out.println("Saturday");
                break; // exits the switch after executing the case block
            case 7:
                System.out.println("Sunday");
                break; // exits the switch after executing the case block
            default:  // only gets executed if none of the condition been
                System.out.println("Invalid");
                // we don't need to give break statement for the last block of the switch in order to exit the switch




        }






    }



}
