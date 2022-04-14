package day24_CustomMethodsReturnMethods;

public class Return_vs_ExitMethod {
    public static void main(String[] args) {


            nameOfMonth(50);

        System.out.println("Hello World");



    }


    // 3.create a method that can display the name of the month based on the given number
    public static void nameOfMonth(int number) {
        String name = "";
        if (number < 1 || number > 12) {
            System.out.println("Invalid");
          return;// exits nameOfMonth of method, remaining code fragments of the method never gets executed
            //System.exit(0); is terminating all the program, so you can not see "Hello World"
         }

        name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ? "Mar" : (number == 4) ? "Apr"
                : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August"
                : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";


        System.out.println("Month name = " + name);
    }


}
