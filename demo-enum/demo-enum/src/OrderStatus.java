 
public enum OrderStatus {
  ORDERED(0),
  PAID(1), READY_TO_SHIP(2), DELIVERED(3);

  private int seq;

  private OrderStatus(int i) {
    this.seq = i;
  }

  private int getSeq() {
    return this.seq;
  }

  public OrderStatus next() {
    for (OrderStatus os : OrderStatus.values()) {
      if (this.seq + 1 == os.getSeq()) {    //here no need this.getSeq. bcos myself attribute
        return os;       // #sir#
      }
    }
    return null;
  }

  public static void main(String[] args) {
    System.out.println(OrderStatus.READY_TO_SHIP.next());
  }

}
