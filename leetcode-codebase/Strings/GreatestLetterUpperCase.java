/* Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.

An English letter b is greater than another letter a if b appears after a in the English alphabet. */


class GreatestLetterUpperCase {
    public String greatestLetter(String s) {

        //array to check lowercase letters 
        boolean[] lower = new boolean[26];

        //array to check lowercase letters
        boolean[] upper = new boolean[26];


        //Traversing String
        for ( int i = 0 ; i < s.length() ; i++){

            char ch = s.charAt(i);


            //if character is lowercase mark in lower array
            if(ch >= 'a' && ch <= 'z'){

                //lower[ch-'a'] means it convert character into index number
                lower[ch-'a'] = true;       
            }


            //if character is uppercase mark in upper array
            else if(ch >= 'A' && ch <= 'Z'){

                upper[ch-'A'] = true;  
     
            }
        }
        

        //checking from 'A' to 'Z' to get the greatest letter
        for(int i = 25 ; i>=0 ; i--){

            //if it is in both lowercase and uppercase
            if(lower[i] && upper[i]){

                //convert index to uppercase character and return
                return String.valueOf((char)('A'+i));

            }
        }


        //if no such letter exists, return empty string
        return "";

    }
}