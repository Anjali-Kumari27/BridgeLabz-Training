/* Given a string s, return the string after replacing every uppercase letter with the same lowercase letter */



class ToLowerCase {
    public String toLowerCase(String s) {

        //converting string into character array because string is immutable
        char[] ch = s.toCharArray();


        //through loop checking if character are in uppercase
        for(int i = 0 ; i < ch.length ; i++){

            if(ch[i] >= 'A' && ch[i] <= 'Z'){

                //converting them in lowercase by adding 32 to it (ASCII value)
                ch[i] = (char)(ch[i]+32);

            }
        }

        //returning as string after conversion
        return new String(ch); 

    }
}