package day42_Exceptions;


class FadyException extends RuntimeException{ // custom unchecked exception
    public FadyException(){
        System.out.println("Time for a short break");
    }

    public FadyException(String message){
        super(message);
    }
}

class NoBreakException extends RuntimeException{ // custom checked exception

}

public class CustomExceptions {

    public static void main(String[] args) {


        //throw new FadyException("It's time for lunch break");

       try {
           throw new NoBreakException();

       }catch (NoBreakException e){
           e.printStackTrace();
       }

    }
}
