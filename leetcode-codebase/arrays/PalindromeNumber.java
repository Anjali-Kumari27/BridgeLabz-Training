//It checks given number is palindrome or not

class PalindromeNumber {

    //method to check palindrome
    public boolean isPalindrome(int x) {

        //created temporary variable so the original value not lost
        int temp = x;

        //created integer variable reverse to store the reverse number 
        int reverse = 0;

        //number should be greater than zero
        while(x > 0){

            //finding digits of a number
            int digits = x % 10;

            //storing them in reverse
            reverse = reverse * 10 + digits;

            //updating the value
            x = x/10;

        }

       //if temporary value which stores the original value become equals to reverse then print true
       if(temp == reverse){

        return true;

       }

       //otherwise return false
       else{

        return false;

       }
    }

}