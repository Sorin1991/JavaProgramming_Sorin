package day31_Constrcutors;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Daniel",'M',32);


        Person person2 = new Person("Kseniia",'F',28);

        person2.age =30; // changing age if you need

        System.out.println(person1);
        System.out.println(person2);




    }


}
