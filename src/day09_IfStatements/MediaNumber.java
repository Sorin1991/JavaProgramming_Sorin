package day09_IfStatements;

public class MediaNumber {
    public static void main(String[] args) {
        int a = 10,
                b=15,
                c=20;

        // if we have three different numbers,one MUST be maximum,one Must be minimum and one Mus be median

        boolean aIsMedian = (a>b && a<c) || (a > c && a<b);
        /*
        in order for  A to be the median number:
        1.if c is maximum number & b is minimum number,than a is the median number
        2. if b is the maximum number & c is the minimum number,then a is the median
         */

        boolean bIsMedian = (b>c  && b<a) ||(b<c && b>a);

        /*
        when b can be median;
        if b is bigger than c and b is smaller than a than b is median
        if b is smaller than c and b is bigger than a than b is median
         */

        boolean cIsMedian = (!bIsMedian && !aIsMedian);

        if(aIsMedian){
            System.out.println(a + " is median number");

        }

        if(bIsMedian){
            System.out.println(b + " is median number");
        }

        if(cIsMedian){
            System.out.println(c + " is median number");
        }






    }
}
/*


	2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */