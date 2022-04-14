package day18_NestedLoop;

public class PracticeNestedLoop {
    public static void main(String[] args) {


        for (int i = 0; i <=10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");


            }
            System.out.println();
        }

        System.out.println("--------------------------------");

        for (int q = 10; q >0; q--) {
            for (int p = q; p >0; p--) {
                System.out.print("* ");

            }
            System.out.println();

        }

        System.out.println("-------------------------------------------");







    }
}
/*
lunch:
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */