import java.lang.StackWalker.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javax.management.RuntimeErrorException;

public class DemoOptional {

  public static void main(String[] args) {

    String s = "Hello";
    s = null;
    generate(s); // OK


    // method User
    System.out.println(generate(s));
    // generate(s).charAt(0); // error runtimed error

    // alternative
    // generate2() -> return Optional<String> -> the return value can be null or not null
    // the java will force to handle potential null scenario during compile-time
    Optional<String> result = generate2(s);
    char target = ' ';
    // generate2(s).charAt(); // error , generate2(s) may be null
    if (result.isPresent()) {
      target = result.get().charAt(0); //sir
    } else {
      // null
      target = ' ';
    }

    // How to new optional

    Optional.of("Hello"); // sir
    // Optional<String> s2 = Optional.of(null); // cannot " of null "
    Optional<String> s3 = Optional.ofNullable(null);
    s3 = Optional.of("abc");
    // new Optional // Cannot new an Optional, because Optional class banned constructor to new


    Optional<String> os = Optional.empty(); // sir

    // ifPresent() -> Lambda Expression
    // s is String already, s is not Optional String

    int x = 0;
    generate2("abc").ifPresent(string -> {
      // target = string.charAt(0); // NOT OK for write
      System.out.println(x); // OK for read
      // System.out.println(target); // why , wait sir to check
    });


    // Stream -> findFirst() findAny()
    List<Customer> customers = Arrays.asList(new Customer("John", 13),
        new Customer("Jenny", 30), new Customer("Peter", 28));
    Optional<Customer> optCustomer = customers.stream()
        .filter(customer -> customer.getAge() > 20).findFirst();

    optCustomer.ifPresent(c -> System.out.println(c.toString()));

    customers.stream().filter(customer -> customer.getAge() > 20).findFirst()
        .ifPresent(c -> System.out.println(c));

    customers.stream().filter(customer -> customer.getAge() > 20).findFirst()
        .isPresent(); // return true or false ( always use with if block )

    // you should not findFirst() and the get() directly
    customers.stream().filter(customer -> customer.getAge() > 50).findFirst() // Optional.ofNullable(null)
        .get(); // NoSuchElementException

    // way to get the element from optional obj
    // 1. isPresent()
    // 2. ifPresent()
    // 3. orElse
    Optional<Customer> optCustomer2 = Optional.of(new Customer("Mary", 21));
    Customer  customer = optCustomer2.orElse(new Customer("Susan", 29)); // sir
    System.out.println(customer);

    // 4.orElseThrow()
    Customer customer2 =
        optCustomer2.orElseThrow(() -> new RuntimeErrorException(null));

    // 5. orElseGet
    Customer customer3 =
        optCustomer2.orElseGet(() -> new Customer("Dummy", -99));


       //sir      check box.java
       Optional<String> optCustomer4 = null;
       optCustomer4.orElse("Hello"); //NPE

       Optional<String> optCustomer5 = null;
       optCustomer5.orElse("Hello"); 


  }

  // method author
  public static String generate(String s) {
    if (s == null) {
      return s = null;
    }
    return s.replace('a', 'b').toUpperCase();
  }


  // 1. Optional<String> is not a String
  public static Optional<String> generate2(String s) {
    if (s == null)
      return Optional.ofNullable(null);

    return Optional.of(s.replace('a', 'b').toUpperCase());
  }
}
