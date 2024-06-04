import java.time.LocalDate;

public class Book {
  private String name;
  private int numOfPage;
  private LocalDate publishDate;

  public boolean setName(String name) {
    this.name = name;
    return true;      // just try to see set method that not void
  }

  public void setNumOfPage(int numOfPage) {
    this.numOfPage = numOfPage;
  }
  //instance method = object method > need refernecen dot method name
  public void setPublishDate(LocalDate p){
    this.publishDate = p;
  }

  public String getName() {
    return this.name;
  }

  public int getNumOfPage() {
    return this.numOfPage;
  }

  //static method belong to class
  public static String hello(){
    return "hello~ book";
  }

  //static method
  public static void main(String[] args) {

   // Book.hello();
    System.out.println(Book.hello());// system.out.println is also a static method
  }

}
