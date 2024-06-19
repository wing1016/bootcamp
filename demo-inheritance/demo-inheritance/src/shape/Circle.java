package shape;

import java.math.BigDecimal;
// 19Jun24

// Shape is a class containing area() abstract method

//public final class Circle extends Shape {   << final class cant be extend  
public class Circle extends Shape {       // why we need extends keyword

  private double radius; // no need to define 直徑, can calculate by 2 radius

  public Circle(double r){
    this.radius = r;
  }

  public double getRadius(){
    return this.radius;
  }

  //normal class cannot create abstract method
  // public abstract void smile(){
  // }  

  //1. the parent class has the same method
  //2. compile would check if th parent class really has the same method
  @Override 
  public double area() {    // public FINAL double area() {  
    //final method cant be override in child class
    // return this.radius * this.radius * Math.PI; // << not good , need BigDecimal
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius))
        .multiply(BigDecimal.valueOf(Math.PI)).doubleValue();

  }

  @Override
  public void sleep(){      // @override checked parent has no method call "sleep"
    System.out.println("Circle is sleeping...zzZZ");
  }

  // trying calculate area in static method
  public static double circleArea(double r){
    return r * r * Math.PI;
  }


  public static void main(String[] args) {
    Circle cc = new Circle(3.0);
    System.out.println(cc.area());    //28.27...

    System.out.println(Shape.circleAreaV(3.0));
  }

}
