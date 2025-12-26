/* Problem : Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "" */


class FindLongestCommonPrefix {

    //Method to find longest common prefix
    public String longestCommonPrefix(String[] strs) {

        //if the list of words is empty then there is no common prefix
        if ( strs == null || strs.length == 0){
            return "";
        }



        //take the first word as starting prefix, we will compare this prefix with all other words
        String prefix = strs[0];



        //accessing each word starting from the second one 
        for (int i = 1 ; i < strs.length ; i++){

            //checking if the current word starts with prefix or not
            while(!strs[i].startsWith(prefix)){

                //if not then keep removing the last character from the prefix
                prefix = prefix.substring(0,prefix.length()-1);


                //if prefix becomes empty it means no common prefic exists
                if(prefix.isEmpty()){

                    return "";

                }
            }
        }


        //After checking all words return the common prefix
        return prefix;

    }
}