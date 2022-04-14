package day20_Arrays;

public class MonthsWithArray {
    public static void main(String[] args) {

        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                           "August","September","October" ,"November", "December"};

        int number = 15;

        if(number<=1 || number>=12){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(months[number-1]);


    }


}
