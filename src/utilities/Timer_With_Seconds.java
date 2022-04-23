package utilities;

public class Timer_With_Seconds {



    public static void sleep(double seconds) {

        try {
            Thread.sleep((long) (seconds * 1000));
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }


}
