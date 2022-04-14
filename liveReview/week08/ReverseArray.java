package week08;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] nums = {5, 10, 4, 1000, 35};

        System.out.println("Before reverse :" + Arrays.toString(nums));

        for (int i = 0; i < nums.length/2; i++){

            int temp = nums[i]; //5
            nums[i] = nums[nums.length-1-i]; // assign 1000 to first index

            nums[nums.length-1-i]= temp;

        }

        System.out.println("After reverse : " +Arrays.toString(nums));

        // Arrays utility class created by Java developers,and it has some useful method that we can use

        Arrays.sort(nums);  // sorting your elements from smaller to larger
        System.out.println(" Arrays.sort(nums) " +  Arrays.toString(nums));


        int [] numsTwo = {4, 5, 10, 35, 1000};

        int [] numsThree = nums; // creating a new reference for the same object

        System.out.println("Arrays.equals(nums,numsTwo) = " + Arrays.equals(nums,numsTwo));

        System.out.println(nums==numsTwo); // false checking if the object is equal
        System.out.println(nums ==numsThree); // true
        System.out.println(Arrays.equals(nums,numsThree));// true

        nums[0]= 5000;
        System.out.println(Arrays.toString(numsThree));

        // copy of method

        int [] numsFour = Arrays.copyOf(nums,nums.length);
        nums[0] = 3000;

        System.out.println(Arrays.toString(numsFour));





    }
}
