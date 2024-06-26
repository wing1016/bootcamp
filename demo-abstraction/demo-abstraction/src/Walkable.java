public interface Walkable {

  //技能, 合約
  //interface can not NEW, only class can NEW
  //Interface
  //1. no instance variable  ( abstract class can have instance variable )
  //2. all methods are "public abstract" implicitly
  // no need to write " abstract void walk() "
  //3. you can still declared public static final, all variable is public here
  //4. A class can implement more than 1, interface, but a class can only exntend 1 
    // abstract class


  //public static final int number = 3;
  int AGE = 3;   // constant use Capital letter ( this is not attribut )

  // variable inside an interface, automatically static final & public

  void walk();

  default void run(){
    System.out.println("Default: Walkable.run(),..,,..");
  }

  static void Swim(){
    System.out.println("I am swimming");
  }

  ///default cannot follow static method, defaule is use for instacnce method 
  //for other class to 計承 
//  default static Read(){

//  }

}
