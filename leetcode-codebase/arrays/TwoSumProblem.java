import.java.util.Scanner;

//class TwoSumProblem which find two elements from the array whose sum is  equal to target
public class TwoSumProblem {

    //method to find two elements from the integer array
    public int[] twoSum(int[] nums, int target) {
        
        //loop which run from index 0 to the length of the array
        for(int i = 0; i < nums.length ; i++){

            //loop which run from index 1, so it add two elements
            for(int j = i+1 ; j < nums.length ; j++) {

                //checking their sum is equal to target or not
                if(nums[i] + nums[j] == target ) {

                    return new int[] {i,j};

                }
            }
        }
    return new int[] {};

   }
}

    