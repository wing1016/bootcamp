public class Human implements Walkable, Readable {

  @Override
  public void walk() {
    System.out.println("Human is walking");
  }

  @Override
  public void run(){
    System.out.println("superman is runing~!!!");
  }

  public static void main(String[] args) {
    System.out.println(Walkable.AGE);   // > 3 . public static final
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
