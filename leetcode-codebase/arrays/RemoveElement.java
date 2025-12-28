/*Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k
*/




class RemoveElement {


    //method to remove all occurrences of 'val' from the array and returns the count of elements which are not equal to 'val'
    public int removeElement(int[] nums, int val) {


        //'k' represents the count of elements not equal to 'val'
        int k = 0;

        //loop through each element of the array
        for(int i = 0 ; i < nums.length ; i++){

            //checking if current element is not equal to 'val'
            if(nums[i] != val){

                //so place the element at index 'k'
                nums[k] = nums[i];

                //move 'k' to next position
                k++;
            

            }
        }

        //return number of elements that are not equal to 'val'
        return k;

    }
}