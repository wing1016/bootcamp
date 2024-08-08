import java.util.LinkedList;
import java.util.List;

public class DemoLambda {

  public static void main(String[] args) {
    Swimable p = new Swimable() {
      @Override
      public void swim() {
        System.out.println("I am swimming...");
      }
    };
    p.swim(); // #sir


    // Lambda expression
    // The reason that we can use "() -> implementation" is that interface contains 1 abstract method only

    Swimable person = () -> System.out.println("I am swimming...");
    System.out.println(person.toString());
    person.swim();

    person = () -> System.out.println("I am swimming!!!");
    System.out.println(person.toString());
    person.swim();

    // Calculator calculator = (a, b) -> return a + b; ( no need "return" in java 8 )
    Calculator sumCalculator = (a, b) -> a + b;
    System.out.println(sumCalculator.calculate(10, 3));

    Calculator multiCalculator = (a, b) -> a * b;
    System.out.println(multiCalculator.calculate(10, 3));

    // More then 1 line of implementation
    // Then you have to use "return" keyword within the implementation block
    // if there is only 1 parameter , you can skip the ( ), only x also OK
    Drivable father = x -> { // -> Drivable father = (x) -> {
      if (x == 3) {
        return false;
      }
      return true;
    };
    System.out.println(father.drive(3));
    System.out.println(father.drive(4));

    // For loop ( for-each loop )
    List<String> strings = new LinkedList<>();
    strings.add("abc");
    strings.add("xyz");
    strings.add("imhk");

    // for each
    String t = "";
    for (String string : strings) {
      System.out.println(string);
      t += string; // < this part cannot do in Lambda style for each
    }

    // Lambda for-each
    strings.forEach(s -> System.out.println(s));

    strings.forEach(s -> {
      if (s.length() > 3) {
        System.out.println(s);
      } else {
        System.out.println("Hello");
      }
      // t += s;
      // return 1; lambda dor each cannot return things
    });

  }
}
