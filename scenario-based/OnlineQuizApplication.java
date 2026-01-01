/* Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout. */



import java.util.Scanner;

public class OnlineQuizApplication {

    // Method to display all questions with options
    public void showQuestions() {

        System.out.println("\n=========== Defence Online Quiz ===========");
        System.out.println("Answer the following MCQs:\n");

        System.out.println("1. Who is the current CDS?");
        System.out.println("a) Bipin Rawat");
        System.out.println("b) Anil Chauhan");
        System.out.println("c) Manoj Mukund Naravane");
        System.out.println("d) Ramesh Kumar\n");

        System.out.println("2. Where is the Central Command of Indian Army situated?");
        System.out.println("a) Delhi");
        System.out.println("b) Pune");
        System.out.println("c) Lucknow");
        System.out.println("d) Jaipur\n");

        System.out.println("3. Who is the current COAS (Chief of Army Staff)?");
        System.out.println("a) Anil Chauhan");
        System.out.println("b) Bipin Rawat");
        System.out.println("c) Manoj Pande");
        System.out.println("d) Dalbir Singh\n");

        System.out.println("4. Who is the author of Harry Potter?");
        System.out.println("a) Charles Dickens");
        System.out.println("b) J.K. Rowling");
        System.out.println("c) William Shakespeare");
        System.out.println("d) Mark Twain\n");

        System.out.println("5. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Chennai");
        System.out.println("c) Kolkata");
        System.out.println("d) New Delhi\n");

    }



    // Method to check answer using switch
    public int checkAnswer(int questionNo, String userAnswer) {

        int score = 0;

        switch (questionNo) {
            case 1:
                if (userAnswer.equalsIgnoreCase("b"))
                    score = 1;
                break;

            case 2:
                if (userAnswer.equalsIgnoreCase("c"))
                    score = 1;
                break;

            case 3:
                if (userAnswer.equalsIgnoreCase("c"))
                    score = 1;
                break;

            case 4:
                if (userAnswer.equalsIgnoreCase("b"))
                    score = 1;
                break;

            case 5:
                if (userAnswer.equalsIgnoreCase("d"))
                    score = 1;
                break;
        }

        return score;
    }




    //Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
  
        //created object 'quizz' for calling methods
        OnlineQuizApplication quiz = new OnlineQuizApplication();

        //String array for answers
        String[] answers = new String[5];

        //created variable totalScore which stores the score
        int totalScore = 0;

        quiz.showQuestions();


        // Taking answers using for-loop
        for (int i = 0; i < answers.length; i++) {

            System.out.print("Enter answer for Question " + (i + 1) + ": ");
            answers[i] = input.nextLine();

            totalScore += quiz.checkAnswer(i + 1, answers[i]);

        }


        System.out.println("\n=========== Result ===========");
        System.out.println("Your Score: " + totalScore + " / 5");

        input.close();

    }
}
