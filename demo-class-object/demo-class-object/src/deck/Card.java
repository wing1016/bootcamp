package deck;

import java.util.Arrays;

public class Card {


  private String suit;
  private String rank;

  public Card(String s, String r) {
    this.suit = s;
    this.rank = r;
  }

  public void setSuit(String s) {
    this.suit = s;
  }

  public void setRank(String r) {
    this.rank = r;
  }

  public String getSuit() {
    return this.suit;
  }

  public String getRank() {
    return this.rank;
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
    sm.shuffle(1); sm.midToTop(1);  sm.cutCards(1);sm.midToTop(1);     sm.shuffle(1); sm.midToTop(1);  sm.cutCards(1);sm.midToTop(1); 
    sm.shuffle(1); sm.midToTop(1);  sm.cutCards(1);sm.midToTop(1);
    System.out.println(Arrays.toString(sm.getCards()));


    // for (Card card : sm.getCards()) {
    //   System.out.println(card);
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