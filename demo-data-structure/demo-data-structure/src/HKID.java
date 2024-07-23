import java.util.HashMap;
import java.util.Objects;

public class HKID {
  private String value;

  public HKID(String v) {
    this.value = v;
  }

  public String getValue() {
    return this.value;
  }

  public String toString() {
    return this.value;
  }


  // see #sir version
  // you define equals and hashCode yourself
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof HKID)) {
      return false;
    }
    HKID hkid = (HKID) obj;
    return Objects.equals(this.value, hkid.getValue());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.value);
  }

  public static void main(String[] args) {
    HashMap<HKID, Customer> customerMap = new HashMap<>();
    // "A1234567", 34, "John"
    customerMap.put(new HKID("A1234567"), new Customer(34, "John"));
    // System.out.println(customerMap);

    customerMap.put(new HKID("A1234567"), new Customer(24, "Susan"));
    // after put is run , it compare the new key and the existing keys

    // if you dont override equals() and hashCode() in HKID class, it will extend equals() & hashCode() from Object.class


    // duplicated key
    // put one more customer with same key
    customerMap.put(new HKID("A1234567"), new Customer(34, "John")); // should be replace
    System.out.println(customerMap);

    System.out.println(new HKID("1234").equals(new HKID("1234")));  //true, because you overrided the "equals" method

    // inside < > must be a class, cannot put primitive

    // compare same object in java, 2 method, equals and hashCode
    // put() -> use equals() and hashCode()
    // Objective of equals() & hashCode() is identify if they are same object
    // HashMap.class equals() is to identify if they are same key/entry

    // !!! important
    // put() programe flow: hashmap.put(key, value) -> calls key.equals() & key.hashCode()
    // then key.equals() call HKID.equals

    //How about HashMap<String, String> ?
    //String.class is already done. You cannot change the implementation of equals() & hashCode()
    //so String.equals() is comparing the value itself to check if they are same object
    System.out.println(new Integer(129).equals(new Integer(129)));  //true
    System.out.println(new Integer(129) == new Integer(129));  //False
    // enum use == is ok because enum is whole world unique.    so == is same as .equals()

    // equals() and hashCode() , you must Override both method / or both method DO NOT Override
  }
}
