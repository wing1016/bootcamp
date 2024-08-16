import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
    List<String> capName = strings.stream() // List<String> -> (new) Stream<String>
        // .map(s -> s.toUpperCase()) // single line = return
        .map(s -> {
          if (s.equals("john")) { // if ("John".equals(s)) {
            return s.toUpperCase() + " xx";
          }
          return s + " yy";
        }

        ).collect(Collectors.toList()); // Back to List<String> <= this is new Object

    System.out.println(strings);
    System.out.println(capName);

    capName.add("Sam");
    System.out.println(capName);

    Set<String> capName2 = strings.stream().map(s -> {
      String newStr = s.toLowerCase() + " " + s.toUpperCase();
      return newStr + " !!! ";
    }).collect(Collectors.toSet()); // toList
    // toSet -> will auto delete duplicate

    System.out.println(capName2);

    // Another example
    List<Customer> customers = new LinkedList<>();
    customers.add(new Customer("John", 20));
    customers.add(new Customer("Benny", 35));
    customers.add(new Customer("Kit", 43));

    // Filter age 25 or above;
    List<Customer> customersAfterFilter =
        customers.stream().filter(customer -> customer.getAge() >= 25)
            .collect(Collectors.toList());

    System.out.println(customersAfterFilter);

    // Filter name length >= 4, and return List of String
    List<String> names = customers.stream() // Stream<Customer>
        .filter(c -> c.getName().length() >= 4) // Stream<Customer>
        .map(c -> c.getName()) // Stream<String>
        .collect(Collectors.toList()); // List<String>

    System.out.println(names);

    List<String> nameList = new ArrayList<>();
    for (Customer c : customers) {
      if (c.getName().length() >= 4) {
        nameList.add(c.getName());
      }
    }
    System.out.println(nameList);

    // filter() map() // we can swap map / filter because they are both return in format Stream
    customers.stream() // Stream<Customer>
        .map(c -> c.getName()) // Stream<String>
        .filter(str -> str.length() >= 4) // Stream<Customer>
        .collect(Collectors.toList()); // List<String>

    customers.stream() // Stream<Customer>
        .filter(c -> c.getName().length() >= 4).map(c -> c.getName())
        .forEach(name -> System.out.println(name));


    customers.stream().count(); // < this is very stupid = customers.size()

    long l = customers.stream().filter(c -> c.getAge() < 40).count(); // long 2
    System.out.println(l);

    customers.add(new Customer("Benny", 38)); //

    // Distinct -> remove duplicate ( by equals() and hashcode() )
    List<Customer> customerAfterDistinct = customers.stream() //
        .distinct() // return stream<Customer>
        .collect(Collectors.toList());
    System.out.println(customerAfterDistinct);

    // Sort
    // Lambda Expression ( skiping "class implementating interface Comparator" )
    Comparator<Customer> sortByAge =
        (c1, c2) -> c1.getAge() < c2.getAge() ? -1 : 1; // ( sortByAge.java )
    List<String> customerAfterSort =
        customers.stream().filter(c -> c.getAge() < 40)
            // .sorted(sortByAge) << -
            .sorted((c1, c2) -> c1.getAge() < c2.getAge() ? -1 : 1)
            .map(c -> c.getName())
            // .sorted()
            .collect(Collectors.toList());

    // int compare(T o1, T o2)

    System.out.println(customerAfterSort); // [Benny, Benny, John]

    // Terminal Operation, Interminate Operation <= ( 先execute )
    // Terminal Operation ( collect() , count() etc ) -> returning non-Stream type
    // Interminate Operation ( filter(), map(), sorted(), distinct() ) returning Stream type
    Stream<Customer> customerList = customers.stream() // Stream<Customer>
        .filter(c -> !"John".equals(c.getName())); // Stream<Customer>

    // c.getName().equals("John") <- this will cause Null pointer exception if c.getName is null !!!
    // "John".equals(c.getName() << this is more safe

    System.out.println(customerList.count()); // 3
    // System.out.println(customerList.collect(Collectors.toList())); // not OK
    // Stream has already been operated upon or closed
    // You cannot perform 2 terminal operations on a stream object


    // Map -> key:name, value:name length
    List<String> animals = Arrays.asList("Lion", "Tiger", "Bears");
    animals.stream() //
        .collect(Collectors.toMap(s -> s, s -> s.length()));

    System.out.println(animals); // [Lion, Tiger, Bears]

    // Group By
    List<Staff> staffs =
        Arrays.asList(new Staff("HR", "John"), new Staff("IT", "Peter"),
            new Staff("MKT", "Sally"), new Staff("IT", "Vincent"));

    // Map<String, List<Staff>>
    Map<String, List<Staff>> staffMap = staffs.stream()
        .collect(Collectors.groupingBy(staff -> staff.getDepartment()));

    System.out.println(staffMap.get("IT"));

    // from List<Staff> to Map<String, List<Staff>>
    // contains -> get -> list.add() -> put
    // ! contains -> new ArrayList() -> add() -> put
    // for () {

    // }

    //
    List<Staff> staffList = Arrays.asList(new Staff("HR", "John", 30000),
        new Staff("IT", "Peter", 40000), new Staff("MKT", "Sally", 25000),
        new Staff("IT", "Vincent", 20000));

    // HR 30000
    // IT 60000
    // MKT 2500

    Map<String, Integer> deptMap = staffList.stream() //
        .collect(Collectors.groupingBy(s -> s.getDepartment(),
            Collectors.summingInt(s -> s.getSalary())));

    System.out.println(deptMap.get("IT")); // 60000
    System.out.println(deptMap.get("MKT")); // 25000
    System.out.println(deptMap.get("HR")); // 30000

    // Construct Stream object by initial values
    Stream.of(6, 7, 8, 9);

    Stream<Integer> integers = Stream.of(1, 2, 3, 4);

    Stream<Staff> staff = Stream.empty();

    // Stream !!! never add / increase number of element

    // filter(), disinct() -> reduce elements
    // map(), sorted() - revise object deinition
    // count(), groupingBy(), summingInt() -> summarize operation

    // Special case
    List<Integer> integers2 =
        Stream.of(1, 2, 3, 4).map(i -> i + 1).collect(Collectors.toList());

    // map() -> interminate operation -> it wont be execute until terminal operation
    Stream<Integer> integers3 = Stream.of(2, 3, 4).map(i -> {
      //sir
      System.out.println(i);  // do not execute if there is no terminal operation to run
      return i + 1;
    });
    // Sys out does not print , because stream object not yet perform terminal operation..

    System.out.println(integers3);

    // .collect(Collectors.toList());
    // System.out.println(integers3);

    //count
    System.out.println(integers3.count());  //3
    
    // terminal operation observes interminate operations, check if they will make impact or not
    // so, finally map() won't execute, because it will not affect the result of count()

    //sir

  }
}
