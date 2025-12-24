import java.util.Scanner;

public class DeckOfCards {

    // Method to initialize the deck of cards
    public String[] initializeDeck() {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};

       
        // total 52 cards
        int numOfCards = suits.length * ranks.length; 

        String[] deck = new String[numOfCards];

        int index = 0;


        // Loop through each suit and rank to create deck
        for (String suit : suits) {

            for (String rank : ranks) {

                deck[index++] = rank + " of " + suit;

            }
        }

        return deck;
    }



    // Method to shuffle the deck of cards
    public String[] shuffleDeck(String[] deck) {

        int n = deck.length;

        for (int i = 0; i < n; i++) {

            // Generate a random card index between i and n-1
            int randomIndex = i + (int) (Math.random() * (n - i));

            // Swap current card with random card
            String temp = deck[i];

            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;

        }

        return deck;
    }



    // Method to distribute n cards to x players
    public String[][] distributeCards(String[] deck, int numPlayers, int numCards) {

        if (numPlayers * numCards > deck.length) {

            System.out.println("Error: Not enough cards to distribute.");

            return null;
        }


        String[][] players = new String[numPlayers][numCards];

        // Distribute cards to players
        for (int i = 0; i < numPlayers; i++) {

            for (int j = 0; j < numCards; j++) {

                players[i][j] = deck[i * numCards + j];

            }
        }


        return players;

    }



    // Method to print players and their cards
    public void printPlayersCards(String[][] players) {

        if (players == null) return;

        for (int i = 0; i < players.length; i++) {

            System.out.print("Player " + (i + 1) + ": ");

            for (int j = 0; j < players[i].length; j++) {

                System.out.print(players[i][j]);

                if (j != players[i].length - 1) System.out.print(", ");

            }

            System.out.println();
        }
    }





    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Create object of DeckOfCards
        DeckOfCards game = new DeckOfCards();


        // Initialize and shuffle the deck
        String[] deck = game.initializeDeck();
        deck = game.shuffleDeck(deck);



        // Take input for number of players and cards per player
        System.out.print("Enter number of players: ");
        int numPlayers = input.nextInt();

        System.out.print("Enter number of cards per player: ");
        int numCards = input.nextInt();



        // Distribute cards to players
        String[][] players = game.distributeCards(deck, numPlayers, numCards);



        // Print the players and their cards
        game.printPlayersCards(players);



        input.close();

    }
}
