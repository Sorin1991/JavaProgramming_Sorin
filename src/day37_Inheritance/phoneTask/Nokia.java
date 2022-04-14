package day37_Inheritance.phoneTask;

public class Nokia extends Phone {

    public Nokia(String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println("You can use " +brand + " " + model + " as self defense tool");
    }

}
/*

Create a subclass of Phone named Nokia:
             Variables:
             brand, model, size, price, color
             Methods:
               call(long phoneNumber)
               text(long phoneNUmber)
               selfDefense()
               toString()


 */
