package Week05;

public class StringReview01 {
    public static void main(String[] args) {
        String str1 = "Java";  // literal way of creating
        // string object is created in the HEAP memory,there is a special place called String Pool"4

        String str2 = "Java"; // literal

        System.out.println(str1 == str2); // true: THE REASON : both str1 and str2 references are pointing to
        // the same object in the memory#

        String str3 = new String ("Java"); // over here we are creating totally a new object

        System.out.println(str1 == str3); // false : THE REASON str1 and str3 are pointing to a different objects

        //What does equals() method do ? It is checking for the value of the object
        System.out.println((str1.equals(str3)));

        String str4 = new String ("Java");

        // if you want to check without case sensitivity
        // equalIgnoreCase method
        System.out.println(str2.equalsIgnoreCase(str3));






    }


}
