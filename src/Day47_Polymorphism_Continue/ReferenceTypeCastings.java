package Day47_Polymorphism_Continue;

import day44_AbstractionContinue.animalTask.Animal;
import day44_AbstractionContinue.animalTask.Cat;
import day44_AbstractionContinue.animalTask.Dog;
import day45_Abstraction_Interface.shape.Circle;
import day45_Abstraction_Interface.shape.Shape;
import day45_Abstraction_Interface.shape.Square;

public class ReferenceTypeCastings {

    public static void main(String[] args) {


       // Shape shape = (Shape)  new Circle(4);  // upcasting

        Shape shape2 = new Circle(5);
        //Dog dog2 = new Dog("Max","Husky",'M',3,"Small","White");
       // Dog dog3 = dog2;

        Animal animal = new Dog("Max","Husky",'M',3,"Small","White");

        // Dog dog = (Dog)animal;  // downcasting
        //dog.bark();

        System.out.println(animal.getName());
        //System.out.println(dog.getName());

        ( (Dog)animal ).bark();

        Shape shape1 = new Square(5);

        System.out.println( ((Square) shape1).getSide() );

        System.out.println("--------------------------------------------------------");

        Animal animal2 = new Cat("Jim","Scotish",'M',3,"Small","White");

        //Cat cat = (Cat) animal2;  // for more time to use
       // cat.meow();

        ((Cat) animal2).meow();  // for one time to use



    }


}
