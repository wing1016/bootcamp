package linkedlist;

import java.util.List;
import java.util.LinkedList;

public class LinkedListDemo {
  public static void main(String[] args) {
    // Array vs ArrayList -> 1. Underlying structure of ArrayList is an ARRAY
    // Array charater 2. -> fixed length -> continues memory location

    //
    Cat c = new Cat(Color.BLUE);
    // Heap
    // Step 1: Cat Object
    // Step 2: Eye Array Object
    // Step 3: Two Eye objects
    // Step 4: 3 color objects ( created when you run main method )

    c.getEyes(); // cat object -> get Eye Array Object
    c.getLeftEye(); // Cat object -> get Eye Array object -> get Eye object

    Eye[] eyesArr = c.getEyes(); // beck up Eye Array object memory location
    Eye rightEye = eyesArr[1];

    // What is the relationship between the memory location of cat, eyes, rightEye?
    // 1. LeftEye vs RightEye ( neighbour )
    // 2. Cat object vs Eye[] object ( no relationship )
    // 3. Cat object vc eye object ( no relationship )

    String[] sArr = new String[5];

    List<String> string2 = new java.util.LinkedList<String>(); // List<String> string2 = new ArrayList<>();
    // !!!Why cannot here ? >> //List<String> string2 = new LinkedList<>();
    // It is because LinkedList.java file name / package name conflit with the LinkedList class name

    // #check #sir version and Download the Person.java from sir git

    string2.add("A");
    string2.add("B");
    string2.add("C");
    string2.remove("B");
    string2.remove(0);
    string2.add("D");

    for (String s : string2) {
      System.out.println(s);
    }
    // for (int i = 0; i < 1_000_000; i++) {
    // System.out.println(i);
    // }


    // LinkedList vs ArrayList
    // - underlying structure is diff
    // Method Difference - ( LinkedList -> addFirst(), removeFirst() )

    LinkedList<String> ll = new java.util.LinkedList<String>();

    // int x = 3                  // ll can be dynamic, not fixed, depends on the input x 
    // if (x > 2) {
    //   ll = new ArrayList<String>();
    // } else {
    //   ll = new LinkedList<>();
    // }

    ll.add("hello");
    ll.addFirst("abc");
    ll.add("def");
    for (String s : ll) {
      System.out.println(s);
    }
    ll.removeFirst();
    for (String s : ll) {
      System.out.println(s);
    }

    System.out.println(ll.indexOf("def"));    
    System.out.println(ll.peek());

    ll.add("hello");
    System.out.println(ll.lastIndexOf("hello"));
  }
}
