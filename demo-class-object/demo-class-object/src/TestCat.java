public class TestCat {
  public static void main(String[] args) {

    //local variable;
    String name = "John";
    Cat c1 = new Cat(); // "new cat()" -> create a Cat object in memory
    Cat c2 = new Cat(); 

    // memory address -> 0x12fsfbs45456
    //c1 -> object refference , (variable), able to find the cat object

    c1.setAge(10);
    //c2.setAge(7);

    System.out.println(c1.getAge()); //10
    System.out.println(c2.setAge(7));
  }

  TestCat tc = new TestCat();  // new a class object for TestCat class

  Cat c3 = new Cat();
  


}
