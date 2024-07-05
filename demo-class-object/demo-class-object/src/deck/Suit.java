package deck;

public enum Suit {
  DIAMOND(1), CLUB(2), HEART(3), SPADE(4);

  private int seq; // seq <> rank

  private Suit(int i) {
    this.seq = i;
  }

  private int getSeq() {
    return this.seq;
  }


  // most of the instance methods should refer to "this"
  // if there is no "this" keyword in your method, then probably you should
  // consider to use "Static method"
  public boolean isHigherThan(Suit s) {
    return this.seq > s.getSeq();
  }

  public static void main(String[] args) {
    // why do we have isHigherThan() , not run logic in main. bcos encapsulation
    Suit su = Suit.DIAMOND;
    su.isHigherThan(Suit.SPADE);

    // copy #sir version here

    if (su.isHigherThan(Suit.DIAMOND)) {
      // do something
    }


    // why do we have isHigherThan() ?
    Suit currentSuit = Suit.CLUB;
    Suit targetSuit = Suit.DIAMOND;

    // Meaning: comparing their ranking
    if (currentSuit.getSeq() > targetSuit.getSeq()) {

    }

    if (currentSuit.isHigherThan(targetSuit)) {

    }
  }
}
