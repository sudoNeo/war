package wGame;
import wGame.Card.Rank;
import wGame.Card.Suit;
import java.security.SecureRandom;

class Deck {
    private static final int NUM_CARDS_IN_DECK = 52;

    private static final SecureRandom rng = new SecureRandom();

    private final Card[] cards = new Card[NUM_CARDS_IN_DECK];

    // where the top card is at relative to program
    private int indexOfTopCard = 0;

    Deck() {
        createCards();
        shuffleCards();
    }

    private void createCards() {
        int numCardsCreated = 0;

        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards[numCardsCreated] = new Card(rank, suit);
                ++numCardsCreated;
            }
        }
    }
	//Shuffle!!
    private void shuffleCards() {
        int ranI;
        Card temp;

        try {
            for (int i = 0; i < NUM_CARDS_IN_DECK; ++i) {
                temp = cards[i];
                ranI = rng.nextInt(NUM_CARDS_IN_DECK);
                cards[i] = cards[ranI];
                cards[ranI] = temp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//next Card :p
    Card getNextCard() throws Exception {
        Card card;

        try {
            card = cards[indexOfTopCard];
            ++indexOfTopCard;
        } catch (ArrayIndexOutOfBoundsException e) {
		//exception case :P
            throw new Exception("Cards have been used up.");
        }

        return card;
    }
}
