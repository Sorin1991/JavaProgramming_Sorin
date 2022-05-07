package day44_AbstractionContinue.animalTask;

public final class Parrot extends Animal implements Playable,Flyable {

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating chocolate");

    }

    @Override
    public void play() {
        System.out.println(getName() + " is playing with ball");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is fly 20km/h");
    }
}
