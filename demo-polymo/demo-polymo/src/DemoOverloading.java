public class DemoOverloading {

  private int a;
  private int b;

  public DemoOverloading(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public DemoOverloading(double a, double b) {
    this.a = (int) a;
    this.b = (int) b;
  }

  public DemoOverloading() {
    // this.a = 100;
    // this.b = 200;

    // alternative below (constructor overloading)
    this(100, 200);  // this > calling constructor (int , int)
  }


  // public static double sum(int x, int y) {
  // return x + y;
  // }

  public static int sum(int x, int y) { // even if return is diff, method still duplicate
    return x + y;
  }

  public static double sum(double x, double y) {
    return x + y;
  }

  // Method signature = method name + parameter

  public static void sum(Object x, Object y) {
    System.out.println("calling void sum method(Object x + Object y)");
  }

  public static void sum(Animal x, Animal y) {
    System.out.println("calling void method sum(Animal + Animal)");
  }

  public static long sum(int x, long y) { // diff with method below
    return x + y;
  }

  public static long sum(long x, int y) { // diff with method above
    return x + y;
  }

  public static void sum() {
    System.out.println("calling void no parameter method sum( )");
  }

  public static void main(String[] args) {
    // Purpose of overloading : to let method user code easier to use
    // Overloading is designed and checked during the complie-time

    // Example 1;
    String a = String.valueOf(true);
    String b = String.valueOf(2.0d);
    char[] arr = new char[] {'c', 'b', 'A'};
    System.out.println(String.valueOf(arr));

    // Example 2
    System.out.println(sum(1, 3));
    System.out.println(sum(1.0, 4.6));

    System.out.println(sum((byte) 3, (short) 9)); // find the nearest promotion method ,> sum(int x, int y)

    sum("abc", "xyz");
    // System.out.println(sum("abc", "xyz"));
    // The method println(boolean) in the type PrintStream is not applicable for the arguments (void)Java(67108979)

    sum(10L, 11L); // check sir note
    System.out.println(sum(10L, 11L));

    sum(new Cat(), new Dog());
    sum();

    // System.out.println(sum()); <<
    // The method println(boolean) in the type PrintStream is not applicable for the arguments (void)Java(67108979)
    // Cannot sys out void method

    //what if the method parameters are with type of Wrapper Class Q
    //You try it out
  }
}
