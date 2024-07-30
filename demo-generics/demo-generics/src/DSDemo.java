import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DSDemo {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    List<Customer> customers = new ArrayList<>();

    // #sir#
    // ArrayList.class has Generics Design.
    Map<String, Customer> customerMap = new HashMap<>();
  }
}

// <E> E is for element
// <T> , actually no need to use T , you can use Any letter