public class WrapperClassDemo {
  public static void main(String[] args) {

    // the relationship between object and primitive
    int x = 10;
    Integer x2 = x; // auto-box ( int - > Integer )
    int x3 = x2; // unbox ( Integer -> int )

    Character c = 'c'; // char value -> Character oBject ( auto box )
    // c -> object reference
    // 'c' -> autobox -> new Character Object

    // String is not a wrapper class

    Boolean b = null;
    b = true; // autobox ( primitive boolean -> Boolean Object )
    b = false;
    b = Boolean.valueOf(true);
    b = new Boolean(false);

    // stack & heap;
    Integer i1 = 128;
    Integer i2 = 128;
    System.out.println(i1 == i2); // false
    Integer i3 = 127;
    Integer i4 = 127;
    System.out.println(i3 == i4); // true ( within always use value )

    String s2 = "abc";
    String s3 = "abc";
    System.out.println(s2 == s3);
    String s4 = new String("abc");
    System.out.println(s2 == s4);
    String s5 = String.valueOf("abc");  
    // always use valueOf is good (we concern about the value) Not is the object the same
    // valueOf -> java will decide new a String Object or use an old object


  }
}
