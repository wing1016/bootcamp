package deck;

import java.util.Random;



public class ShuffleManager {

  // attribute / Dependency
  private Card[] cards;

  public ShuffleManager(Card[] c){
    this.cards = c;
  }

  //Behavior , is mean method
  public void shuffle(int times) {    //no input cards and no return cards
    // double cut = Math.random();
    Card[] ncards = null;
    for (int k = 0; k < times; k++) {

      int cut = new Random().nextInt(Deck.length); // 0 - 51
      ncards = new Card[Deck.length];
      int count = 0;
      for (int i = cut; i < cards.length; i++) {
        ncards[count++] = this.cards[i];
      }
      for (int i = 0; i < cut; i++) {
        ncards[count++] = this.cards[i];
      }
    }
    this.cards = ncards;
  }
  
}
