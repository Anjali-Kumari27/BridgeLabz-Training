import java.util.Scanner;

public class RockPaperScissors {

    // Method to get computer choice using Math.random()
    public static String getComputerChoice() {

        // Generate random number: 0, 1 or 2
        int value = (int) (Math.random() * 3);

        // Decide rock, paper or scissors
        if (value == 0) {
            return "rock";
        } else if (value == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    // Method to decide winner between player and computer
    public static String getWinner(String player, String computer) {

        // If both choices are same → Tie
        if (player.equals(computer)) {
            return "Tie";
        }

        // Player winning conditions
        if (player.equals("rock") && computer.equals("scissors")) {
            return "Player";
        }
        if (player.equals("paper") && computer.equals("rock")) {
            return "Player";
        }
        if (player.equals("scissors") && computer.equals("paper")) {
            return "Player";
        }

        // Otherwise computer wins
        return "Computer";
    }

    // Method to build summary table
    public static String[][] buildSummary(int games,
                                          int playerWins,
                                          int computerWins,
                                          int ties) {

        // 2 rows × 3 columns summary table
        String[][] summary = new String[2][3];

        // Calculate win percentages
        double playerPercent =
                (games == 0) ? 0.0 : (playerWins * 100.0) / games;

        double computerPercent =
                (games == 0) ? 0.0 : (computerWins * 100.0) / games;

        // Player summary
        summary[0][0] = "Wins: " + playerWins;
        summary[0][1] = "Win%: " + String.format("%.2f", playerPercent);
        summary[0][2] = "Ties: " + ties;

        // Computer summary
        summary[1][0] = "Wins: " + computerWins;
        summary[1][1] = "Win%: " + String.format("%.2f", computerPercent);
        summary[1][2] = "";

        return summary;
    }

    // Method to display game results and summary
    public static void displayResults(String[][] gameResults,
                                      String[][] summary) {

        // Game result header
        System.out.println("\nGame\tPlayer\tComputer\tWinner");

        // Print each game result
        for (int i = 0; i < gameResults.length; i++) {
            System.out.println(
                    gameResults[i][0] + "\t" +
                    gameResults[i][1] + "\t" +
                    gameResults[i][2] + "\t\t" +
                    gameResults[i][3]
            );
        }

        // Print summary
        System.out.println("\nSummary (Player vs Computer)");
        System.out.println("Player\t\t" +
                summary[0][0] + "\t\t" +
                summary[0][1] + "\t\t" +
                summary[0][2]);

        System.out.println("Computer\t" +
                summary[1][0] + "\t\t" +
                summary[1][1]);
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take number of games
        System.out.print("Enter number of games want to play : ");
        int games = input.nextInt();

        // Store results of each game
        String[][] gameResults = new String[games][4];

        // Counters
        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        for (int i = 0; i < games; i++) {

            // Take player input
            System.out.print("Enter choice (rock/paper/scissors): ");
            String playerChoice = input.next().toLowerCase();

            // Computer choice
            String computerChoice = getComputerChoice();

            // Decide winner
            String winner = getWinner(playerChoice, computerChoice);

            // Store game data
            gameResults[i][0] = String.valueOf(i + 1);
            gameResults[i][1] = playerChoice;
            gameResults[i][2] = computerChoice;
            gameResults[i][3] = winner;

            // Update counters
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                ties++;
            }
        }

        // Build summary
        String[][] summary =
                buildSummary(games, playerWins, computerWins, ties);

        // Display results
        displayResults(gameResults, summary);

        input.close();
    }
}
