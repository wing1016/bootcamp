import javax.print.attribute.standard.NumberOfDocuments;

public class DemoNumber {
  public static void main(String[] args) {
    Integer x = 1; System.out.println(x.getClass());
    Double d = 2.0;
    double d2 = 2;
   // System.out.println(d2.getClass);    //The primitive type double of d2 does not have a field getClass

    Number n = x; // polymorphism
    // n is a object reference

    n = d;

    Number[] numbers =
        new Number[] {1, 2, 3, 4.0, 4.5, (byte) 6, (short) 8, (long) 9}; // (1,2,3 is int, not Integer ) << all 5 itmes is primitive
    Double[] doubles = new Double[] {Double.valueOf(1), 4.0, 4.5}; // int -> Integer ( autobox )

    // Double[] doubles1 = new Double[] {1, 2, 4.0, 4.5}; // Type mismatch: cannot convert from int to Double
    // Integer vs Double ( no relationship )
    // int vs double ( upcast )

    // For-each
    // for(object type :array object )
    for (Number num : numbers) {
      System.out.println(num.getClass());
    }
  }

}
