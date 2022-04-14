package Week05;

public class ReverseUsingCharATMethod {
    public static void main(String[] args) {

        String word = "madam";

        System.out.println(word.charAt(4));
        System.out.println(word.charAt(3));

        String reversedWord ="";

        reversedWord +=word.charAt(4);   //  reversedWord = reversedWord +word.charAt(4);
        reversedWord+=word.charAt(3);     // += : shorthand operators
        reversedWord+=word.charAt(2);
        reversedWord+=word.charAt(1);
        reversedWord+=word.charAt(0);

        if(word.equals(reversedWord)){
            System.out.println("The word is Palindrome");
        }else {
            System.out.println("Is word Not Palindrome");
        }

        System.out.println(reversedWord);






    }

}
// what is palindrome?  " mada" when you reverse : "madam" again
// || KAYAK is palindrome,non: palindrome PIQ for JAVA