import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
  public static void main(String[] args) {
    Queue<String> pd = new PriorityQueue<>();

    pd.add("def");  //Sorting   def
    pd.add("abc");  //Sorting   def, abc -> abc, def
    pd.add("bbb");  //Sorting   abc, def -> abc, bbb, def
    pd.add("aax");
    pd.add("azx");
    System.out.println(pd); //[abc, def, bbb]
    // add() method DO NOT gurantee SORTING

    //while
    while (!pd.isEmpty()) {
      System.out.println(pd.poll());  //.poll() ,get item from the head
      // !!! PriorityQueue ONLY sort goodly when you do poll() method
   }

   Queue<String>  pq2 = new LinkedList<>();
   pq2.add("def"); 
   pq2.add("abc");   
   pq2.add("bbb");   
   pq2.add("aax");
   pq2.add("azx");
   System.out.println(pq2);
// Collections.sort(pq2); // error < not yet implement Comparable.class ( Queue dont have .sort() )
   Collections.sort((LinkedList<String>) pq2);  // need to cast pq2 to LinkedList<String>
   System.out.println(pq2);
   // PriorityQueue add() & poll() is diff from LinkedList class (implementation)


    Queue<Integer> pq3 = new PriorityQueue<>();
    pq3.add(12);
    pq3.add(46);
    pq3.add(1290);
    pq3.add(124);
    pq3.add(-724);
    System.out.println(pq3);    // it will sort AUTOly when run poll()!!!
    System.out.println(pq3.poll());     //-724

    pq3.add(-900);

    System.out.println(pq3.poll());     //-900
    System.out.println(pq3.poll());     //12
    System.out.println(pq3.poll());     //46

  }
}
