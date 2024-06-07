import java.util.Arrays;

public class Bag {
  private int[] integers;

  // Bag constructor
  // getter, setter
  // toString()
  public Bag() {

  }

  public Bag(int[] arr) {
    this.integers = arr;
  }

  public void setIntegers(int[] arr) {
    this.integers = arr;
  }

  public int[] getIntegers() {
    return this.integers;
  }

  public String toString() {

    // return this.integers.toString();
    return Arrays.toString(this.integers);
  }

  public static void main(String[] args) {
    int[] integers = new int[] {3, 1, 2};
    Bag b = new Bag(integers);
    System.out.println(b.toString());
    int[] x = b.getIntegers();
    b.setIntegers(new int[] {5, 6, 7});

    // Bag(integers=[100,-2,6]) . no name arr cannot contact again
    System.out.println(new Bag(new int[] {100, -2, 6}).toString());
    // < no name Bag, cannot control it again


  }

  public static void test() {
  }

  // 4 new in a file, 4 object in heap memory
  //String is a char array, char array is a attribute of String

}
