public class Book1 {
  private double price;
  private String author;

  // Do not write setter , to dont let other ppl use

  // getter and setter is not a must

  

  public Book1(double price, String author){


  }

  //Type of instance method
  //getter, setter..
  //presentation -> definition, String.substring
  public boolean isTooExpensive(){
    return this.price > 100;
  }

    //transform (replace ) 


    public static void main(String[] args) {
      Book book = new Book(99.9, "John");
      System.out.println(book.price());   //99.9
      System.out.println(book.author());  //John
      //getPrice -< "get" keyword is skipped, but this is getter
      
      //  System.out.println(book.price);  //The field Book.price is not visible ( privated )
      
      //equals()
      Book book2 = new Book(99.9, "John");
      Book book3 = new Book(11.1, "Ann");

      System.out.println(book.equals(book2));
      System.out.println(book.equals(book3));

      //hashCode()
      System.out.println(book.hashCode());    //1586360712
      System.out.println(book2.hashCode());   //1586360712
      System.out.println(book3.hashCode());   //-276037183

      //toString()
      System.out.println(book.toString()); 
      System.out.println(book2.toString());  
      System.out.println(book3.toString());       
    }

}
