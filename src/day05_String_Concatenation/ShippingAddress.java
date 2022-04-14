package day05_String_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Sorin Raducan",
                buildingNumber = "32",
                streetName = "Linton Gardens",
                city = "London",
                state = "UK",
                zipcode = "E65EA";
        String shippingAddress = name + "\n" + buildingNumber + " " + streetName + "\n" + city + " , " + state + " , " + zipcode;


        System.out.println(shippingAddress);


    }








    }



/*
1. Create a class called ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full address
 */