package day21_ForEachLoop;

public class MinimumNumber {
    public static void main(String[] args) {
        int [] numbers = {10, 5 , 4, 20, 1, 0};

        int minimum = numbers[0]; //10

        for (int number : numbers) {
            if(number<minimum){
                minimum=number;


            }
        }
        System.out.println("minimum = " + minimum);




    }
}
