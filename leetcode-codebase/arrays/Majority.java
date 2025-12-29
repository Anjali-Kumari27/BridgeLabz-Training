/* Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array. */

class Majority {
    public int majorityElement(int[] nums) {
        
        //variable to store possible majority element
        int majority = 0;

        //counter to count to maintain balance between majority and other elements 
        int count = 0;

        //Traversing the array
        for(int i = 0; i < nums.length ; i++){
            
            //if count becomes 0, select current element as new majority
            if(count == 0){

                majority = nums[i];

            }


            //if current element is same as majority increase count
            if(nums[i]==majority){

                count++;

            }

            //if different element found decrease count
            else{
                count--;
            }
        }

        //return majority element
        return majority;

    }
}