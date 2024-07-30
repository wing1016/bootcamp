package shape;

public class Circle extends Shape {
  private double radius;

  public Circle(double r){
    super();  
    this.radius = r;
  }

  public static void main(String[] args) {
  }

  @Override
 public  double area() {
    return this.radius * this.radius * Math.PI;
 
  }
  
}
