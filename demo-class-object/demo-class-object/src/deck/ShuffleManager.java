package deck;

import java.util.Arrays;
import java.util.Random;

public class ShuffleManager {

  // attribute / Dependency
  private Card[] cards;

  public ShuffleManager(Card[] c) {
    this.cards = c;
  }

  // Behavior , is mean method
  public void shuffle(int times) { // no input cards and no return cards

    Card[] ncards = null;
    ncards = new Card[Deck.length];
    for (int k = 0; k < times; k++) {
      int cut = new Random().nextInt(Deck.length); // 0 - 51
      int count = 0;
      System.out.println("shuffle to front : " + cut);

      for (int i = cut; i < cards.length; i++) {
        ncards[count++] = this.cards[i];
      }

      int[] arr = new int[cut];
      for (int i = 0; i < cut; i++) {
        arr[i] = i;
      }

      for (int i = 0; i < cut; i++) {
        int cpp = count++;
        ncards[cpp] = this.cards[i]; // new Random().nextInt(count++ + cut);
      }


      System.out.println(" ");
    }
    this.cards = ncards;

  }

  public void cutCards(int times) {
    Card[] newCards = new Card[cards.length];
    System.out.println("cutCards : ");
    for (int k = 0; k < times; k++) {
      for (int i = 0; i < newCards.length; i++) {
        if (i < 26) {
          newCards[i * 2] = this.cards[i];
        } else {
          newCards[((i - cards.length / 2) * 2) + 1] = this.cards[i];
        }
      }
    }
    this.cards = newCards;
  }

  public void midToTop(int times) {
    Card[] newCards = new Card[52];
    int cut = new Random().nextInt(25); // 5 to 24
    int wide = 20;
    System.out.println("midToTop : " + cut);
    for (int i = 0; i < cards.length; i++) {
      // int cut = new Random().nextInt(Deck.length);
      if (i < cut) {
        newCards[i] = this.cards[i];
      }
      if (i >= cut && i < cut + wide) { // 18 38
        newCards[i + 52 - wide - cut] = this.cards[i];
      }
      if (i >= cut + wide) {
        newCards[i - wide] = this.cards[i];
      }

    }
    this.cards = newCards;
  }


  public Card[] getCards() {
    return this.cards;
  }

}
