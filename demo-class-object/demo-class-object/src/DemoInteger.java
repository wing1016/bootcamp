public class DemoInteger {

  public static void main(String[] args) {


    Integer i1 = Integer.valueOf(3);
    Integer i2 = 3; // 3 int value -> autobox -> Integer object (heap memory)

    // Internal Cache (for number)

    i1 = 127; // i1 (object ref.), 127 -> (1st) create Integer Object
    i2 = 127; // i2 (object ref.), 127 -> (1st) resue the original Integer Object
    // Rule : from -128 to 127, reuse the original object
    System.out.println(i1 == i2); // true , are they same object

    Integer i3 = 128; // 128 -> (1st) create Integer object
    Integer i4 = 128; // 128 -> (2nd) create Integer object
    System.out.println(i3 == i4); // false. are they same object?

    // important !!
    // for class, you should always compare their objects value by METHOD!!

    // useless .. copy from sir code in github
    System.out.println(i3 >= i4);
    System.out.println(i1 >= i2);
  }

}
