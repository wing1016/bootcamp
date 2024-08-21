import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DemoVector {
  public static void main(String[] args) {

    // ArrayList (non-thread safe, faster) vs Vector ( thread safe, slower )

    // ArraysList implemantations differs to Vector implementation
    List<String> strings = new ArrayList<>(); // Vector<>(); / ArrayList<>();

    Runnable addStringToArraysList = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        strings.add("hello");

      }
      // System.out.println("ArraysList.size() : " + strings.size() ); //ArraysList.size() : 1000000
    }; // run() method implementation

    long startTime = System.currentTimeMillis();

    Thread thread1 = new Thread(addStringToArraysList);
    Thread thread2 = new Thread(addStringToArraysList);
    thread1.start(); // start() will call run() ;
    thread2.start();

    try {
      thread1.join();
      thread2.join();
      long afterTime = System.currentTimeMillis();
      System.out.println(" ArraysList runtime : " + ( afterTime - startTime ));

      System.out.println("ArraysList.size() : " + strings.size());

    } catch (InterruptedException e) {

    }

    System.out.println(" ArraysList : " + strings.size()); // NOT OK, this is main thread // 0
    System.out.println("Program run.....");

    // The reason why the answer is not 2_000_000 ( ArraysList.size() : 1207097 )
    // Steps to resize the ArraysList / Array
    // 1. Create a new array ( length + 1 )
    // 2. Copy the old array to new array
    // 3. Add the new element at the end of array
    // 4. Reassign the new obj ref to rhe old obj ref

   // ###################################################################################

    List<String> strings2 = new Vector<>(); // Vector<>(); / ArrayList<>();

    Runnable addStringToVector = () -> {
      for (int i = 0; i < 1_000_000; i++) {
        strings2.add("hello");

      }
      // System.out.println("ArraysList.size() : " + strings.size() ); //ArraysList.size() : 1000000
    }; // run() method implementation

    long vStartTime = System.currentTimeMillis();
    Thread thread3 = new Thread(addStringToVector);
    Thread thread4 = new Thread(addStringToVector);
    thread3.start(); // start() will call run() ;
    thread4.start();

    try {
      thread3.join();
      thread4.join();
      long vAfterTime = System.currentTimeMillis();
      System.out.println(" Vector runtime : " + ( vAfterTime - vStartTime ));
      System.out.println("Vector.size() : " + strings2.size());

    } catch (InterruptedException e) {

    }

    System.out.println(" Vector : " + strings2.size()); // NOT OK, this is main thread // 0
    System.out.println("Program run.....");

    //sir
  }
}
