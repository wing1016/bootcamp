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
        System.out.println(s3);

        double d1 = x2.doubleValue();
        System.out.println(d1); // 59994

        // comparision (>, ＜, ==, != for primitive value only)
        // For Integer (wrapper class comparsion, > use compareTo)
        Integer x3 = 4;
        Integer x4 = 8;
        Integer x5 = 8;

        boolean result = x4 > x3; // true ( comparing int value )

        System.out.println(x4.compareTo(x3));// ( comparing Integer value)
        System.out.println(x3.compareTo(x4));
        System.out.println(x4.compareTo(x5));

        boolean result2 = x4.compareTo(x3) > 0; // true
        boolean result3 = x4.compareTo(x3) < 0; // false
        boolean result4 = x4.compareTo(x5) == 0; // true

        //Byte Short Integer Long Double Float
        Float f1 = 10.0f; // 10.0f is a float value > autobox > to Float value
        Float f2 = new Float(10.0f); //create a Float object, storing a float value
        long l2 = f2.longValue();
    }
}
