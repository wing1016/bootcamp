// 18 06 Jun 24

public class DemoStaticFinal {



  // Constant
  // use Capital letter and underscore between word
  private static final String LOGO = "default"; // static vaiable and finalized
  // private final static << also ok to swap sequence
  private static final String LOGO_STRING;

  // camel case
  private static String name; // static vaiable
  private final double salary = 0.0d; // finalized instance variable, need initialized

  private int age; // Instance variable

  // final is a java keyword. Compiler would check all final variable should been initialized
  // private final double salary ; << error
  // private static final String logo ; << error


  // trigger before main method
  static {
    LOGO_STRING = "default";
  }

  // let other people get private variable
  public int getAge() {
    return this.age;
  }

  public double getSalary() {
    return this.salary;
  }

  // instance method can access both instance and static variable
  public String Test() {
    return this.age + " " + getName() + " " + this.salary + " " + LOGO;
  }

  public static String getName() {
    return name;
  }

  public static String getLogo() {
    return LOGO;
  }

  // you cannot assign static final variable in main method , it is too late

  public static void main(String[] args) {
    // instance variable
    DemoStaticFinal dsf = new DemoStaticFinal();
    dsf.age = 10;
    System.out.println(dsf.salary);
    // dsf.salary = 1000; // u cannot assign final variable again!!
    DemoStaticFinal dsf2 = new DemoStaticFinal();
    dsf2.age = 20;
    System.out.println(dsf2.salary);
    System.out.println(DemoStaticFinal.LOGO); // default

    DemoStaticFinal.name = "vincentB";

    System.out.println(dsf.Test());
    System.out.println(dsf2.Test());
  }
}
