package day38_InheritanceContinue.CarTask;

public class Tesla extends Car{

    public Tesla(String model, int year, double price, String color, int miles) {
        super("Tesla", model, year, price, color, miles);
    }

    public void autoPilot(){
        System.out.println(brand+ " " + model + " is autopilot mode");
    }


}
