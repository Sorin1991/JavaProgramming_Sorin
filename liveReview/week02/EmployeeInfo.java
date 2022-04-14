package week02;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
        *name
        * companyName
        * job|Title
        * gender
        * salary
        * employeeID
        * hasBenefits(Y/N)
        * isMarried

         */

        String name = "Sorin";
        String companyName = "Croma Vigilant";
        String jobTitle = "Security";
        char gender = 'M';
        double salary = 29_000;
        int employeeID = 6738;
        boolean hasBenefits = false;
        char isMarried = 'Y';
        System.out.println("My name is: " + name + " I am " + gender + ",\n I am working in: " + companyName +
                        " as a " + jobTitle + " \nMy Salary is : " +salary + " My employee number is: " +employeeID +
                         "\nMarried: " + isMarried
                );





    }


}
