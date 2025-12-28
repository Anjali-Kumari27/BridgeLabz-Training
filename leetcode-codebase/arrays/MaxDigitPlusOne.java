/*
You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.
*/


class MaxDigitPlusOne {

    public int[] plusOne(int[] digits) {

        //checking from the last digit 
        for(int i = digits.length -1 ; i >=0 ; i--){
          
            //if current digit is less than 9 , add 1 and return the result
            if(digits[i] < 9){

                digits[i]++;
                return digits;

            }

            
            //if current digit is 9 , after adding 1 it becomes 0 and carry goes to next digit
            digits[i] = 0;

        }
        
        //if we reach here, it means all digits were 9


       //created array result with one extra space
       int[] result = new int[digits.length + 1];

       //set first digit as 1 (carry)
       result[0] = 1;

       //remaining digits are already 0 by default
       return result;

    }
}