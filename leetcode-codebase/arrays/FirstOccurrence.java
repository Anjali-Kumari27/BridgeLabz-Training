//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack



class FirstOccurrence {

    public int strStr(String haystack, String needle) {


        //loop through the string haystack
        //we only go upto haystack length - needle length
        //because if we start after that there are not enough characters left to fit the whole needle
        for (int i = 0 ; i <= haystack.length()-needle.length(); i++){


            //define j here to track the position inside the needle
            //we use j to compare each character of needle with the current part of haystack
            int j;


            //check each character of needle
            for ( j = 0 ; j < needle.length() ; j++){

                //compare character one by one
                if(needle.charAt(j)!=haystack.charAt(i+j)){

                    //stop if any character does not match
                    break;

                }
            }


            //if all characters of needle matched
            if(j == needle.length()){

                //return starting index
                return i;

            }
        }
        

        //if needle not found anywhere
        return -1;


    }
}