package shape;

import java.math.BigDecimal;

public class Circle implements Shape {

  private double radius;

  public Circle(double r){
    this.radius = r;
  }

  @Override
  public double area() {

    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();
  }

  public static void main(String[] args) {

    Circle c = new Circle(3.0);
    System.out.println(c.area());
    
  }
  
}
