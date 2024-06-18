// 18 Jun 24

//Abstract
public class Person {
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

  public static void main(String[] args) {
    Person p = new Person("Wing", 30);

    //Student.class in public
    //Student.class constructor is public
    Student s = new Student("Wing", 12, 30);
    System.out.println(s.getName());
    System.out.println(s.getAge());
  }

}
