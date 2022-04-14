package day18_NestedLoop;

public class Practice2 {
    public static void main(String[] args) {

        for (int i = 5; i >=1; i--) {

            for (int j = 4; j >= 0; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <=5 ; k++) {

                System.out.print("* ");

            }
            System.out.println();
            
        }
        
        
    }
}
/*

 * * * * *
   * * * *
     * * *
       * *
         *
         5 lines for outer loop


 */