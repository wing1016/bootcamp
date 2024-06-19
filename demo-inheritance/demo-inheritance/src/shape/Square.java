package shape;
// 19Jun24
import java.math.BigDecimal;
import javax.swing.SpinnerModel;

public class Square extends Shape {

  private double widith;

  public Square(double w) {
    this.widith = w;
  }

  @Override
  public double area() {

    return BigDecimal.valueOf(this.widith)
        .multiply(BigDecimal.valueOf(this.widith)).doubleValue();
  }

  
  public double area1( ) {

    return 2.0;
  }

  public void RockYou(){
    System.out.println("We will we will rock u ~!");
  }

  public static void main(String[] args) {
    Square sq = new Square(3.0);
    System.out.println(sq.area());
    sq.RockYou();
  }

}
