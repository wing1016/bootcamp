package deck;

public enum Rank {
  ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGTH(8), NINE(
      9), TEN(10), JACK(11), QUEEN(12), KING(13);

  private int value;

  private Rank(int v) {
    this.value = v;
  }

  public static void shiftValue() {
    for (Rank r : Rank.values()) {
      r.value = r.value - 2 < 1 ? r.value + 11 : r.value - 2;
    }
  }

  public int getValue() {
    return this.value;
  }

  public boolean isHigerThan(Rank r) {
    return this.value > r.getValue();
  }

  public boolean isSameRank(Rank r) {
    return this.value == r.value;
  }
  // card.java pls check #sir# version

  public static void main(String[] args) {

    for (Rank rn : Rank.values()) {
      System.out.print(" ");
      System.out.print(rn.value);
    }

    System.out.println(Rank.ACE.isHigerThan(Rank.QUEEN));
    Rank.shiftValue();
    System.out.println(" ");

    for (Rank rn : Rank.values()) {
      System.out.print(" ");
      System.out.print(rn.value);
    }
    System.out.println(Rank.ACE.isHigerThan(Rank.QUEEN));
  }
}


