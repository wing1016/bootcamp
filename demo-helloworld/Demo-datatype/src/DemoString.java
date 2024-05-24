public class DemoString {
  public static void main(String[] args) {
    // String stores text. must use double quote (String-non primitive)
    String x = "hello";
    String y = "afvafsvaf";
    String withSpace = "hello  h   e ll  o";
    System.out.println(withSpace);

    // String can be +
    String z = x + withSpace;
    System.out.println(z);

    // remainder
    int remainder = 10 % 3;
    int divide = 10 / 3;
    System.out.println(remainder);

    double price = 9.99;
    String item = "book";

    String description = "The" + item + "cost : " + price;
    System.out.println(description);

    char a = 'A'; // "A" is wrong , not char . pls use '' not"""
    String message = "The answer is " + a;
    System.out.println(message);

    // String method (Tool)
    String t = "hello";
    System.out.println("length of t =" + t.length());

    // check if t >=4
    if (t.length() >= 4) {
      System.out.println("t is longer than 4 ");
    } else {
      System.out.println("t is short");

    }

    // method 2 equals.

    String s1 = "hello";
    String s2 = "hello";

    if (s1.equals(s2)) {
      System.out.println("same");
    } else {
      System.out.println("not same");
    }

    if (!s1.equals(s2)) {
      System.out.println("not same");
    } else {
      System.out.println(" same");
    }



    // String s1 = "hello";
    // String s2 = "hello";
    // check if s1 length >=6 or s1 EQUALS S2,
    if (s1.length() >= 6 || s1.equals(s2)) {

    } else {

    }


    if (s1.length() >= 6) {
      System.out.println("hello world");
    } else if (s1.equals(s2)) {
      System.out.println("helloo");
    }

    if (s1.length() >= 6 && s1.equals(s2)) {
      System.out.println("hello world");
    } else {
      System.out.println(" world");
    }


    if (s1.length() >= 6) {

      if (s1.equals(s2)) {
        System.out.println("hello world");
      }

    }

    // Method 3 :charAt(int, index) eg, charAt(0)

    String s3 = "java world !";
    // 0 means the first character
    // 1 means the second character
    System.out.println("1char of s3 is " + s3.charAt(0));
    System.out.println("the last char is " + s3.charAt(s3.length() - 1));

    // check last char is d? & length > 5 ?
    String xx2 = "hello world";
    System.out.println("xx2 last char is " + xx2.charAt(xx2.length() - 1));


    // String use .equal . char use == to compare

    String x2 = "hello worldl";
    if (x2.charAt(x2.length() - 1) == 'd' && x2.length() > 5) {
      System.out.println("x2 last char is d and  x2 length longer than 5");
    } else {
      if (x2.charAt(x2.length() - 1) != 'd') {
        System.out.println("last char is not d ");
      } else {
        System.out.println("x2 not longer than 5");
      }
    }

    // method 4 : substring ( int begin index, int end index )
    // end index need to -1

    String y2 = "happy world";
    String y2result = y2.substring(0, 2);

    System.out.println("y2result :" + y2result);
    System.out.println(y2.substring(3, 8));

    // check first 3 character is "wel", if yes print yes
    String x3 = "welcome";
    System.out.println(x3.substring(0, 3)); // string cannot use == to compare

    if (x3.substring(0, 3).equals("wel")) {
      System.out.println("yes");
    }

    if (x3.charAt(0) == 'w' && x3.charAt(1) == 'e' && x3.charAt(2) == 'l') {
      System.out.println("frst 3 char is wel");
    }

    // chain method
    System.out.println(x3.substring(0, 3).length()); // output 3

    int x4 = x3.substring(0, 3).length(); // .length output is int

    // isEmpty()
    // Empty string value -> ""
    String x7 = "";
    System.out.println(x7.isEmpty());// true
    String x8 = "abc";
    System.out.println(x8.isEmpty());

    // isBlank()
    String x9 = "";
    System.out.println(x9.isEmpty()); // true

    x9 = " ";
    System.out.println(x9.isBlank()); // true
    System.out.println(x9.isEmpty()); // false

    // substring(0,3)
    // substring(0) from index to the end
    String s10 = "hello";
    System.out.println(s10.substring(1)); // from index to the end
    System.out.println(s10.substring(0, 3)); // from index 0 to index 2(3-1)

    // hello -> HELLO
    // toUpperCase | toLowerCase
    String s11 = "HELLO";
    System.out.println(s11.toLowerCase()); // toUpperCase

    System.out.println(s11.replace("LL", "_XX_"));

    // contain
    System.out.println(s11.contains("ell")); // False

    // startsWith() endsWith()
    System.out.println(s11.startsWith("x")); // false
    System.out.println(s11.endsWith("O")); // True

    // trim() remove head and tail space in a string
    String s12 = "     Hell Yeah      ";
    System.out.println(s12.trim());

    String[] strings =
        new String[] {"hello", "abcijk", "vincent", "Hello", "   hello   "};
    // how many string contains "ell" ignore case
    int count = 0;
    for (int i = 0; i < strings.length; i++) {
      if (strings[i].toLowerCase().contains("ell")) {
        count++;
      }
    } 
    System.out.println(count + " string contains 'ell'");
  }
}
