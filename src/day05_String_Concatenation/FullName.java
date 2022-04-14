package day05_String_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Sorin";
        String lastName = "Raducan";
        int age = 30;
        String jobTitle = "Sdet";
        String CompanyName = "Cydeo";



        String fullName = firstName + " " + lastName;
        System.out.println("fullName = " + fullName);
        System.out.println("Full name of the person is " + fullName );
        System.out.println("Full name of the person is "+ fullName + " and he is " + age + " years old");
        System.out.println(fullName + " is " + age + " years old");
        System.out.println(fullName + " is " + jobTitle + ",and he works at " + CompanyName);

        // FullName is JobTitle +,he works at + CompanyName









    }




}
