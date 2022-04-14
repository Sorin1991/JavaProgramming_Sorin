package day08_IfStatments;

public class EligibleToBuyCigarettes {
    public static void main(String[] args) {
        String name = "John";
        byte age = 16;
        boolean isEligible = age>=18;
        boolean notEligible = age<=18;
        if(isEligible){
            System.out.println("John is eligible to buy cigarettes: ");
        }else{
            System.out.println("John is not eligible to buy cigarettes:");
        }



    }


}
/*
1. Given a number (byte) age, write a program that can check if the person is eligible to buy Cigarettes
 */