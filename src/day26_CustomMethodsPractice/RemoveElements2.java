package day26_CustomMethodsPractice;

import utilities.ArraysUtility;

public class RemoveElements2 {


     // remove the index from the array,returns new array on the end
    public static int [] removeElements(int[]array,int index){

        if(index < 0 || index > array.length-1){
            System.out.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = {};


        for (int i = 0; i < array.length; i++) {
            if(i !=index){
                result = ArraysUtility.addElement(result,array[i]);

            }
        }
        return  result;


    }

}
