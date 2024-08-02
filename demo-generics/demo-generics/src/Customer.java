public class Customer {
  private int age;

  public Customer() {}

  public Customer(int a) {
    this.age = a;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int a) {
    this.age = a;
  }

  @Override
  public String toString() {
    return "Age " + this.age;
  }


}
