//created YoungestTallest Class for finding which one member is youngest and which one is heighst among three friends
import java.util.Scanner;

public class YoungestTallest{
    public static void main(String args[]){
    Scanner input = new Scanner(System.in);

    
    
    //taking age of three friends from the user
    int amarAge = input.nextInt();
    int akbarAge = input.nextInt();
    int anthonyAge = input.nextInt();

    //taking height of three friends from the user
    int amarHeight = input.nextInt();
    int akbarHeight = input.nextInt();
    int anthonyHeight = input.nextInt();
    
    //comparing age of them through less than or equal to perator <= 
    if(amarAge <= akbarAge  && amarAge <= anthonyAge){
            System.out.println("Amar is Youngest");
            }
          
          else if(akbarAge <= amarAge  &&  akbarAge <= anthonyAge)
            {
             System.out.println("Akbar is Youngest");
            }
          
          else
            {
             System.out.println("Anthony is Youngest");
            }

    
    //comparing height of them for finding tallest one
    if(amarHeight>= akbarHeight  &&  amarHeight >= anthonyHeight){
            System.out.println("Amar is the tallest");
            }
          
          else if(akbarHeight >= amarHeight  &&  akbarHeight >= anthonyHeight)
            {
             System.out.println("Akbar is the tallest");
            }
          
          else
            {
             System.out.println("Anthony is the tallest");
            }
      

    input.close();

    }
}