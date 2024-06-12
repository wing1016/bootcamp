public class Address {

  private String line1;
  private String line2;
  private String line3;

  public Address(String l1, String l2, String l3) {
    this.line1 = l1;
    this.line2 = l2;
    this.line3 = l3;

  }

  public String getLine1() {
    return this.line1;
  }

  public String getLine2() {
    return this.line2;
  }

  public String getLine3() {
    return this.line3;
  }

  public void setLine2(String l2){
    this.line2 = l2;
  }

  //println will call toString() method

  public String toString() {
    return "Address( " + this.line1 + this.line2 + this.line3 + " )";
  }

  public static void main(String[] args) {
    // create a Form Object with Address object
    Address address = new Address("Hong Kong", "Chaiwan", "Happy Street");
    Form form = new Form("Wing", "Ng", address);

    System.out.println(form);
    System.out.println(form.getAddress().getLine2());


    Form form2 = new Form("Jenny", "Wong", new Address("Kowloon", "MongKok", "Hell Street"));
    System.out.println(form2.getAddress().getLine2());


  }
}
