package order;

public class Item {
  private double price;
  private int quantity;

  public Item(double p, int q) {
    this.price = p;
    this.quantity = q;
  }

  public double getPrice() {
    return this.price;
  }

  public int getQuantiy() {
    return this.quantity;
  }

  public void setPrice(double p) {
    this.price = p;
  }

  public void setQuantity(int q) {
    this.quantity = q;
  }

  public double subtotal() {
    return this.price * this.quantity; // double * int -> double * double -> 3.333 * 2.0
  }

}
