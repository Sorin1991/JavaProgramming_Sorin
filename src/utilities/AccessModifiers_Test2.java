package utilities;

import day34_GarbageCollection_AccessModifiers.AccessesModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessesModifiers.publicData);
     //   System.out.println(AccessesModifiers.defaultData); // default Access Modifier is not visible outside the package
     //   System.out.println(AccessesModifiers.privateData); // private access modifier is not visible outside the package and class

        AccessesModifiers.method1(); // public
       // AccessesModifiers.method2(); // default
       // AccessesModifiers.method3(); // private


    }
}


