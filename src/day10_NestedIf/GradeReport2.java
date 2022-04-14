package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int score = 135;

      String result =  (score>=0  && score <=100)? (score>=90)? "Excellent" :(score>=80)? "Great" :(score>=70)?
              "Good" :(score>=60)? "Passed" : "Failed" : "Invalid score";
        System.out.println(result);


        System.out.println("------------------------------------");

        int score2 = 50;
       String  result2 = "";

        if (score2 >=0 && score2 <=100){

          result2 =   (score2>=90) ? "Excellent" :(score2>=80)? "Great" :(score2>=70)?
                    "Good" :(score2>=60)? "Passed" : "Failed";


            }else{

            result2 = "Invalid Score";

        }

        System.out.println(result2);






    }


}
