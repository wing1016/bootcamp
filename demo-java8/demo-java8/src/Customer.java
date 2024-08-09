public class Customer {
  
  private String name;

  public Customer(String s){
    this.name = s;
  }

  public String getName(){
    return this.name;
  }

  @Override
  public String toString(){
    return "Customer : " + this.getName();
  }
}
