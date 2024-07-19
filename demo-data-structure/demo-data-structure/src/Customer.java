public class Customer {
  private int age;
  private String name;

  public Customer(int a, String n) {
    this.age = a;
    this.name = n;
  }

  public int getAge() {
    return this.age;
  }

  public String getName() {
    return this.name;
  }

  public void setAge(int a) {
    this.age = a;
  }

  public void setName(String n) {
    this.name = n;
  }

  @Override
  public String toString(){
    return this.getName() + " : " + this.getAge() + " ";
  }
}
