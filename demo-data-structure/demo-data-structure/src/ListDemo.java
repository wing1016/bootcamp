import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListDemo {
  public static void main(String[] args) {
    List<String> strings = new ArrayList(); // ArrayList.class implement List.class

    strings.add("Hello");
    strings.add("abc");
    strings.remove("abc");
    System.out.println(strings.size());
    // ArrayList.class has ALL methods defined in List.class
    // ArrayList May implement more than one interface
    // ArrayList May have its own methods, which did not define in interface

    // Polymorphim
    // 1. scope of strings(obj ref) (compile time)
    // 2. method implementation (implement what method) (runtime)

    // Collection.class is an interface
    Collection<String> string2 = new ArrayList<>();
    string2.add("hello");
    // left hand side always use narrower pointer > "collection"

    string2 = new HashSet<>();
    System.out.println(string2);

    // Set.class
    Set<String> string3 = new HashSet<>();
    string3 = new ArrayList(); // Failed ,Not OK , ArrayList did not implement Set interface..
    string3.add("hello"); // ignore duplicate

    // So, the implementation of ArrayList.add() is diff from implementation of HashSet.add()

    // Map.class
    Map<String, String> nameMap = new HashMap<>();

    // Data Structure of data structure
    List<HashMap<String, String>> maplist = new ArrayList<>();
    HashMap<String, String> nameList = new HashMap<>();
    nameList.put("abc", "John");

    HashMap<String, String> bookList = new HashMap<>();
    nameList.put("def", "Book A");
    maplist.add(nameList);
    maplist.add(bookList); // #sir#

    // check #sir# version

  }
}
