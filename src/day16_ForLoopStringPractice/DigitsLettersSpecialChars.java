package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {

        String str = "Cydeo12345School!@#$%WoodenSpoon";

        String digits = "";  // 12345
        String letters = ""; // CydeoWoodenSpoon
        String specialChars = "";  // !@#$%

        for (int i = 0; i < str.length(); i++) { // i : index numbers of str (0 ~ last index)

            char ch = str.charAt(i);  //ch: representing all characters which we have in str


            if(ch>'0' && ch <='9'){  // if the character is between '0' to '9'
                digits +=ch;
            }else if (ch>='A' && ch<='Z'){ // if the character is between 'A' to 'Z' then it's letter
                letters+=ch;
            }else if(ch>='a' && ch<='z'){  // if the character is between 'A' to 'Z' then it's letter
                letters+=ch;
            }else{  // if the character is not digit or letter ,then is special character
                if(ch!= ' ')  // if the special character is not the space

                specialChars+=ch;
            }

        }

        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);





    }


}
