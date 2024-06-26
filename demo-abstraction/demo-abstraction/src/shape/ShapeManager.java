package shape;

public class ShapeManager {
  private Shape shape;

  //Design implication
  //you should put an object which implemented the contract (interface)
  //so that the parameter object MUST contain area() method

  public ShapeManager(Shape s) {
    this.shape = s;
  }

  // during complie time, Java guarantee object is able to call area() method
  public boolean isTooBig() {
    return this.shape.area() > 20.0;
  }

  public void setShape(Shape s){
    this.shape = s;
  }

  public static void main(String[] args) {

    Shape c = new Circle(3.0);

    ShapeManager sm = new ShapeManager(new Circle(3.0));
    System.out.println(c.area());
    System.out.println(sm.isTooBig());

    sm.setShape(Square(4.0));
    System.out.println(sm.isTooBig());
  }
}
