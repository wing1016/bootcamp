package deck;

public enum Suit {
  DIAMOND(1), CLUB(2), HEART(3), SPADE(4);

  private int seq;  // seq <> rank

  private Suit(int i) {
    this.seq = i;
  }

  private int getSeq() {
    return this.seq;
  }

  public boolean isHigerThan(Suit s){
    return this.seq > s.getSeq();
  }

  public static void main(String[] args) {
    //why do we have isHigherThan()  , not run logic in main. bcos encapsulation
    Suit su = Suit.DIAMOND;
    su.isHigerThan(Suit.SPADE); 

    // copy #sir version here

    if (su.isHigerThan(Suit.DIAMOND)) {
        // do something
    }
  }
}
