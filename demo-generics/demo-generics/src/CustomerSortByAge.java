import java.util.Comparator;

public class CustomerSortByAge implements Comparator<Customer> {

  // Age desending order

  // sir code 020824
  public static CustomerSortByAge of() {
    return new CustomerSortByAge();
  }

  @Override
  public int compare(Customer c1, Customer c2) {
    return c1.getAge() > c2.getAge() ? -1 : 1;
  }

 
}
