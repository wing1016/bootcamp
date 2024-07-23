import java.time.LocalDate;
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Integer[] integers = new Integer[] {2, 10, -4};
        int sum = 0;
        for (Integer i : integers) {
            sum += i;
        }
        System.out.println(sum); // 8

        // ArrayList
        // List of integer
        ArrayList<Integer> integers2 = new ArrayList<Integer>();
        // call constructor of ArrayList.class

        integers2.add(2);
        integers2.add(10);
        integers2.add(-4);

        sum = 0;
        for (Integer i : integers2) {
            sum += i;
        }
        System.out.println(sum); // 8
        integers[1] = null; // [2, null, -4]

        // Difference between Integer[] and ArrayList<Integer>
        // 1. Initialization:Array (fixed length)
        // 2. Underlying structure: Array already lowerest raw level. array is array,
        // array is not a class.
        // ArrayList is a class . ( is an array )

        //

        System.out.println(integers2.size()); // 3
        integers2.remove(1);
        System.out.println(integers2);

        integers2.set(1, -100);
        System.out.println(integers2); // [2, -100]

        System.out.println(integers2.contains(2)); // true

        System.out.println(integers2.indexOf(-100)); // 1
        System.out.println(integers2.indexOf(-1000)); // -1

        integers2.add(2);
        System.out.println(integers2.indexOf(2)); // 0

        System.out.println(integers2);
        System.out.println(integers2.lastIndexOf(2));

        // subList
        System.out.println(integers2.subList(1, 3)); // toindex is (n - 1)

        System.out.println(integers2); // integers2 is not changed. //[2, -100, 2]

        // addAll()
        ArrayList<Integer> integers3 = new ArrayList<Integer>();
        System.out.println(integers3.isEmpty());

        integers3.addAll(integers2);
        System.out.println("integers3 :" + integers3);

        ArrayList<String> strings = new ArrayList<>();
        // you can skip the type declaration inside <> when you create ArrayList
        // by default it will equals to the left hand side <>
        strings.add("Hello");
        strings.add("abc");
        strings.add("world");
        System.out.println(strings);
        strings.remove(1); //
        System.out.println(strings);
        strings.remove("Hello"); // remove will only remove the first match item ( if there is 2 "Hello" in the ArrayList )
        System.out.println(strings);

        System.out.println(strings.get(0));  //world

        // Question get customer age > 30 and name start with J
        Customer[] c = new Customer[] {new Customer(40, "Mary"),
                new Customer(31, "John"), new Customer(29, "Jason"),
                new Customer(18, "Wing")};
        ArrayList<Customer> arrC = new ArrayList<Customer>();

        for (Customer cus : c) {
            if ((cus.getAge() > 30 ) || cus.getName().charAt(0) == 'J'   ) {
                arrC.add(cus);
            }
        }
        System.out.println(arrC.toString());

        //check #sir version 

        // Loop

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("abc");
        objects.add(1);
        objects.add(LocalDate.of(2024,5, 22));

        //check #sir version
    }
}
