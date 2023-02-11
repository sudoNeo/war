package wGame;

import java.util.Scanner;
import static java.lang.System.*;

class Game {
    private Deck deck;
    private int roundsPlayed;
    private static final int MAX_ROUNDS = 26;
    private String p1Name;
    private String p2Name ="Dealer";
    private int p1Score;
    private int p2Score;
    private static final Scanner input = new Scanner(System.in);

    Game() {
        deck = new Deck();
        roundsPlayed = 0;
        p1Name = "You";
        p1Score = 0;
        p2Score = 0;
    }

    void run() {

       int numPlayers = 1;
        if (numPlayers == 1) {
            p2Name = "Dealer";
        } else {
          return ; // p2Name = getPlayerName(2);
        }

        Card p1Card;
        Card p2Card;

        while (roundsPlayed < MAX_ROUNDS) {
            try {
                p1Card = deck.getNextCard();
                p2Card = deck.getNextCard();

                out.printf("%n Round: %d %n%n", roundsPlayed + 1);
		out.printf("Your heart pounds...\n");
                out.printf("Your card: %s%n", p1Card.toString());
                out.printf("Dealer's card: %s%n%n",  p2Card.toString());

                if (p1Card.compareTo(p2Card) < 0) {
                    p2Score += 2;
                    out.printf("Dealer wins this round! House always wins!%n");
                } else if (p1Card.compareTo(p2Card) > 0) {
                    p1Score += 2;
                    out.printf("You win this round...%n");
                } else {
                    ++p1Score;
                    ++p2Score;
                    out.printf(" tie...%n");
                }
            } catch (Exception e) {
                out.println("An error occurred. Please try running the game again.");
            }

            out.printf("Your final score: %d%n", p1Score);
            out.printf("Dealer's final score: %d%n", p2Score);

            ++roundsPlayed;

            out.println("Enter to continue.");
            try {
                System.in.read();
            } catch (Exception e) {
                out.println("ERROR WRONG KEY MOVING ON.");
            }
        }

        out.printf("%nGame over. ");
        if (p1Score > p2Score) {
            out.printf("YOU WIN!%n");
        } else if (p1Score < p2Score) {
            out.printf("Don't you Know the house always wins..%n%n");
        } else {
            out.printf(" Tie,You, better quit while you still can...%n%n");

        }

        // get ready to run another game
        deck = new Deck();
        roundsPlayed = 0;
        p1Name = "";
        p2Name = "";
        p1Score = 0;
        p2Score = 0;
    }
   
}
