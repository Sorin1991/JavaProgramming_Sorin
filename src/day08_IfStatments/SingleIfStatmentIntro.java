package day08_IfStatments;

public class SingleIfStatmentIntro {

    public static void main(String[] args) {
        int number = 301;

       /*
        System.out.println("Odd number");

        System.out.println("Even Number");

        */

        boolean evenNumber = number%2==0;
        boolean oddNumber = !evenNumber;

        if(evenNumber)  {
            System.out.println(number + " is even number");
        }

        if(oddNumber){ // not even number
            System.out.println(number + " is odd number" );
        }

        System.out.println("--------------------------");

        int n = 200;
       if(n>0){
           System.out.println(n + " is positive");
       }

       if(n<0) {
           System.out.println(n + " is negative");
       }
       if(n==0){
           System.out.println(n + " is zero");


       }






    }
}
