public class DemoLiteralPool {

  // public static void main(String[] args) {
  //   String s1 = "hello";
  //   String s2 =  "hello" ;
  //   System.out.println(s1 == s2);

  // }

  public static void main(String[] args) {
    // Literal Pool (String)
    String s1 = "hello";
    String s2 = "hello";
    System.out.println(s1 == s2); // true
    System.out.println(System.identityHashCode(s1)); // 617901222
    System.out.println(System.identityHashCode(s2)); // 617901222

    String s3 = "hello";
    String s4 = new String("hello"); // false
    System.out.println(s3 == s4);
    System.out.println(s3 == s1 && s3 == s2); // true

    s3 = s4;
    System.out.println(s3 == s4); // true they are pointing to same object

    // .equals ( is check the value )

    String s5 = "he";
    String s6 = "llo";
    s5 = s5 + s6; // hello + < is = new String

    System.out.println("s1 :" + s1); // hello
    System.out.println("s5 :" + s5); // hello
    System.out.println(s5 == s1); // false

    // Immutable ( String only )
    String s7 = "hello";
    System.out.println(System.identityHashCode(s7));
    s7 += " world";
    System.out.println(System.identityHashCode(s7));

    String s8 = "hello";
    System.out.println(System.identityHashCode(s8));
    s8 = s8.replace("e", "a"); // new String
    System.out.println(System.identityHashCode(s8));

    String s9 = "hello";
    System.out.println(System.identityHashCode(s9));
    s9 = s9.toUpperCase();
    System.out.println(System.identityHashCode(s9));

  }
}
