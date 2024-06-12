public class Form {
  private String firstName;
  private String lastName;
  private Address address;

  // constructor, get, set

  public Form() {

  }

  public Form(String fn, String ln, Address add) {
    this.firstName = fn;
    this.lastName = ln;
    this.address = add;
  }

  public void setFirstName(String fn) {
    this.firstName = fn;
  }

  public void setLastName(String ln) {
    this.firstName = ln;
  }

  public void setAddress(Address add) {
    this.address = add;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public Address getAddress() {
    return this.address;
  }

  public String toString() {
    return ("First name : " + this.firstName + " last name : " + this.lastName + " : "
        + this.address);
  }



  public static void main(String[] args) {
    // create a Form Object with Address object

  }
}
