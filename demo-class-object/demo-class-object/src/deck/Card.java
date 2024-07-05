package deck;

import java.util.Arrays;

public class Card {

  // private String suit;
  // private String rank;

  private Suit suit;
  private Rank rank;

  public Card(Suit suit2, Rank rank2) {
    this.suit = suit2;
    this.rank = rank2;
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

  // do
  public boolean isHigerThan(Card c) {
    // Compare rank first, than suit

    // Concentrate to write an "OR" relationship
    if (this.rank.isHigerThan(c.getRank())) { // early return -CODING STYLE early return exceptional case, only base case left ( easy to think )
      return true; // exit the method
    }
    if (this.rank == c.getRank() && this.suit.isHigerThan(c.suit)) { // early return CODING STYLE
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
    // for (Card card : cards) {
    // System.out.println(card);
    // }

    // deck.shuffle(10234);
    ShuffleManager sm = new ShuffleManager(cards);
    System.out.println(Arrays.toString(sm.getCards()));
    System.out.println("");


    sm.cutCards(1);
    System.out.println(Arrays.toString(sm.getCards()));
    sm.shuffle(1);
    sm.midToTop(1);
    sm.cutCards(1);
    sm.midToTop(1);
    sm.shuffle(1);
    sm.midToTop(1);
    sm.cutCards(1);
    sm.midToTop(1);
    sm.shuffle(1);
    sm.midToTop(1);
    sm.cutCards(1);
    sm.midToTop(1);
    System.out.println(Arrays.toString(sm.getCards()));


    //Why sir dont like "else" & "else if" .
    //else if make condition looks more complicated
    //hard to read
    int x = 2;
    if (x > 3) { // x = 3

    } else if (x > 4 || x > 4 && x < 10) {

    }

    // for (Card card : sm.getCards()) {
    // System.out.println(card);
    // }


  }
}
// sm.midToTop(1);
// System.out.println(Arrays.toString(sm.getCards()));
// System.out.println("");
// sm.cutCards(1);
// System.out.println(Arrays.toString(sm.getCards()));
// System.out.println("");
// sm.shuffle(1);
// System.out.println(Arrays.toString(sm.getCards()));
// System.out.println("");
// sm.midToTop(1);
// System.out.println(Arrays.toString(sm.getCards()));
// System.out.println("");
// sm.cutCards(1);
// System.out.println(Arrays.toString(sm.getCards()));
// System.out.println("");
// sm.midToTop(1);
// System.out.println(Arrays.toString(sm.getCards()));
// System.out.println("");
// sm.cutCards(1);
// System.out.println(Arrays.toString(sm.getCards()));
// System.out.println("");
// sm.shuffle(1);
// System.out.println(Arrays.toString(sm.getCards()));
