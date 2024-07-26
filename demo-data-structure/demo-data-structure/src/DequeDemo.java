import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DequeDemo {

  //Deque interface extends Queue interface
  //So it support add(), remove(), size()..etc
  //!!! Deque 特點  < can add First / Last ,
  // can remove First / Last
  public static void main(String[] args) {
    Deque<String> strings = new LinkedList<>();

    strings.add("abc");       //add() is same addLast()
    strings.add("def");
    strings.addFirst("Hello");
    strings.addLast("World");
    System.out.println(strings);
  
    System.out.println(strings.peek());        // peak() same as peakFirst()
    System.out.println(strings.peekFirst());
    System.out.println(strings.peekLast());

    strings.remove();   //remove() same as removeFirst()
    strings.removeFirst();
    System.out.println(strings);

    strings.removeLast();
    System.out.println(strings);

    //ArrayQueue.class
    Deque<String> strings2 = new ArrayDeque<>(); // underlying DS -> array -> fixed length
    strings2.add("abc");  // create new array object & put string obj into array
    strings2.add("def");  //same step here...

    strings2.addFirst("ijk");
    strings2.addLast("xyz");

    System.out.println(strings2);

    //if you see people using ArrayDeque, it means you will see addFirst / Last
    // remove First / Last in the code

    Queue<String> strings3 = new ArrayDeque<>();  // if use Queue, it means your date need to be 順序
    strings3.add("apple");
    strings3.add("banana");

    strings3.remove();
    System.out.println(strings3);

    Collection<String> strings4 = new ArrayDeque<>();   //!!!Extreme case ( assigning ArrayDeqeue to Collection!!! )

    // ArrayList can add items into the middle of the list
    List<String> ls = new ArrayList<>(); // < normal situation use like this <
    ls.add("abc");
    ls.add("edf");
    ls.add(1, "xyz");   //insert into index 1

    //Insertion - ArrayList or LinkedList which is faster?
    //Answer is > LinkedList , because only open the head pointer and add into the front.


  }
}
