/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]

Output: 1

Example 2:

Input: nums = [4,1,2,1,2]

Output: 4

Example 3:

Input: nums = [1]

Output: 1

 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
*/

public class SingleNumber {

    // Function to find the number from the array,which appears single time
    public static int singleNumber(int[] nums) {
 
        // initialize result with 0
        int result = 0; 

        // XOR every number in the array
        for (int num : nums) {

            // XOR operation (XoR with the same number give 0, and with the number itself returns the number)
            result ^= num; 
        }

        //print the output
        return result; 
    }
}
