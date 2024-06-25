
import java.time.LocalDate;
import java.util.Objects;
import javax.print.attribute.standard.RequestingUserName;

public class Book extends Object {
  private String author;
  private LocalDate publishDate;

  public Book(String a, LocalDate p) {
    this.author = a;
    this.publishDate = p;
  }

  // if you do not use @ Override, the hashCode() method by default representing the object address
  @Override
  public int hashCode() {
    return Objects.hash(this.author, this.publishDate);
  }

  public String getAuthor() {
    return this.author;
  }

  public LocalDate getPublishDate() {
    return this.publishDate;
  }

  // now override it , to return true if author and publish date are same in 2 books
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Book)) { // "instanceof" is checking if the object pointing by reference is an object produced by Book.class
      return false;
    }
    Book book = (Book) obj; // cast to book because i want to use method of Book object

    return Objects.equals(this.author, book.getAuthor()) // this < no need to this.getAuthor. 人地先要用.getAuthor
        && Objects.equals(this.publishDate, book.getPublishDate());

    // if (book.getAuthor().equals(this.author)
    // && book.getPublishDate().compareTo(this.publishDate) == 0) {
    // return true;
    // }

    // return false;
  }

  public static void main(String[] args) {
    Book b1 = new Book("John", LocalDate.of(2000, 12, 12));
    Book b2 = new Book("John", LocalDate.of(2000, 12, 12)); // 75848450

    Book b3 = new Book("John", LocalDate.of(2000, 12, 13)); // 75848451

    System.out.println(b1.hashCode());
    System.out.println(b2.hashCode());
    System.out.println(b3.hashCode());

    System.out.println(b1 == b2);

    System.out.println(System.identityHashCode(b1));
    System.out.println(System.identityHashCode(b2));

    // Object.class has equals() method
    // By default, object.equals() also checking the object address
    System.out.println(b1.equals(b2)); // so here is false if you do not override .equals (now is true)

    System.out.println(b1.equals(new Cat())); // false

    // if both ojects are locate at difference address, equals must return "false"
    System.out.println(b1.equals(b2)); // i overrided the metho equals
    System.out.println(b1.equals(b3));

    String str = "abc";
    System.out.println(str.hashCode()); // 96354
    System.out.println(97 * (int) Math.pow(31, 2) + 98 * 31 + 99); // 96354

    // Implication :
    // there willl be another String value with same hashcode
    // 2 difference string may be have same hashcode because of overflow
    String str2 = "abcdefghijklxy";
    System.out.println(str2.hashCode());

    String str3 = "bbcdefghijklxy";
    System.out.println(str3.hashCode());

    Integer i3 = 365;
    System.out.println(i3.hashCode());

    Object i4 = 365;
    System.out.println(i4.hashCode()); // mouse over is Object.hashcode but actually it use Integer.hashcode

    System.out.println("abc".equals("abc")); // true
    System.out.println(new String("abc").equals(new String("abc"))); // true

    Object s1 = new String("abcd");
    Object s2 = new String("abcd");

    // complie time determine if s1 is able to call equals()
    // "run time" determine the implementation (method contect) of equals() method  
    System.out.println(s1.equals(s2)); // true (runtime: String.equals)

    // mouse over method only chase the method from 指針(pointer) !!! important


    Object s3 = new Object();
    Object s4 = new Object();
    System.out.println(s3.equals(s4)); // false ( Runtime: Object.equals() )


  }
}
