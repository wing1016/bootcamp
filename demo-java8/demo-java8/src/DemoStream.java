import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DemoStream {
  public static void main(String[] args) {
    List<String> strings = new LinkedList<>();
    strings.add("John");
    strings.add("Jenny");
    strings.add("Sam");

    // Lambda for-each
    strings.forEach(s -> System.out.println(s));

    // for (String string : strings) { // cannot edit data here.. (no index i here)
    // }

    for (int i = 0; i < strings.size(); i++) {
      strings.set(i, strings.get(i).toLowerCase());
    }
    System.out.println(strings);

    // Stream - very good for edit the data like doing forEach
    List<String> capName = strings.stream() // List<String> -> Stream<String>
        .map(s -> s.toUpperCase()) // single line = return
        .collect(Collectors.toList()); // Back to List<String> <= this is new Object

    System.out.println(strings);
    System.out.println(capName);

    capName.add("Sam");
    System.out.println(capName);

    Set<String> capName2  = strings.stream().map(s -> {
        String newStr = s.toLowerCase() + " " + s.toUpperCase();
        return newStr + " !!! ";
    }).collect(Collectors.toSet());   //toList
    //toSet -> will auto delete duplicate

    System.out.println(capName2);

  }
}
