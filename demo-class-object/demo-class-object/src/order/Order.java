package order;

import java.math.BigDecimal;

public class Order {
  private int id;
  private Item[] items;
  private static int count = 0;
  private String coupon;


  public Order(String coupon) {
    this.id = ++count;
    items = new Item[0];
  }

  public int getId() {
    return this.id;
  }

  public Item[] getItem() {
    return this.items;
  }

  public String getCoupon() {
    return this.coupon;
  }

  public double getDiscount() {
    if (isCouponValid()) // 1 line if
      return 0.2d;

    return 0.0d;
  }


  public boolean isCouponValid() {
    // ...
    return true;
  }

  public void addItem(Item item) {
    Item[] tmp = new Item[this.items.length + 1];
    for (int i = 0; i < this.items.length; i++) {
      tmp[i] = this.items[i];
    }
    tmp[tmp.length - 1] = item;
    this.items = tmp;

  }

  public double total() {
    BigDecimal tt = BigDecimal.valueOf(0);
    // add, subtract multiply, divide method returns new Object
    for (int i = 0; i < this.items.length; i++) {
      // tt = this.items[i].getPrice() * this.items[i].getQuantiy() tt;
      tt = tt.add(BigDecimal.valueOf(this.items[i].subtotal()));
    }
    tt = tt.multiply(BigDecimal.valueOf(1.0 - getDiscount()));

    return tt.doubleValue(); // convert from BigDecimal object to double primitive value
  }

  public static void main(String[] args) {

    Order order = new Order("ABC");
    Item item = new Item(96.0d, 2);

    System.out.println(item.subtotal());
    order.addItem(item); // ...


    Item item2 = new Item(10.0d, 3);
    order.addItem(item2);
    System.out.println(order.total()); // 222.0 * 0.8 = 177.6

  }
}
