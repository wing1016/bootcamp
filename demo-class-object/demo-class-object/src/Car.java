public class Car {
  private static int count = 0;
  private int id;
  private String color;

  public Car(int id, String c) {
    this.id = count;
    this.color = c;
  }


  //Constructor can access static variable
  public Car(String c) {
    // count++;
    this.id = ++count;    // this.id = ++count;     if use count++ here, car id will be 0, 1, 2 (not 1,2,3)
    this.color = c;
  }

  public int getId() {
    return this.id;
  }

  public String getColor() {
    return this.color;
  }

  public String toString(){
    return "car( " + this.id + " : " + this.color + " )";
  }

  public static void resetCount(){
    count = 0;
  }

  public static void main(String[] args) {
    Car c1 = new Car("red");
    Car c2 = new Car("blue");
    Car c3 = new Car("green");

    System.out.println(c1.getId());
    System.out.println(c2.getId());
    System.out.println(c3.getId());

    System.out.println(c3);

    Car.resetCount();

    Car c4 = new Car("Black");
    System.out.println(c4);

  }
}
