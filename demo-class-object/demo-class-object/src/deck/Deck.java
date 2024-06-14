package deck;

import java.util.Random;

public class Deck {

  private static String[] suits =
      new String[] {"DIAMOND", "CLUB", "HEART", "SPACE"};

  private static String[] ranks = new String[] {"1", "2", "3", "4", "5", "6",
      "7", "8", "9", "10", "11", "12", "13"};
  // player, deck, card,

  private Card[] cards;
  public static int length = suits.length * ranks.length;

  public Deck() {
    this.cards = new Card[suits.length * ranks.length];
    int i = 0;
    for (String suit : suits) {
      for (String rank : ranks) {
        // this.cards(suit, rank);
        this.cards[i++] = new Card(suit, rank);
      }

    }

    // for (int i = 0; i < suits.length; i++) {
    // for (int j = 0; j < ranks.length; j++) {
    // Card[k] = suits[i] + " " + ranks[j];
    // }
    // }
  }

 //Behavior , is mean method
//  public void shuffle(int times) {
//   // double cut = Math.random();
//   Card[] ncards = null;
//   for (int k = 0; k < times; k++) {

//     int cut = new Random().nextInt(Deck.length); // 0 - 51
//     ncards = new Card[Deck.length];
//     int count = 0;
//     for (int i = cut; i < cards.length; i++) {
//       ncards[count++] = this.cards[i];
//     }
//     for (int i = 0; i < cut; i++) {
//       ncards[count++] = this.cards[i];
//     }
//   }
//   this.cards = ncards;
// }

  public Card[] getCards() {

    // Card[] cards = new Card[52];
    // return cards;
    return this.cards;
  }

  public static void main(String[] args) {
    System.out.println(Math.random());
  }

}