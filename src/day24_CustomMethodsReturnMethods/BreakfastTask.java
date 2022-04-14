package day24_CustomMethodsReturnMethods;

public class BreakfastTask {
    public static void main(String[] args) {

        initials("cydeo","school"); // C.Y

        System.out.println("-------------------------------------------");

        domain("Cydeo.School@gmail.com");

        System.out.println("-------------------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for (String email : emails) {
           domain(email);
            System.out.println("----------------------------------");
            nameOfMonth(2);

        }

        System.out.println("-----------------------------------------------");

        nameOfDay(12);

        System.out.println("-------------------------------------------------");

        daysInMonth(5,2022);


    }

// 1.Create a method that can display the initials of the person.   initials(String firstName,String lastName
    public static void initials(String firstName,String lastName){
        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();
        System.out.println("initial = " + initial);

    }



// 2.Create a method that can display the domain of the email. domain(String email)
     public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
         System.out.println("domain = " + domain);
         System.out.println("------------------------------------------------");



     }



// 3.create a method that can display the name of the month based on the given number
    public static void nameOfMonth(int number){
        String name = "";
        if(number>=1 && number <=12){

            name =  (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar":(number==4)?"Apr"
                    :(number==5)?"May" :(number==6)?"June" :(number==7)?"July" :(number==8)?"August"
                    :(number==9)?"September" :(number==10)?"October" :(number==11)?"November": "December";

        }else{
            name = "Invalid";
        }
        System.out.println("Month name = " + name);





    }


//	4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number){
        String name = "";
        if(number<=7 && number>=1){
            name = (number==1)?"Monday" :(number==2)?"Tuesday" :(number==3)?"Wednesday" :(number==4)?"Thursday"
                    :(number==5)?"Friday" :(number==6)?"Saturday" :"Sunday";
        }else {
            name = "You introduced Invalid number";
        }
        System.out.println("Name of the day: "+name);



    }

//5. Create a method than can print how many days a month has
    public static void daysInMonth(int number,int year){
        String month="";


        if(number<=12 && number>=1) {

            if (number == 2 && year % 4 == 0) {
                System.out.println("have 29 days");
            } else if(number==2&& !(year%4==0)) {
                System.out.println("have 28 days");
            }else if (number == 1) {
                System.out.println("have 31 days");

            } else if (number == 3) {
                System.out.println("have 31 days");
            } else if (number == 4) {
                System.out.println("have 30 days");
            } else if (number == 5) {
                System.out.println("have 31 days");
            } else if (number == 6) {
                System.out.println("have 30 days");
            } else if (number == 7) {
                System.out.println("have 31 days");
            } else if (number == 8) {
                System.out.println("have 31 days");
            } else if (number == 9) {
                System.out.println("have 30 days");
            } else if (number == 10) {
                System.out.println("have 31 days");
            } else if (number == 11) {
                System.out.println("have 30 days");
            } else {
                System.out.println("have 31 days");
            }

        }else {
            month ="Invalid number of the month";
        }





    }


}

/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */
