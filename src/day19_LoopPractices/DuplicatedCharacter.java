package day19_LoopPractices;

import java.util.Scanner;

public class DuplicatedCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word please :");
        String str = scan.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char eachCharacter = str.charAt(i);
            for (int j = i+1; j < str.length(); j++) {
                if(eachCharacter==str.charAt(j)){
                    System.out.println(eachCharacter);
                    System.exit(0);
                }

            }

        }

      scan.close();
    }
}
/*
1. Write a program that can return the first duplicated character from a string
	2. Write a program that cna return the index number of the first duplicated character from a string
	3. Write a program that can display all the characters that appeared twice in the string.
	4. Write a program that can return the index number of the first unique character.


 */
