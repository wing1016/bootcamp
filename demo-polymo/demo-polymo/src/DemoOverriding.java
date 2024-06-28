public class DemoOverriding { // dynamic polymorphism (run-time)

  public static void main(String[] args) {

    //Example 1
    Animal animal = new Cat();
    animal.walk();// Compile time checks the scope of the object, not the implementation
    // animal.run(); // complie-error, because Animal.class has walk() ONLY

    //During runtime, the new cat object is created in heap memory. 
    //Then the object reference "animal" will point cat object and excute walk() method.
    //That is Cat.walk()

    //Example 2
    Animal animal2 = new Animal();
    //no relationship with Cat.class or Dog.class
    animal2.walk(); // Animal is walking

    //Example 3
    animal = new Dog();
   // animal.sleep(); //complie-err , object reference determine the scope of the object

    animal.walk();  //Animal is walking..
    //because Dog.class does not override the walk() method.
  }
  

}
