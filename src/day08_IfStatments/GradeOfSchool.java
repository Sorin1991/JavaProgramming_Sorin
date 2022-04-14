package day08_IfStatments;

public class GradeOfSchool {
    public static void main(String[] args) {
        String name = "Alex";
        byte number = 5;
        boolean a = number<=5 && number>=1;
        boolean b = number>=6 && number<=8;
        boolean c = number>=9 && number<=12;
        boolean d = number>=13 && number<=16;
        boolean f = number>=17 && number<=18;

        if(a){
            System.out.println(name + " is in Elementary school");
        }else if (b){
            System.out.println(name + " is in Middle school");
        }else if (c){
            System.out.println(name + " is in High school");
        }else if (d){
            System.out.println(name + " is in College");
        }else{
            System.out.println(name + " is in Grad School");

        }



    }


}
/*

	2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */