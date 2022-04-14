package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {
        char ch = '@';

        if(ch>='0' && ch<='9') {
            System.out.println("Digital");
        }else if ((ch>= 'A' && ch<='z')   || (ch>='a' && ch<='z')) {
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special character");
        }


        System.out.println("----------Ascii Table is Down-----------");

        char ch2 = 65;
        if(ch>=48 && ch<=57) {
            System.out.println("Digital");
        }else if ((ch>= 65 && ch<=90)   || (ch>=97 && ch<=122)) {
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special character");
        }





    }


}
