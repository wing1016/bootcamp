package shape;

import java.math.BigDecimal;

public class Square implements Shape {

  // check with ah #sir version !!!! here


  private double widith;

  public Square(double w) {
    this.widith = w;
  }

  @Override
  public double area() {
        return BigDecimal.valueOf(this.widith)
        .multiply(BigDecimal.valueOf(this.widith)).doubleValue();
  }
  
}
