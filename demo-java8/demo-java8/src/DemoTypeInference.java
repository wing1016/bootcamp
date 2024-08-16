import java.util.Arrays;
import java.util.List;

public class DemoTypeInference {
  public static void main(String[] args) {
    int x; // declaration
    x = 3; // initializate / value assigement

    int j = 3;

    var y = 3; // complie time -> int y = 3; class file (byte code)
    // y = "Hello"; //error
    // y = 3.0; // error

    var z = "Hello";
    // z = 3.0; //error

    var k = new Customer("John");
    k = new Customer("Mary");
    // k = 3; error

    List<Customer> customers =
        Arrays.asList(new Customer("Benny"), new Customer("Wing"));
    for (var customer : customers) {

    }
  }

  // NOT Support
  var age;      //compiler force the initialization together with declaration
  int age2;

  public static class Example{
 //   var x;      // cannot !!!
  }

  // Polymorphrism -> method signature is determind durong compile time
  // public static int sum(var x, var y) {      // cannot !!!
  //   return x + y;
  // }



  // public static var sum(int x, int y) {
  //   return x + y;
  // }

}
