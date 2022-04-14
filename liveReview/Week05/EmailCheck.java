package Week05;

import java.util.Scanner;

public class EmailCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please put a valid email address: test@example.com");
        String email = input.next();

        boolean result = true;
        int atSignIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");

        if(atSignIndex<1 || atSignIndex>=email.length()-3
                || atSignIndex!=email.lastIndexOf("@")){
            result = false;
        }
        if(dotIndex <1 ||
                dotIndex==email.length() -1 // checking if it is the last character

                || atSignIndex > dotIndex //checking if @ sign is before dot sign

                || atSignIndex +1 ==dotIndex){ // checking if there is a character
            result = false;
        }

        System.out.println("result = " + result);

        input.close();






    }
}
