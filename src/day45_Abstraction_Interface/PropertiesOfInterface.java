package day45_Abstraction_Interface;

public interface PropertiesOfInterface {

     int a = 100;

    static int b = 200;  // final by default

   /* public PropertiesOfInterface(int a){
        this.a = a;
    }

    */ // you can not have constructor in interface

   /* static{
        b = 100;
    }

    */  // you can not have static block in interface you can have it in the class when he class is loaded

  /*  public void method1(){
        System.out.println("Instance method");
    }

   */  // you can not instance method in interface

    public static void method2(){
        System.out.println("Static method");
    }

    public abstract void method3();

    public default void drink (){   // default is with implementation which can be in interface
        System.out.println("Default method");
    }

}
