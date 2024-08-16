import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class DemoMethodReference {

  public static void main(String[] args) {


    // Example 1  - static method
    List<Integer> integers = Arrays.asList(3, 7, 5, -100);
    // Lambda
    integers.stream().forEach(e -> System.out.println(e));

    // Method reference : input = method parameter
    integers.stream().forEach(System.out::println);

    // Lambda
    integers.stream().forEach(e -> System.out.println(e + 10));
    // Method reference cannot do above

    // Example 2 - instance method

    String name = "Vincent";
    // Lambda
    Supplier<Integer> nameLength = () -> name.length();

    // Method reference
    Supplier<Integer> nameLength2 = name::length;

    //Example 3   - 2 parameter instance method

    Comparator<Integer> sortByDesc = (i1, i2) -> i1.compareTo(i2);

    Comparator<Integer> sortByDesc2 = (i1, i2) -> i2 > i1 ? 1 : -1;

    Comparator<Integer> sortByDesc3 = Integer::compareTo; // i1.compareTo(i2);

    //Exmaple 4 - constructor
    //Lambda
    Function<String, String> constructorString = s -> new String(s);

    //Method reference
    Function<String, String> constructorString2 = String::valueOf;

    Function<String, String> constructorString3 = String::new;

    String s = constructorString3.apply("Hello");
    

  }
}
