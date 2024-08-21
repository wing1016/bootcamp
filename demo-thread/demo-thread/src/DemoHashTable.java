import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class DemoHashTable { // sir code
  public static void main(String[] args) {

    // HashTable ( Thread safe, not allow null ) vs HashMap ( non-Thread safe )

    Hashtable<String, String> table = new Hashtable<>();

    // put() -> 1_000_000
    // thread

    Runnable addStringToHashTable = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        table.put(String.valueOf(i), "world");
      }
      for (int i = 1_000_000; i < 2_000_000; i++) {
        table.put(String.valueOf(i), "world");
      }
    };
    // for (Entry<String, String> string : table.entrySet()) {
    // System.out.println(string.getKey() + " ! " + string.getValue());
    // }

    Thread t1 = new Thread(addStringToHashTable);
    Thread t2 = new Thread(addStringToHashTable);
    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
    }


    // System.out.println(table);
    System.out.println(table.size());

    // ##############################################################
    // sir

    // Hashtable<String, String> Map = new Hashtable<>();

    // Runnable addStringToHashTable = () -> {
    // for (int i = 0; i < 1_000_000; i++) {
    // table.put(String.valueOf(i), "world");
    // }
    // };


    // Thread t1 = new Thread(addStringToHashTable);
    // Thread t2 = new Thread(addStringToHashTable);
    // t1.start();
    // t2.start();

    // try {
    // t1.join();
    // t2.join();
    // } catch (InterruptedException e) {
    // }

    // System.out.println(table.size());


    // Null Key, Null value
    HashMap<Integer, String> map2 = new HashMap<>();
    map2.put(null, "abc");
    map2.put(null, "xyz");    // add key null then add key null ( value will be replace )
    map2.put(123, null);
    System.out.println(map2.size());



    Hashtable<Integer, String> table3 = new Hashtable<>();
    // map3.put(null, "abc"); //NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
    // map3.put(789, null); // NullPointerException at java.base/java.util.Hashtable.put
    table3.put(789, "abc");
    table3.put(789, "def");
    System.out.println(table3.get(789));
    System.out.println(table3.size());
  }
}
