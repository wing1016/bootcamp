// 19Jun24

package shape;

import java.math.BigDecimal;

public abstract class Shape {


  // public double area(){
  // return -1.0d;
  // }

  // abstract class can create abstract method without implementation
  // Method without implementation -> abstract method
  public abstract double area();

  // trying calculate area in static method from vincent
  public static double circleAreaV(double radius) {
    return BigDecimal.valueOf(radius).multiply(BigDecimal.valueOf(radius))
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  public static double totalArea(Circle[] circles) {
    return 2;
  }

  public static double totalArea(Square[] squares) {
    return 2;
  }

  public static double totalArea(Shape[] shapes) {
    BigDecimal bd = BigDecimal.valueOf(0.0d);
    for (Shape s : shapes) {
    //  bd = bd.add(BigDecimal.valueOf(s.area())).doubleValue(); // why why whyh
      bd = bd.add(BigDecimal.valueOf(s.area()));
    }
    return bd.doubleValue();
  }

  public static void main(String[] args) {

    System.out.println(Shape.circleAreaV(3.0d));
    Shape[] shapes = new Shape[] {new Circle(3.0), new Square(4.0d), new Circle(10.0)};
    System.out.println(Shape.totalArea(shapes));    
    
    //extra example
    StringBuilder sb = new StringBuilder("hello");
    sb.append(" world");
    // sb = sb.append(" world");
    System.out.println(sb);
    
  }


}
