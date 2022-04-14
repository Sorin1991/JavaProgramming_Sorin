package day37_Inheritance.phoneTask;

public class Iphone extends Phone {

    public Iphone(String model, String size, double price, String color) {
        super("Apple", model, size, price, color);
    }

    public void faceTime(long phoneNUmber){
        System.out.println(brand + " " + model + " s haveing a face Time with phone number :" + phoneNUmber);
    }

    public void faceTIme(String email){
        System.out.println(brand + " " + model + " is having a Face Time with email: " + email);
    }


}

/*
1.2 Create a subclass of phone named Iphone:
          Variables:
               brand,model, size, price, color

                Methods:
                call(long phoneNumber)
                text(long phoneNumber)
                faceTime(long phoneNumber)
                faceTime(String email)
                toString()
 */
