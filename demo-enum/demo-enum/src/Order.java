public class Order {
  private OrderStatus orderStatus;
  private int paidAmount;
  private int orderAmount;

  public boolean isPaid() {
    return this.paidAmount >= this.orderAmount;

  }

  public Order(int orderAmount) {
    this.orderAmount = orderAmount;
    this.orderStatus = OrderStatus.ORDERED;
  }

  public void credit(int amt) {
    this.paidAmount += amt;
    if (this.isPaid() && this.orderStatus == OrderStatus.ORDERED) {
      // this.orderStatus = this.orderStatus.next();  //wing ver
      // this.setOrderStatus(this.orderStatus.next());   // sir ver  
      this.setOrderStatus(OrderStatus.PAID);
    }
  }

  public void setToPaid(){
    // this.orderStatus = OrderStatus.PAID;
    this.setOrderStatus(OrderStatus.PAID);
  }

  public OrderStatus getOrderStatus() {
    return this.orderStatus;
  }

  public void setOrderStatus(OrderStatus os) {
    this.orderStatus = os;
  }

  public static void main(String[] args) {
    Order o = new Order(100);

    // ..
    // credit card -> 50;
    o.credit(50);
    System.out.println(o.isPaid());

    o.credit(50);
    System.out.println(o.isPaid());

    // if (o.isPaid() && o.getOrderStatus() == OrderStatus.PAID) {
    // // // forward the static
    // // // o.orderStatus = o.getOrderStatus().next(); //wing ver
    // o.getOrderStatus().next(); // sir ver
    // }

    // OrderStatus currenctStatus = o.getOrderStatus();
    // if (o.isPaid() && currenctStatus == OrderStatus.PAID) {
    //   o.setOrderStatus(currenctStatus.next());    // sir ver      
    // }
    System.out.println(o.getOrderStatus());
  }
}
