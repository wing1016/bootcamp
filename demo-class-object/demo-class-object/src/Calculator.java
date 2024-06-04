public class Calculator {
  private int i1;
  private int i2;

  public void setI1(int i) {
    this.i1 = i;
  }

  public void setI2(int i) {
    this.i2 = i;
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  public int sum() {
    return this.i1 + this.i2;
  }

  public int multiply() {
    return this.i1 * this.i2;
  }

  public static void main(String[] args) {
    // sysout static method (class method)
    sum(1, 2);
    Calculator.sum(3, 4);

    Calculator c1 = new Calculator();
    c1.setI1(2);
    c1.setI2(3);

    // instance method (object method)
    c1.sum(); // 2 + 3
    c1.multiply(); // 2 * 3

    System.out.println(c1.sum());
    System.out.println(c1.multiply());

  }
}
