import java.math.BigDecimal;

public class Calculator {

  // int x = 5, y = 6, z = 50; declare multiple variable
  // System.out.println(x + y + z);

  public static void test(String[] args) {
    for (int i = 0; i < args.length; i++) {
      // basic for loop
      System.out.println(args[i]);
    }
  }

  public static void test2(String... args) { // String... -> same as String[]
    for (String s : args) {
      System.out.println(s);
    }
  }

  private int i1, i2;
  // private int i2;

  public void setI1(int i) {
    this.i1 = i;
  }

  public void setI2(int i) {
    this.i2 = i;
  }

  public static int sum(int x, int y) {
    System.out.println("int running");
    return x + y;
  }

  public static double sum(double x, double y) {
    System.out.println("double running");
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  public static double sum(float x, double y) {
    System.out.println("float/double running");
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  // Method overloading
  // same method name , diff type of args

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
    c1.sum(); // 2 + 3 = 5
    c1.multiply(); // 2 * 3 = 6

    System.out.println(c1.sum());
    System.out.println(c1.multiply());

    sum(1, 2);

    sum(1.0f, 2.0f); // 1.0f -> float value

    System.out.println(sum(1.0f, 2.0f));

    Calculator.test(new String[] {"abc", "ijk"});
    Calculator.test2(new String[] {"abc", "ijk"});
    Calculator.test2("xyz", "efg");

  }
}
