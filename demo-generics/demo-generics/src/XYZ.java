public class XYZ<T, U> {

  private T t;
  private U u;

  public XYZ() {
  }

  public XYZ(T t, U u) {
    this.t = t;
    this.u = u;
  }

  public void setU(U u){
    this.u = u;
  }

  public static void main(String[] args) {
    XYZ<String, Customer> customers = new XYZ<>();

    customers.setU(123);   // compile error , setU method is for setting customer

    // T can be same as U
    XYZ<String, String> strings = new XYZ<>();

  }
}
