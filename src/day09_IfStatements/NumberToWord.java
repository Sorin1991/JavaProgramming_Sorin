package day09_IfStatements;

public class NumberToWord {
    public static void main(String[] args) {
        int number = 1;
        boolean number1 = number==1;
        boolean number2 = number==2;
        boolean number3 = number==3;
        boolean number4 = number==4;
        boolean number5 = number==5;
        boolean number6 = number==6;
        boolean number7 = number==7;
        boolean number8 = number==8;
        boolean number9 = number==9;



        if(number1){
            System.out.println(number +" = One");
        }else if(number2){
            System.out.println(number +" = Two");
        }else if(number3){
            System.out.println(number+" = Three");
        }else if (number4){
            System.out.println(number+" = Four");
        }else if(number5){
            System.out.println(number +" = Five");
        }else if(number6) {
            System.out.println(number +" = Six");
        }else if(number7){
            System.out.println(number + " = Seven");
        }else if(number8){
            System.out.println(number + " = Eight");
        }else if (number9){
            System.out.println(number + " = Nine");
        }else{
            System.out.println(number +" = Ten");
        }




    }

}
/*
Create a class called NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One
 */