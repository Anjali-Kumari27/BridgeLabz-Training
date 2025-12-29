/* You are given a string word. A letter c is called special if it appears both in lowercase and uppercase in word, and every lowercase occurrence of c appears before the first uppercase occurrence of c.

Return the number of special letters in word. */


class CountSpecialCharacter {
    public int numberOfSpecialChars(String word) {

        //store last index of lowercase letters
        int[] lastLower = new int[26];

        //store first index of uppercase letters
        int[] firstUpper = new int[26];

        //initialize arrays with -1, it means the letter has not appeared yet
        for (int i=0 ; i<26 ; i++){

            lastLower[i] = -1;
            firstUpper[i] = -1;

        }

        //Traverse the String character by character
        for ( int i = 0 ; i < word.length() ; i++){

            
            char ch = word.charAt(i);

            //if lowercase, update last index
            if(ch >= 'a' && ch <= 'z'){

                //ch-'a' converts character to array index (0-25)
                lastLower[ch-'a'] = i;   
    
            }

            //if uppercase, set first index only once
            else if(ch >= 'A' && ch <= 'Z'){

                if(firstUpper[ch-'A']==-1){

                    firstUpper[ch-'A'] = i;
                }      
            }
        }
        
        //count variable to count special letters
        int count = 0;

        //check condition for special letters
        for (int i = 0; i < 26; i++) {
 

            //A letter is pecial if:
            //It appears in lowercase and uppercase both
            //All lowercase occurrences come BEFORE first uppercase occurrence 
            if (lastLower[i] != -1 && firstUpper[i] != -1 &&
                lastLower[i] < firstUpper[i]) {

                //incrementing count
                count++;

            }
        }

        return count;

    }
}