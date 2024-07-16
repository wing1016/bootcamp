public class MethodDemo {
  public static void main(String[] args) {
    int x = sum(1, 2);
    Integer x2 = sum(1, 2); // sum() method returns int value -> autobox -> Integer Object
    long l = sum(1, 2); // upcast, int value -> long value
    // Long l2 = sum(1,2); //int -> long -> Long Object ( upcat 2 times here ) cannot up 2 times
    // Compiler cannot not do upcast and autobox at same statement; !!! important here !!!

    // call static method
    MethodDemo.sum(2, 3); // return 5

    // No point to make sum2() to an instance method
    MethodDemo md = new MethodDemo();
    md.sum2(2, 3);

  }

  private String fullName;
  private String firstName;
  private String lastName;

  public MethodDemo() {

  }

  public MethodDemo(String firstName) {
    this.firstName = firstName;
  }

  public static int sum(int x, int y) {
    return x + y;
  }

  // sum2 did't use instance method to produce the return value, So it dont need to an instance method
  public int sum2(int x, int y) {
    return x + y;
  }


  // We cannot rewrite this method to static method
  public String fullName(String lastName) {
    return this.fullName + " " + lastName;
  }
}
