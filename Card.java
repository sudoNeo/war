
import java.util.Random;

class Card {
  private String suit;
  private int cardNumber;

  public Card(String suit, int cardNumber) {
    this.suit = suit;
    this.cardNumber = cardNumber;
  }

  public String getSuit() {
    return this.suit;
  }

  public int getCardNumber() {
    return this.cardNumber;
  }
}
/*
class Deck {
  private int deckSize;
  private Card[] makeDeck;
  private Card[][] gameDeck;

  public Deck(int deckSize) {
    this.deckSize = deckSize;
    this.gameDeck = new Card[deckSize][52];
  }

  public void createDeck() {
    for (int i = 0; i < this.deckSize; i++) {
      this.makeDeck = new Card[52];
      int index = 0;
      String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

      for (String suit : suits) {
        for (int j = 1; j <= 13; j++) {
          this.makeDeck[index] = new Card(suit, j);
          index++;
        }
      }

      shuffleDeck();
      this.gameDeck[i] = this.makeDeck;
    }
  }

  private void shuffleDeck() {
    Random random = new Random();
    for (int i = this.makeDeck.length - 1; i > 0; i--) {
      int index = random.nextInt(i + 1);
      Card temp = this.makeDeck[index];
      this.makeDeck[index] = this.makeDeck[i];
      this.makeDeck[i] = temp;
    }
  }

  public Card[][] giveCards() {
    int counter = 0;
    for (int i = 0; i < this.deckSize; i++) {
      for (int j = 0; j < 52; j++) {
        if (counter % 2 == 0) {
          this.gameDeck[i][j].getSuit();
        } else {
          this.gameDeck[i][j].getSuit();
        }
        counter++;
      }
    }
    return this.gameDeck;
  }
}
*/
/*
public static void main(String[] args) {
  Deck gameDeck = new Deck(2);
  gameDeck.createDeck();

  Card[][] allCards = gameDeck.giveCards();

  for (int i = 0; i < allCards.length; i++) {
    for (int j = 0; j < allCards[i].length; j++) {
      System.out.println("Deck: " + (i + 1) + " Card: " + (j + 1) + " Suit: " + allCards[i][j].getSuit() + " Number: " + allCards[i][j].getCardNumber());
    }
  }
}
*/
