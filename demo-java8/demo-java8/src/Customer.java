import java.util.Objects;

public class Customer {

  private String name;
  private int age;

  public Customer(String s) {
    this.name = s;
  }

  public Customer(String s, int a) {
    this.name = s;
    this.age = a;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }


  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Customer)) {
      return false;
    }
    Customer customer = (Customer) obj;

    return Objects.equals(this.getName(), customer.getName());
  }


  @Override
  public int hashCode() {
    return Objects.hash(this.getName());
  }


  @Override
  public String toString() {
    return "Customer : " + this.getName() + " Age : " + this.age;
  }
}
