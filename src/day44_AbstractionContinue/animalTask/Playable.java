package day44_AbstractionContinue.animalTask;

public interface Playable {

      boolean isFriendly = true; // static & final by default in interface
     /*
     public static void method1(){
          System.out.println(isFriendly);
     }

      */

     void play(); // abstract by default

}

