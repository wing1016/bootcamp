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

  //The T here in static method has NO relationship to the T declared in attribute
  public static <U> Box<U> createBox(U value){    //<T> <- output range of the static generic method  
    return new Box<>(value);
  }

  public static void main(String[] args) {
    //At Run time
    //You have to define the type<T> during run-time
    Box<Integer> integerBox = new Box<Integer>();
    integerBox.setValue(100);

    Box<Customer> customerBox = new Box<>();
    customerBox.setValue(new Customer());
    //You cannto use T during run-time
    //Box<T> = new Box<T>();   << cannot write like this#`

    Box<String> stringBox = new Box<String>("ABC"); // << #sir# version

    //#sir# version 
  }

}
