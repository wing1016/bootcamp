import java.util.HashMap;

public class HKID {
  private String value;

  public HKID(String v) {
    this.value = v;
  }

  public String getValue(){
    return this.value;
  }

  public String toString(){
    return this.value;
  }

  public static void main(String[] args) {
    HashMap<HKID, Customer> customerMap = new HashMap<>();
    // "A1234567", 34, "John"
    customerMap.put(new HKID("A1234567"), new Customer(34, "John"));
    // System.out.println(customerMap);

    customerMap.put(new HKID("A1234567"), new Customer(24, "Susan"));

    //duplicated key
    //put one more customer with same key 
    customerMap.put(new HKID("A1234567"), new Customer(34, "John"));
    System.out.println(customerMap);
  }
}
