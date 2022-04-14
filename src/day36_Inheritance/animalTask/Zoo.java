package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max","Husky", 'M',2,"Small","White");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();

        //dog.hunt();  is from Tiger Class
       // dog.scratch(); is from cat class

        Cat cat = new Cat();
        cat.setInfo("Tarcin","British",'M',3,"Small","Brown");

        cat.eat();
        cat.sleep();
        cat.drink();
        cat.move();
        //cat.bark() is from Dog class you can not call them
        //cat.hunt()  is from tiger class you can not call them
        cat.scratch();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher","Bengal",'M',5,"Large","Red");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();





    }

}
