package Linkedlist;


//List<String>, String[]
public class Node {
  private String value;
  private Node next;

  public Node(String value) {
    this.value = value;
  }

  public Node(String s, Node n) {
    this.value = s;
    this.next = n;
  }

  public Node next(Node n) {
    this.next = n;
    return n;
  }

  public Node getNext() {
    return this.next;
  }

  public String getValue() {
    return this.value;
  }

  public static void main(String[] args) {
    Node n = new Node("A");
    Node n2 = n.next(new Node("B"));
    n2.next(new Node("C"));

    Node head = n;

    //   <<   Wing Version of LinkList  >>
    // while (head.getNext() != null || head.getNext() == null ) {
    //   System.out.println(head.getValue());
    //   head = head.getNext();
    //   if (head.getNext()==null) {
    //     System.out.println(head.getValue());
    //     break;
    //   }
    // }

    while (head != null  ) {    //  while (head.getNext() != null  ) {
      System.out.println(head.getValue());
      head = head.getNext();      
    }
  }

}
