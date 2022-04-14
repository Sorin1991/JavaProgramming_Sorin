package week07;

public class Task01 {
    public static void main(String[] args) {
        int rows=5;
        for (int i = 1; i <= rows; i++) {
            int num = i;
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num = num + rows - k;
            }
            System.out.println();
        }

        System.out.println("--------------------------------------");

        int rowCount = 5;

        for (int row = 1; row <= rowCount; row++) {
            int value = row;

            for (int col = 1; col <=row ; col++) {
                System.out.print(value +" ");
                value += rowCount -col;
            }
            System.out.println();
        }





    }
}
/*
Print below pattern using loop

            rows : 5
            columns : 5

            1
            2 6
            3 7 10
            4 8 11 13
            5 9 12 14 15
 */