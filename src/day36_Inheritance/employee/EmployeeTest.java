package day36_Inheritance.employee;

public class EmployeeTest  {
    public static void main(String[] args) {

        Developer developer = new Developer();
         developer.setInfo("Sorin",'M',30,"Developer",15,100000,"MIRO");
         developer.develop();
        System.out.println(developer);


        Driver driver = new Driver();
        driver.setInfo("Sorin",'M',30,"Driver",15,100000,"SRL");
        driver.drive();
        System.out.println(driver);


        Teacher teacher = new Teacher();
        teacher.setInfo("Sorin",'M',30,"Teacher",15,10000,"School20");
        teacher.teaching();
        System.out.println(teacher);


        Tester tester = new Tester();
        tester.setInfo("Sorin",'M',30,"Tester",15,10000,"Cydeo");
        tester.test();
        System.out.println(tester);

    }




}
