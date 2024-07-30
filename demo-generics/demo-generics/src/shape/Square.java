package shape;

public class Square extends Shape {
  private double length;

  public Square(double l){
    this.length = l;
  }

  @Override
  public double area(){
    return Math.pow(this.length, 2);  // #sir 
  }
}
