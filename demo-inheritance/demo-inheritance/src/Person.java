// 18 Jun 24

//Abstract
public abstract class Person {
  private String name;
  private int age;

  public Person(String n, int a) {
    this.name = n;
    this.age = a;

  }

  public String getName(){
    return this.name;
  }

  public int getAge(){
    return this.age;
  }

  public void setAge(int a){
    this.age = a;
  }


  //abstract class cannot new a object
  public static void main(String[] args) {

    //abstract class cannot create objectof its class
    // Person p = new Person("Wing", 30);  // why we need to new a person. why we need to new a shape.

    //Student.class in public
    //Student.class constructor is public
    Student s = new Student("Wing", 12, 30);
    System.out.println(s.getName());
    System.out.println(s.getAge());
  }

}
