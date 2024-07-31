import java.util.List;
import java.util.Stack;

public class StackDemo {

  // Stack 2 method -> Push() r, Pop()  !!!( Last in - First out )

  public static void main(String[] args) {
    // Last in - First out
    Stack<String> ss = new Stack();

    ss.add("Hello");
    ss.add("world");
    ss.add("abc");
    System.out.println(ss.pop()); // pop() will remove the last element
    System.out.println(ss);
    System.out.println(ss.pop());
    System.out.println(ss);

    ss.add("bbb");
    System.out.println(ss);

    List<String> ss2 = new Stack<>();

    // ss2.push();
    // ss2.remove(); < error

    ss2.add("Hello_List_Stack");
    ss2.add("abc");
    ss2.remove("abc");
    System.out.println(ss2);
  }
}
