package deck;

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
    return "Card( " + this.suit + " : " + this.rank + " )";
  }


  public static void main(String[] args) {
    Deck deck = new Deck();
    Card[] cards = deck.getCards();
    System.out.println(cards.length);
    for (Card card : cards) {
      System.out.println(card);
    }

    // deck.shuffle(10234);
    ShuffleManager sm = new ShuffleManager(deck.getCards());
    sm.shuffle(14567);
    for (Card card : deck.getCards()) {
      System.out.println(card);
    }

    // cards.shuffle(100);

    // double d = 3.333000000000;
    // double d2 = 2.000000000;
    // System.out.println(d * d2);
  }
}
