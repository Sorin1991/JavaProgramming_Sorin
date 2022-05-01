package day44_AbstractionContinue.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik", "British",'M',3,"6.5","Black");
        cat.eat();
        cat.Meow();
        cat.drink();
        System.out.println("---------------------------------------------------");


        Dog dog = new Dog("Lucky","PitBull",'F',4,"10","Grey");
        dog.bark();
        dog.eat();
        dog.drink();
        System.out.println("-----------------------------------------------------------");


        Eagle eagle = new Eagle("Diran","Sokol",'M',5,"5","White");
        eagle.eat();
        eagle.drink();
        System.out.println("--------------------------------------------------------------");


        Parrot parrot = new Parrot("Miri", "Fazan",'F',3,"4","Purple");
        parrot.eat();
        parrot.drink();
        System.out.println("-----------------------------------------------------------------");

        Tiger tiger = new Tiger("Simba","Siberian",'M',4,"10","Black");
        tiger.eat();
        tiger.drink();






    }


}
