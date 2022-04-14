package Week05;

import java.util.Locale;

public class StringReview02 {
    public static void main(String[] args) {
        String message = "EU8 is Awesome!!";

        int count = message.length();

        System.out.println("how many characters we have : " + count);

        System.out.println(count==16);

        if(message.length()== 16){
            System.out.println("happy testing");


            System.out.println(message.toUpperCase());
            System.out.println("message after uppercase");
            System.out.println(message);

            //assign changes to a reference
            String messageTwo = message.toUpperCase();
            System.out.println(messageTwo); // EU8 IS AWESOME !!


            String str = "abc";
            str = str.trim();
            System.out.println(str);

            String str2 = "  abc cde  ";

            str2= str2.replace(" " , "");

            System.out.println(str2);

            String str3 = " EU8 Awesome ";
            str3 = str3.trim().replaceFirst(" " , "");
            System.out.println(str3);

            String str4 = " EU8 Awesome";

            str4 = str4.trim().replaceFirst(" ", "").toUpperCase().substring(3); //AWESOME

            System.out.println(str4);







        }




    }

}
