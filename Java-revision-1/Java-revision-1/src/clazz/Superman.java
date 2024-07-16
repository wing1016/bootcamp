package clazz;

import java.util.Objects;
import java.util.SortedMap;

public class Superman extends Person implements Flyable, PowerUp {

  // private String name;

  public Superman() {
    super(); // calling Person()
    // super(); // calling Person()
  }

  public Superman(String name) {
    super(name); // calling parent class constructor with name
  }

  @Override
  public void fly() {
  }

  // equals , default Object equals is checking the Object reference address
  @Override
  public boolean equals(Object obj) {
    if (this == obj) { // if address same , than all things is same
      return true;
    }
    if (!(obj instanceof Person)) {
      return false;
    }
    Superman sm = (Superman) obj;

    return Objects.equals(super.getName(), sm.getName());

  }

  //hashcode
  @Override
  public int hashcode(){        // #sir version chk 
    return Objects.hash(super.getName());
  }

  @Override
  public String toString(){
    return "Superman : " + super.toString();
  }

  @Override
  public void powerUp(){

  }

  public static void main(String[] args) {
    // Inheritance only inherite for instance method, and attribute
    // But do not inherite constructor
    // So we need "Super" keyword to super the constructor
    Superman sm = new Superman("John"); // name? No Name attribute in



    // Polymorphism
    Person p1 = new Superman("Wing");
    // During compile time, p1 cannot fly(), because p1 is declared by Person
    // which can call the instance method from Person.class only
    // fly() method is hidden when you use p1 to interact Superman Object
    p1.eat();

    Superman s1 = (Superman) p1; // Parent -> Child (downcast)
    // what is the risk
    // p1 can be an object created by other class and this class extending Person.class as well
    s1.fly();


    // #sir verion
    Superman s2 ;

    //if you want to eliminate the risk , you need to use instanceof 
    if (p1 instanceof Superman) {
      s2 = (Superman) p1;
    }

    //equals
    System.out.println(sm);
    Superman sm2 = new Superman("John");
    System.out.println(sm.equals(sm2));

    //!!! NEW things here , use interface as Object reference
    PowerUp superman = new Superman("Sally"); // what is the point to use interface as object reference 
    superman.powerUp();

    Superman sm3 = (Superman) superman;      // cast PowerUp to Superman 
    // #sir version here
  }

  //interface is more use than parent class (extends) 10 times
  // parent class bad point -> extends only 1 class , ( hard to enhance )
  //extends ( Parent class have common attribute. hard to enhance, maintence ) 
  //In java, Object is very important
}
