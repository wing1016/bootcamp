public class Ball {
  private double weight;
  private String color;
  private int number;

  // constructor
  // get, set, toString
  // by default, there is a empty constructor

  // public Ball(){

  // }

  public Ball() { // < no args , so this is empty constructor
    this.color = "RED";
  }

  public Ball(double w, String c) {

    this.weight = w;
    this.color = c;

  }

  public Ball(double w, String c, int n) {
    this(w, c);   // calling self constructor
    this.number = n;

  }

  // dummy constructor for test
  public Ball(String c, double w) { // swap atgs is ok

    this.weight = w;
    this.color = c;

  }


  public double getWeight() {
    return this.weight;
  }

  public String getColor() {
    return this.color;
  }

  public void setWeight(double w) {
    this.weight = w;
  }

  public void setColor(String c) {
    this.color = c;
  }

  // toString
  // public String toString(){
  // return "2";
  // }

  @Override
  public String toString() {
    return "Weight : " + this.weight + " Color : " + this.color + ".";
  }



  public static void main(String[] args) {
    Ball b1 = new Ball(); // empty constructor to create a ball object
    System.out.println(b1.getColor());

    Ball b2 = new Ball(10.2, "BLACK");
    System.out.println(b2.getColor()); // BLACK
    System.out.println(b2.getWeight()); // 10.2

    System.out.println(b2.toString()); // Ball@4517d9a3 (object reference)
    // New toString output >> Weight : 10.2 Color : BLACK.

  }

}
