/* 
Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

Consider the number of unique elements in nums to be k​​​​​​​​​​​​​​. After removing duplicates, return the number of unique elements k.

The first k elements of nums should contain the unique numbers in sorted order. The remaining elements beyond index k - 1 can be ignored.
*/



class RemoveDuplicatesFromSortedArray {

    //method to remove duplicate elements from a sorted array and returns the number of unique elements
    public int removeDuplicates(int[] nums) {

        //if array is empty, return 0
        if(nums.length == 0){

            return 0;

        }


        //'k' represents index of next unique element, first element is always unique that's why we are initializing it with 1
        int k = 1;

        //checking from the second element
        for(int i = 1 ; i < nums.length ; i++){

            //if current element is different from previous element
            if(nums[i] != nums[i-1]){

                //store unique element at index 'k'
                nums[k] = nums[i];

                //move 'k' to the next position
                k++;

            }
        }

        //return count of unique elements
        return k;

    }
}