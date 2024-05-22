public class DemoPrimitives2 {
  public static void main(String[] args) {
    long l1 = 10; // int value
    long l2 = 10L; // long value
    long l3 = 10l; // avoid to use l < bcos similar to 1


    // java:int = -> long
    long l4 = 63; // assign long value to long , int -> long

    // int i1 = 4L; // error

    // byte > short > int > long > float > double
    double d1 = 1.8;
    double d2 = 1.8d;
    double d3 = 10L;

    byte b1 = 10; // OK. why? 10 int value > byte

    // you can only explicitly assign a value that with a type higher than the data type
    float f3 = (float) 1.9d; // downcast (overflow / precision loss)

    short s1 = 130;
    byte b2 = (byte) s1; // java dosen't know s1 is 128 during complile time
    System.out.println(b2); // b2 is -128 s1 : 129 b2: -127

    byte b3 = 127;
    short s2 = b3; // no risk

    double d4 = 10.9d;
    int i2 = (int) d4;
    System.out.println("i2 = " + i2); // 10 -> precision loss

    // char -> int (ascii)

    char c1 = 'a'; // 97 ascii
    char c2 = 'A'; // 65

    if (c1 == c2) { // false , ascii > 97 == 65

    }
    if (c1 > c2) { // false , ascii > 97 == 65
      System.out.println("c1>c2 " + (int) c2);
      System.out.println("c1 =" + (int) c1);

    }

    int c1IntChar = c1; // ok, char to int is ok

    int charValue = 97;
    char c3 = (char) charValue;
    System.out.println("c3 = " + c3);

    char c4 = 'あ';
    int i5 = c4;
    System.out.println("i5 = " + i5); //

    char character = 'a' + 1;
    int ascii = character;
    System.out.println("ascii : " + ascii);

    // 228
    int ii1 = 30010;
    char cc1 = (char) ii1;

    System.out.println(cc1);

    short a = (byte) 1; // int -> byte -> short
    System.out.println(a);

    byte value = 127;
    // value = value + 10;

     System.out.println(value + 10);
    // for (int i = 0; i < 1; i++) {
    //   value+=10;
    //   System.out.println("value : " + value);
    // }
  }
}
