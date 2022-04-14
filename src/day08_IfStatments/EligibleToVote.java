package day08_IfStatments;

import java.sql.SQLOutput;

public class EligibleToVote {
    public static void main(String[] args) {
        String name = "Josh";
        int age = 35;
        String citizen = "USA";

        // Eligible
        // Not Eligible

        boolean isEligible = age >=21 && citizen == "USA";
        if(isEligible){
            System.out.println("Eligible");
        }
        if(!isEligible){
            System.out.println("Not Eligible");

        }


    }


}
