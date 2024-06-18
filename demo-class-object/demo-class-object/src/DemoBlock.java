// 18 Jun 24

public class DemoBlock {
  private static int number;
  private String name;

  //static block
  // only triggered 1 time only 
  // even this is no static variable. static block still triggered
  static{
    System.out.println("start static block");

    number = 3;
    Cat c = new Cat();
    System.out.println("end static block");
  }

  //instance block
  //1  triggerd when new object is create
  //2  trigger before constructor
  //3  Usage. Common logic bewteen constructor
  {
    System.out.println("start instance block");
    name = "John";  // => this.name = "John"
    System.out.println("end instance block");
    number = 10;
  }

  public DemoBlock(){
    System.out.println("calling empty constructor,..,.,");
  }

  public DemoBlock(String name){
    System.out.println("calling all args constructor,..,.,");
   this.name = name;
  }

  public static void main(String[] args) {
    System.out.println("start");
    System.out.println(DemoBlock.number);
    System.out.println("end");

    DemoBlock db1 = new DemoBlock();
    DemoBlock db2 = new DemoBlock("vincent");
    System.out.println(DemoBlock.number);
    System.out.println("end..");

  }
}
