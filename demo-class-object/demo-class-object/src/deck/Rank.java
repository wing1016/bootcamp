package deck;

import java.beans.PropertyVetoException;

public enum Rank {
  ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGTH(8), NINE(
      9), TEN(10), JACK(11), QUEEN(12), KING(13);

      private int rank;

      private Rank(int rank){
        this.rank = rank;
      }

      public int getRank(){
        return this.rank;
      }

      public boolean isHigerThan(Rank r ){
        return this.rank > r.getRank();
      }

      //card.java pls check #sir version

}
