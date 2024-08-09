import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class DemoMapLambda {
  public static void main(String[] args) {
    // save key , value

    Map<String, Customer> customerMap = new HashMap<>();
    customerMap.put("C1234", new Customer("John"));
    customerMap.put("C1235", new Customer("Sam"));

    if (customerMap.containsKey("C1234")) {
      System.out.println(customerMap.get("C1235").getName());
    }

    Function<String, Customer> defaultCstomer = s -> new Customer("Dummy");
    customerMap.computeIfAbsent("C1236", defaultCstomer);

    for (Map.Entry<String, Customer> entry : customerMap.entrySet()) {
      System.out.println(entry.getKey() + "  " + entry.getValue());
    }

    // 2. merge -> BiFunction
    Map<String, Integer> map = new HashMap<>();
    map.put("Peter", 10);
    map.put("John", 2);
    map.put("Vincent", 8);
    map.put("Jenny", 12);

    // All entry value + 2
    

    //sir code
  }
}
