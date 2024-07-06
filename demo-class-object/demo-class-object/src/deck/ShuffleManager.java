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
  public void shuffle() { // no input cards and no return cards

    Card[] ncards = null;
    ncards = new Card[Deck.length];

    int cut = new Random().nextInt(Deck.length); // 0 - 51
    int count = 0;

    for (int i = cut; i < cards.length; i++) {
      ncards[count++] = this.cards[i];
    }

    for (int i = 0; i < cut; i++) {
      int cpp = count++;
      ncards[cpp] = this.cards[i]; // new Random().nextInt(count++ + cut);
    }

    this.cards = ncards;
  }

  public void cutCards(int times) {
    Card[] newCards = new Card[Deck.length];

    for (int t = 0; t < times; t++) {
      // System.out.println("cut card");
      for (int k = 0; k < times; k++) {
        for (int i = 0; i < newCards.length; i++) {
          if (i < 26) {
            newCards[i * 2] = this.cards[i];
          } else {
            newCards[((i - cards.length / 2) * 2) + 1] = this.cards[i];
          }
        }
      }

    }

    this.cards = newCards;
  }

  public void midToTop(int times) {
    // System.out.println("mid to top");
    Card[] newCards = new Card[Deck.length];
    int cut = new Random().nextInt(25);
    int wide = 20;

    for (int t = 0; t < times; t++) {
      // System.out.println("m2top");
      for (int i = 0; i < cards.length; i++) {
        if (i < cut) {
          newCards[i] = this.cards[i];
        }
        if (i >= cut && i < cut + wide) {
          newCards[i + 52 - wide - cut] = this.cards[i];
        }
        if (i >= cut + wide) {
          newCards[i - wide] = this.cards[i];
        }
      }
    }

    this.cards = newCards;
  }

  public void randomDeck() {
    this.shuffle();
    this.midToTop(50);
    this.shuffle();
    this.cutCards(50);
    this.shuffle();
    this.midToTop(50);
    this.shuffle();
    this.cutCards(50);
    this.shuffle();
    this.midToTop(50);
    this.shuffle();
    this.cutCards(50);
  }


  public Card[] getCards() {
    return this.cards;
  }

}
