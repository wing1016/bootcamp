package shape;
// 19Jun24
public class MiniCircle extends Circle {

  public String color;

  // @Override
  // public double area(){
  //   return 2.0;
  // }
  

  public MiniCircle(double radius, String color){
   super(radius);
  }
  

  public static void main(String[] args) {
    //draw pic for below 
    MiniCircle mc = new MiniCircle(4.0d, "red");
    System.out.println(mc.getRadius());
    System.out.println(mc.area());
  }
}
