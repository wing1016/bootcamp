package clazz;

public class Person {
  private String name; // if you use public here, it means you give up to use encapsulation
  // it implies the source value can be read and replaced by others
  // no reason the use public here . except CONSTANT

  // Constant
  public static final double PI = Math.PI;

  public String getName() {
    return this.name;
  }

  // By default a class contain empty constructor
  public Person() {
  }

  public Person(String name){
    this.name = name;
  }

  public void eat(){

  }

  @Override
  public String toString(){
    return "name :" + this.name;
  }

}
