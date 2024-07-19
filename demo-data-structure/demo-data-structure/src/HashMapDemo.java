import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {

    // Key and Value pair = HashMap
    HashMap<Integer, String> nameMap = new HashMap<>(); // Key ->Integer, value ->String
    nameMap.put(100, "Vincent");
    // nameMap.put("Vincent", 100) // wrong here

    // we can get value by Key
    System.out.println(nameMap.get(100)); // "Vincent"

    // cannot get by value
    System.out.println(nameMap.get("Vincent")); // null

    // no Ordering
    nameMap.put(1010, "Cindy");
    nameMap.put(-45, "Sally");
    System.out.println(nameMap.get(-45));

    // For Loop -> HashMap.class
    // Loop for entries
    System.out.println(" Loop to Print a HashMap : ");
    for (Map.Entry<Integer, String> entry : nameMap.entrySet()) {
      System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    //Handle Duplicate key -> if duplicate, it will be override by the new value
    nameMap.put(1010, "Wing");
    System.out.println(nameMap);

    nameMap.put(null, "Ken");
    System.out.println(nameMap);

    String oldValue = nameMap.remove(1010); // remove entry by Key
    System.out.println(nameMap);
    System.out.println(oldValue);   //Wing
  }
}
