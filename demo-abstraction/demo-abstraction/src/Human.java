public class Human extends SuperHuman implements Walkable, Readable {

  // Class can only inherit instance method, and instance variable
  // Constructor CANNOT be inherited
  
  public Human(){   //this empty constructor need SuperHuman empty constructor 存在

  }
  
  public Human(double h) {
    super(h);  
  }


  @Override
  public void walk() {
    System.out.println("Human is walking");
  }

  @Override
  public void run() {
    System.out.println("superman is runing~!!!");
  }

  @Override
  public double getHeight() {
    return super.getHeight() + 3;   //  add value for the super method from SuperHuman
  }

  public static void main(String[] args) {
    System.out.println(Walkable.AGE); // > 3 . public static final
    Human h1 = new Human();
    h1.walk();
    h1.run();

    Superman spm = new Superman();
    spm.run();

  }

  @Override
  public void read() {
    System.out.println("HUman is reading...~!");
  }


}
