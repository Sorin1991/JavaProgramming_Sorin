package day09_IfStatements;

public class maximumNumber {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        boolean aIsMaximum = a>b;
        boolean bIsMaximum = b>a;

        if(aIsMaximum){
            System.out.println(a + " is Maximum number");
        }else{
            System.out.println(b + " is Maximum number");
        }

    }


}
