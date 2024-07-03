import java.time.LocalDate;

public class Cat { // class name -> able to describe physical object

  // All method public , all attribute private < remember first

  // what is this
  //
  // attributes
  // state
  private String name; // always private, remember first
  private LocalDate bday;
  private int age;

  // if no constructor is defined, an empty constructor is auto made

  // behavior
  // instance method
  // setAge() is a method that can be called by object only
  public boolean setAge(int name) {
    this.age = name; // age = x;
    return true;

  }

  public void setName(String x) {
    this.name = x;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  // instance method
  public String describe() {
    return "Age is " + this.age + " .Name is " + this.name;
  }

  public String hello() {
    return "hello~ ";
  }

  public static String hello(String s) {
    return "hello~ " + s;
  }

  public boolean isTooOld() {
    return this.age > 10;
  }

  public static void main(String[] args) {

    System.out.println(Cat.hello("CatCat"));
    System.out.println(Book.hello());

    Cat c = new Cat();
    System.out.println(c.hello());
    c.setAge(13);
    c.setName("Low B cat");
    System.out.println(c.describe());

    if (c.age > 10) {
      // consult doctor
    }


    System.out.println(c.isTooOld());

  }


}
