public class NumberOfPens{
    public static void main(String args[]){
    int pens = 14 , students = 3;
    
    int equallyDistributedPens = (pens / students) , remainingPens = (pens % students);

    System.out.println("The Pen Per Student is " + equallyDistributedPens + " and the remaining pen not distributed is " + remainingPens);

    }
}