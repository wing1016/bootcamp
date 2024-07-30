import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {
  // HashSet check DUPLICATE ITEM !!!

  // HashSet Vs ArrayList

  public static void main(String[] args) {
    HashSet<String> strings = new HashSet<>();
    strings.add("Hello");
    strings.add("abc");
    strings.add("def");
    System.out.println(strings); // the order is not controlled by you

    ArrayList<String> a = new ArrayList<String>();
    a.add("Hello");
    a.add("abc");
    a.add("def");
    System.out.println(a);
    // the ordering is following the insertion order

    boolean hsResult = strings.add("Hello");
    boolean arrResult = a.add("Hello");

    System.out.println(strings); // [abc, Hello, def]
    // Hashset cannot add duplicate item (this is the main diff)
    System.out.println(a); // [Hello, abc, def, Hello]

    System.out.println(hsResult); // false , it means cannot add DUPLICATE ITEM
    System.out.println(arrResult); // true , add DUPLICATE ITEM successfully

    System.out.println(strings.size());

    System.out.println(strings.remove("abc"));
    System.out.println(strings);

    // isEmpty, addAll, contains....etc

    String[] ar = new String[] {"abc", "def", "xyzz", "def"};
    // Loop
    HashSet<String> result = new HashSet<>();

    for (int i = 0; i < ar.length; i++) {
      result.add(ar[i]);
    }

    System.out.println(result); // {abc, def, xyz}


    String[] ar2 = new String[] {"abc", "def", "xxyz", "def"};
    HashSet<String> result2 = new HashSet<>();
    HashSet<String> result1 = new HashSet<>();
    for (int i = 0; i < ar2.length; i++) {
      // System.out.println(result2.add(ar2[i]));
      if (!result2.add(ar2[i])) {
        result1.add(ar2[i]);
      }
    }
    System.out.println(result1);   // #sir# check sir version

      // Question 2: Find all duplicated values
      HashSet<String> result2 = new HashSet<>();
      ArrayList<String> arrlist = new ArrayList<>();
      for (String s : arr) {
        if (!result2.add(s)) {
          arrlist.add(s);
        }
      }
      System.out.println(arrlist); // ["def"]
  

    // HashSet<String> result2 = new HashSet<>();
    // ArrayList<String> al = new ArrayList<>();
    // for (String s : al) {
    // if (!al.add(s)) {
    // al.add(s);
    // }
    // }
    // System.out.println(al);
  }
}
