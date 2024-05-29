public class DemoInterger {
    public static void main(String[] args) throws Exception {
        int x = 1;
        Integer x2 = 1;
        System.out.println(x);
        System.out.println(x2);

        x = x + 3;
        x -= 10;

        x2 = x2 + 3;
        x2 -= 10;

        // Integer is a wrapper class
        // class has method
        short s = (short) x;
        short s2 = x2.shortValue();

        x2 += 60000;
        short s3 = x2.shortValue();
        System.out.println(s3); // -5542

        double d1 = x2.doubleValue();
        System.out.println(d1); // 59994

        // comparision (>, ＜, ==, != for primitive value only)
        // For Integer (wrapper class comparsion, > use compareTo)
        Integer x3 = 4;
        Integer x4 = 8;
        Integer x5 = 8;

        boolean result = x4 > x3; // true ( comparing int value )

        System.out.println(x4.compareTo(x3));// ( comparing Integer value) //1
        System.out.println(x3.compareTo(x4)); // -1
        System.out.println(x4.compareTo(x5)); // 0

        boolean result2 = x4.compareTo(x3) > 0; // true
        boolean result3 = x4.compareTo(x3) < 0; // false
        boolean result4 = x4.compareTo(x5) == 0; // true

        System.out.println("result 2 " + result2);
        System.out.println("result 3 " + result3);
        System.out.println("result 4 " + result4);

        // Byte Short Integer Long Double Float
        Float f1 = 10.0f; // 10.0f is a float value > autobox > to Float value
        Float f2 = new Float(10.0f); // create a Float object, storing a float value
        long l2 = f2.longValue();

        Double d3 = new Double("10.3");
        long l3 = d3.longValue();
        System.out.println(l3); //10

        Character c1 = new Character('a');
        char c2 = Character.toUpperCase('b');
        System.out.println(c2);
        System.out.println(Character.toLowerCase('M')); //m

        Boolean b3 = new Boolean(false);
        Boolean b4 = new Boolean(true);
        Boolean b5 = new Boolean(true);

        //CompareTo() method is used to compare the boolean value stored in Boolean object
        System.out.println(b3.compareTo(b4));   //-1

        System.out.println(b3 == b4);   //false
        System.out.println(b5 == b4);   //false ??!!

        //autobox and unbox
        Integer i7 = 9; //9 is an int value -> autobox -> Integer object
        int i8 = i7;    // i7 is Integer object -> unbox -> int value

        Integer i9 = new Integer(9);
        int i10 = i9.intValue();

        //
        Integer i11 = Integer.valueOf(9);   // static method, same as "new Integer(9)"
        int i12 = Integer.parseInt("10");
  //      int i13 = Integer.parseInt("10a");  //java.lang.NumberFormatException: For input string: "10a"m. run time error

        System.out.println(i12);
        // System.out.println(i13);

        System.out.println(new Byte("11"));
        System.out.println(new Byte((byte) 13));

    }
}
