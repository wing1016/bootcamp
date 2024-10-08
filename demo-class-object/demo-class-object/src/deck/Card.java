package deck;

import java.util.Arrays;

public class Card {

  // private String suit; // private String rank;

  private Suit suit;
  private Rank rank;

  public Card(Suit suit, Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public void setSuit(Suit s) {
    this.suit = s;
  }

  public void setRank(Rank r) {
    this.rank = r;
  }

  public Suit getSuit() {
    return this.suit;
  }

  public Rank getRank() {
    return this.rank;
  }

  // Wing try
  public boolean isJoker() {
    if (this.getRank() == null && this.getSuit() == null) {
      return true;
    }
    return false;
  }
  

  // do
  public boolean isHigerThan(Card c) {
    // Compare rank first, than suit

    // Concentrate to write an "OR" relationship
    if (this.rank.isHigerThan(c.getRank())) { // early return -CODING STYLE early return exceptional case, only base case left ( easy to think )
      return true; // exit the method
    }
    if (this.rank == c.getRank() && this.suit.isHigherThan(c.suit)) { // early return CODING STYLE
      return true; // exit the method
    }
    // All other case
    return false;
  }

  public String toString() {
    return " " + this.suit + " : " + this.rank + " ";
  }

  public static void main(String[] args) {
    Deck deck = new Deck();
    Card[] cards = deck.getCards();
    System.out.println("= = =");

    ShuffleManager sm = new ShuffleManager(cards);
    // System.out.println(Arrays.toString(sm.getCards()));
    sm.randomDeck();

    // System.out.println(Arrays.toString(sm.getCards()));

    // for (Card card : sm.getCards()) {
    // System.out.println(card);
    // }

    System.out.println(new Card(Suit.CLUB, Rank.ACE)
        .isHigerThan(new Card(Suit.HEART, Rank.QUEEN)));

    System.out.println(new Card(Suit.CLUB, Rank.TWO)
        .isHigerThan(new Card(Suit.HEART, Rank.THREE)));

    Rank.shiftValue();

    System.out.println(new Card(Suit.CLUB, Rank.ACE)
        .isHigerThan(new Card(Suit.HEART, Rank.QUEEN)));


    System.out.println(new Card(Suit.CLUB, Rank.TWO)
        .isHigerThan(new Card(Suit.HEART, Rank.THREE)));

    // Why sir dont like "else" & "else if" .
    // else if make condition looks more complicated
    // hard to read
    int x = 2;
    if (x > 3) { // x = 3
    } else if (x > 4 || x > 4 && x < 10) {
    }
  }
}

