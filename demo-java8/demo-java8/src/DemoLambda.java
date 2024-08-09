import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import javax.lang.model.type.UnionType;

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

    //11 Function.class //() represent no parameter
    Function<String, Integer> stringLength = str -> 3;
    Function<String, Integer> strLen = str -> str.length(); // write lambda is writing formula

    System.out.println(strLen.apply("hello"));
    System.out.println(strLen.apply("hell"));

    Function<String, Integer> strLen2 = new StringLength();

    System.out.println(strLen2.apply("GoodBye mama"));

    Function<Customer, Integer> nameLength =
        customer -> customer.getName().length();

    Function<Customer, String> greetingMessage = customer -> {
      String message = "Hello everybody : ".concat(customer.getName());
      return message;
    };

    // sir

    BiFunction<String, String, Integer> nameLength2 =
        (firstName, lastName) -> firstName.length() + lastName.length();

    System.out.println(nameLength2.apply("Vincent", "Lau"));
    // sir

    //22 Consumer
    // public interface Consumer<T>{
    // void accept (T,t)}
    Consumer<Customer> printCustomerName =
        customer -> System.out.println(customer.getName() + " is consumer");

    printCustomerName.accept(new Customer("Jenny"));

    // Void accept(T t, U u)
    BiConsumer<Customer, Customer> getMarried =
        (customer1, customer2) -> System.out.println(
            customer1.getName() + " get Married with " + customer2.getName());

    getMarried.accept(new Customer("Ho Po Wing"), new Customer("Lai Yiu Fai"));

    // Not only can sys out , may be can call an api or connect to database to do something

    // sir // void no need to sys out , 本身已經會sys out
    // sir switch case example here
    // SUM, SUBSTRACT ,...
    MathOperation operation = MathOperation.MULTIPLY;


    //33 Supplier
    // generate random number
    // Supplier<Integer> genRan = () -> System.out.println(new Random().nextInt(49)); // why ? ask gpt
    Supplier<Integer> genRan = () -> new Random().nextInt(49) + 1;
    System.out.println(genRan.get());
    int ball = -1;
    List<Integer> markSix = new LinkedList<>();
    while (markSix.size() < 6) {
      ball = genRan.get();
      if (markSix.contains(ball)) {
        continue;
      }
      markSix.add(ball);
    }
    System.out.println(markSix);

    //44 Predicate - save a formula to return boolean , not saving a boolean!!!
    Predicate<Customer> isNameTooLong = customer -> customer.getName().length() > 5;
    System.out.println(isNameTooLong.test(new Customer("Vincent")) + " Name is tested ");


    BiPredicate<String, String> isBothStringLong = (string1, string2) -> string1.length() > 5 && string1.length() > 5;
    System.out.println(isBothStringLong.test("abcxyz", "hello hell") + "   isBothStringTooLong is finished! ");

    //Union
    UnaryOperator<Integer> add1 = toadd -> toadd +=1;    
    System.out.println(add1.apply(5));

    //Union sir version
    //UnaryOperation<String> = Function<String, String>

    UnaryOperator<String> nameFormula = s ->  s + " !!!";
    System.out.println(nameFormula.apply("Yeah"));


    BinaryOperator<String> nameFormula2 = (s1, s2) -> s1 + s2;
    System.out.println(nameFormula2.apply("ComeOn ", " Baby"));

  }

  public static int getNameLength(String first, String last) {
    // sir
    return 1;
  }
}
