package deck.game;

import deck.Card;

public class HandManager {
  
  private Card[ ] cards;

  public HandManager(Card[] c){
    this.cards = c;
  }


  //from static method -> to instance method
  public boolean isFulllHouse(){  // need to yan sheung this method has no input.
    return false;
  }

  // java -> how to put state into a object
  //先有行為再ASSIGN個人落入去
}
