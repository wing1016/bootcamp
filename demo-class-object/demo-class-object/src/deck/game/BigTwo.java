package deck.game;

import java.util.Arrays;
import deck.Card;
import deck.Deck;
import deck.Rank;
import deck.Suit;

public class BigTwo {

  public static boolean isFourKind(Card[] cards) { // why static method, because we give some card
                                                   // to the method to check
    if (!BigTwo.chkCardLength(cards, 5)) {
      return false;
    }
    BigTwo.sortCards(cards);
    if (cards[0].getRank().getValue() == cards[1].getRank().getValue()
        && (cards[1].getRank().getValue() == cards[2].getRank().getValue()
            && cards[2].getRank().getValue() == cards[3].getRank()
                .getValue())) {
      return true;
    }

    if (cards[1].getRank().getValue() == cards[2].getRank().getValue()
        && (cards[2].getRank().getValue() == cards[3].getRank().getValue()
            && cards[3].getRank().getValue() == cards[4].getRank()
                .getValue())) {
      return true;
    }
    return false;
  }

  // what if we need to rewrite 4 method to instance method ?

  public static boolean isStraight(Card[] cards) {
    if (!BigTwo.chkCardLength(cards, 5)) {
      return false;
    }
    BigTwo.sortCards(cards);
    for (int i = 0; i < cards.length - 1; i++) {
      if (cards[i].getRank().getValue() + 1 == cards[i + 1].getRank().getValue()
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
    if (cards[0].getRank().getValue() == cards[1].getRank().getValue()
        && (cards[2].getRank().getValue() == cards[3].getRank().getValue()
            && cards[3].getRank().getValue() == cards[4].getRank()
                .getValue())) {
      return true;
    }
    if (cards[4].getRank().getValue() == cards[3].getRank().getValue()
        && (cards[2].getRank().getValue() == cards[1].getRank().getValue()
            && cards[1].getRank().getValue() == cards[0].getRank()
                .getValue())) {
      return true;
    }
    return false;
  }

  public static boolean isRoyalFlush(Card[] cards) {
    if (!BigTwo.chkCardLength(cards, 5)) {
      return false;
    }
    BigTwo.sortCards(cards);
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

 
    BigTwo.sortCards(c);
    System.out.println(Arrays.toString(c));
    System.out.println(" Is straight ?  " + BigTwo.isStraight(c));

    // full house?
    Card[] c2 = new Card[] {new Card(Suit.CLUB, Rank.FIVE),
        new Card(Suit.CLUB, Rank.THREE), new Card(Suit.SPADE, Rank.FIVE),
        new Card(Suit.HEART, Rank.THREE), new Card(Suit.DIAMOND, Rank.FIVE)};

    BigTwo.sortCards(c2);
    System.out.println(Arrays.toString(c2));
    System.out.println(" Is full house ?  " + BigTwo.isFulllHouse(c2));

    // Same Suit?
    Card[] c3 = new Card[] {new Card(Suit.DIAMOND, Rank.TWO),
        new Card(Suit.DIAMOND, Rank.THREE), new Card(Suit.DIAMOND, Rank.FIVE),
        new Card(Suit.DIAMOND, Rank.FOUR), new Card(Suit.DIAMOND, Rank.ACE)};

    System.out.println(Arrays.toString(c3));
    System.out.println(" Is same suit ?  " + BigTwo.isSameSuit(c3));

    // royal flush?
    Card[] c4 = new Card[] {new Card(Suit.CLUB, Rank.TWO),
        new Card(Suit.CLUB, Rank.THREE), new Card(Suit.CLUB, Rank.FIVE),
        new Card(Suit.CLUB, Rank.FOUR), new Card(Suit.CLUB, Rank.ACE)};

    BigTwo.sortCards(c4);
    System.out.println(Arrays.toString(c4));
    System.out.println(" Is royal flush? " + BigTwo.isRoyalFlush(c4));

    // Four Kind?
    Card[] c5 = new Card[] {new Card(Suit.CLUB, Rank.TWO),
        new Card(Suit.HEART, Rank.TWO), new Card(Suit.CLUB, Rank.ACE),
        new Card(Suit.DIAMOND, Rank.TWO), new Card(Suit.SPADE, Rank.TWO)};

    System.out.println(Arrays.toString(c5));
    System.out.println(" Is Four Kind? " + BigTwo.isFourKind(c5));

  }
}
