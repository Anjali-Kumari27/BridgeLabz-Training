/* Given an integer n, return the number of prime numbers that are strictly less than n */

class Prime {
    public int countPrimes(int n) {

        //if n is less than or equal to 2, there are no prime less than n
        if(n<=2){
            return 0;
        }

        //created Boolean array where isPrime indicates the number i is prime or not
        boolean[] isPrime = new boolean[n];

        //loop runs from 2 to end of the number
        for(int i = 2 ; i < n; i++){
          
            //assume they all are prime initially
            isPrime[i] = true;

        }

        //Remove non-prime numbers
        for (int i = 2 ; i*i < n ; i++){

            //if i is prime
            if(isPrime[i]){

                //mark all multiples of i as not prime
                for(int j = i*i ; j < n ; j+=i){

                    isPrime[j] = false;
                }
            }
        }

        //count prime numbers
        int count = 0;
        for(int i = 2 ; i < n; i++){

            if(isPrime[i]){
                count++;

            }
        }
      
   
        return count;

    }
}