package day19_LoopPractices;

import java.util.Scanner;

public class ReturnIndex {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the word please:");
        String str = scan.next();

        for (int i = 0; i < str.length(); i++) {
            char eachCharacter = str.charAt(i);

            for (int j = i+1; j < str.length(); j++) {
                if(eachCharacter==str.charAt(j)){
                    System.out.print(i);
                }
            }
            System.out.println();

        }
        scan.close();

    }
}
/*
2. Write a program that cna return the index number of the first duplicated character from a string
 */