package deck.game;


import java.util.Arrays;
import deck.Card;
import deck.Deck;
import deck.Rank;
import deck.Suit;

public class BigTwo {

  public static boolean isFourKind(Card[] cards) { // why static method, because we give some card
                                                   // to the method to check

    return false;
  }

  // what if we need to rewrite 4 method to instance method q

  public static boolean isStraight(Card[] cards) {
    if (!BigTwo.chkCardLength(cards, 5)) {
      return false;
    }
    BigTwo.sortCards(cards);
    for (int i = 0; i < cards.length - 1; i++) {
      if (cards[i].getRank().getRank() + 1 == cards[i + 1].getRank().getRank()
          && i == 3) {
        return true;
      }
    }
    return false;
  }

  public static boolean isFulllHouse(Card[] cards) {
    if (!BigTwo.chkCardLength(cards, 5)) {
      return false;
    }
    BigTwo.sortCards(cards);
    if (cards[0].getRank().getRank() == cards[1].getRank().getRank()
        && (cards[2].getRank().getRank() == cards[3].getRank().getRank()
            && cards[3].getRank().getRank() == cards[4].getRank().getRank())) {
      return true;
    }
    if (cards[4].getRank().getRank() == cards[3].getRank().getRank()
        && (cards[2].getRank().getRank() == cards[1].getRank().getRank()
            && cards[1].getRank().getRank() == cards[0].getRank().getRank())) {
      return true;
    }
    return false;
  }

  public static boolean isRoyalFlush(Card[] cards) {
    if (!BigTwo.chkCardLength(cards, 5)) {
      return false;
    }
    BigTwo.sortCards(cards);
    // System.out.println(Big2.isSameSuit(cards) + " : " + Big2.isStraight(cards));
    if (BigTwo.isSameSuit(cards) && BigTwo.isStraight(cards)) {
      return true;
    }
    return false;
  }

  public static boolean isSameSuit(Card[] cards) {
    Suit s = cards[0].getSuit();
    for (int i = 1; i < cards.length; i++) {
      if (cards[i].getSuit() != s) {
        return false;
      }
      if (i == cards.length - 1) {
        return true;
      }
    }
    return false;
  }

  public static void sortCards(Card[] cards) {
    Card c = new Card(null, null);
    for (int j = 0; j < cards.length - 1; j++) {
      for (int i = 0; i < cards.length - 1; i++) {
        if (cards[i].isHigerThan(cards[i + 1])) {
          c = cards[i];
          cards[i] = cards[i + 1];
          cards[i + 1] = c;
        }
      }
    }
  }

  public static boolean chkCardLength(Card[] cards, int i) {
    if (cards.length == i) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    // Q1. how to handle 2 jokers in the deck if game dont need 2 jokers
    Deck d = new Deck(); // Q2. 52? rank? Rank.TWO is the highest in Big Two.

    Card[] c = new Card[] {new Card(Suit.CLUB, Rank.FIVE),
        new Card(Suit.CLUB, Rank.FOUR), new Card(Suit.SPADE, Rank.ACE),
        new Card(Suit.HEART, Rank.THREE), new Card(Suit.DIAMOND, Rank.TWO)};

    // full house
    Card[] c2 = new Card[] {new Card(Suit.CLUB, Rank.FIVE),
        new Card(Suit.CLUB, Rank.THREE), new Card(Suit.SPADE, Rank.FIVE),
        new Card(Suit.HEART, Rank.THREE), new Card(Suit.DIAMOND, Rank.FIVE)};

    // Same Suit
    Card[] c3 = new Card[] {new Card(Suit.DIAMOND, Rank.TWO),
        new Card(Suit.DIAMOND, Rank.THREE), new Card(Suit.DIAMOND, Rank.FIVE),
        new Card(Suit.DIAMOND, Rank.FOUR), new Card(Suit.DIAMOND, Rank.ACE)};

    // royal flush
    Card[] c4 = new Card[] {new Card(Suit.CLUB, Rank.TWO),
        new Card(Suit.CLUB, Rank.THREE), new Card(Suit.CLUB, Rank.FIVE),
        new Card(Suit.CLUB, Rank.FOUR), new Card(Suit.CLUB, Rank.ACE)};

    System.out.println(Arrays.toString(c));
    BigTwo.sortCards(c);
    System.out.println(Arrays.toString(c));
    System.out.println(" Is straight ?  " + BigTwo.isStraight(c));
    BigTwo.sortCards(c2);
    System.out.println(Arrays.toString(c2));
    System.out.println(" Is full house ?  " + BigTwo.isFulllHouse(c2));

    System.out.println(Arrays.toString(c3));
    System.out.println(" Is same suit ?  " + BigTwo.isSameSuit(c3));

    System.out.println(Arrays.toString(c4));
    System.out.println(" Is royal flush? " + BigTwo.isRoyalFlush(c4));
    System.out.println(Arrays.toString(c4));

    // System.out.println( Arrays.toString(c));
    // Q3. Do some method to check isFourKind

    // int[] arr = new int[] {9, 7, 5, 4, 2};
    // System.out.println(Arrays.toString(arr));
    // Arrays.sort(arr);
    // System.out.println(Arrays.toString(arr));

  }
}
