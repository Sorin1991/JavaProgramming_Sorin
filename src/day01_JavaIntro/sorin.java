package day01_JavaIntro;

import java.util.Scanner;
import java.util.Arrays;

public class sorin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] names = {"Sorin","Vazilin","Oleni"};

        for (String name : names) {
            System.out.println(name);
        }
        for(int i = 0; i<names.length;i++){
            System.out.println(names[i]);
        }




    }
}