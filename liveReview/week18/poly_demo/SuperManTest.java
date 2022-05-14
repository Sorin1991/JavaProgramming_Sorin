package week18.poly_demo;

public class SuperManTest {

    public static void main(String[] args) {

        // polymorphism
        // Interface / Parent Class RN = ChildClass

        Parent superManOne = new Father(); // you can reach Parent Abstract Class Method but you can not reach Worker Interface methods

        superManOne.feedKid();
        superManOne.playWithKId();
        superManOne.raiseKid();

       // superManOne.work("SDET") // ERROR superManOne is type of Parent abstract class

        Worker superManTwo = new Father();// you can reach Worker interface method but can not reach Parent Abstract Methods

        superManTwo.getPaid();
        superManTwo.work("SDET");

        Father superManThree = new Father();

        superManThree.feedKid();
        superManThree.playWithKId();
        superManThree.raiseKid();
        superManThree.work("QA");
        superManThree.getPaid();

        boolean b1 = superManOne instanceof Father;
        boolean b2 = superManTwo instanceof Father;
        boolean b3 = superManThree instanceof Father;

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);


           //Implicit-Casting Examples
        ((Worker)superManOne).work("Engineer");
        ((Worker)superManOne).getPaid();

        ((Parent)superManThree).raiseKid();
        ((Parent)superManThree).playWithKId();
        ((Parent)superManThree).feedKid();










    }
}
