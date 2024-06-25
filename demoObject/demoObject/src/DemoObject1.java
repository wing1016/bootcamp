import java.util.Scanner;
import javax.naming.event.ObjectChangeListener;

public class DemoObject1 {
  public static void main(String[] args) {
    // getClass()
    StringBuilder sb = new StringBuilder(); // java.lang.StringBuilder-> no need import
    Scanner scanner = new Scanner(System.in); // java.util.scanner ( java.util.* need to import )
    Object object = new Object(); // Object 萬能指針 Object is super parent
    object = "abc";
    object = Double.valueOf(13);
    object = new Cat();

    System.out.println(new Cat().toString());
    Cat c1 = new Cat();
    Cat c2 = new Cat();
    System.out.println(c1);
    System.out.println(c1.hashCode()); // 1828972342 //generate a int value by object reference
    System.out.println(c2.hashCode()); // 1452126962
    // c1 . hashcode is pure brancd new method, but String .hadhcode is overrided by someone.

    String x1 = new String("abc");
    String x2 = new String("abc");
    System.out.println(x1.hashCode()); // 96354
    System.out.println(x2.hashCode()); // 96354

    MiniCat mc = new MiniCat("John", "RED");
    MiniCat mc2 = new MiniCat("John", "RED");
    MiniCat mc3 = new MiniCat("Peter", "RED");
    System.out.println(mc.hashCode());
    System.out.println(mc2.hashCode());
    System.out.println(mc3.hashCode());

    


    Object cat = new Cat();
    // cat (object reference ) indeed pointing to cat object
    // run() instance method can only be called by object declared by cat.class
    // what method can be run depends on the type of the object reference
    // if the object reference is declared by object.class, it cannot call run() method
    // cat.run(); compile error here

    // Cat cat2 = (Cat) cat; //
    //type of oject reference decide what method can be use
    Cat cat2 = (Cat) cat; // Why compile error , because cannot guarantee the type
    cat2.run();
    cat2.hashCode();
    //cat cannot use run() method because cat is a Object. and cat2 is an object of cat.
    System.out.println(cat2.equals(cat));
  }

  // Java : Ensure Type Safty during the complie time
  public static Object sum(Object x, Object y) {
    return x + y; // "+" operations for String, Integer , int, double...
  }

  public static int length(String x) {
    return x.length();
  }

  // During complie time, Compiler cannot ensure the object in heap is a String object
  public static int length2(Object x) {
    return x.length();
  }


}


