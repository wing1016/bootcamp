public class Box<T> { // <T> just like MICHISU & any type

  //with generics, you can write lesser class , 
  // and you can decide the type for the class later.
  //To let user helping to finish the class, to choose the what type for the class

  // cannot put primitive into <T>, need to put wrapper class into <T>
  private T value;

  public Box() {

  }

  public Box(T value) {
    this.value = value;
  }

  public T getValue() {
    return this.value;
  }

  public void setValue(T value) {
    this.value = value;
  }

  public static void main(String[] args) {
    //At Run time
    //You have to define the type<T> during run-time
    Box<Integer> integerBox = new Box<Integer>();
    integerBox.setValue(100);

    Box<Customer> customerBox = new Box<>();
    customerBox.setValue(new Customer(30, "wing"));
    //You cannto use T during run-time
    //Box<T> = new Box<T>();   << cannot write like this
  }

}
