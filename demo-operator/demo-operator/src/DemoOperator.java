public class DemoOperator{

  public static void main(String[] args) {
    
    int x =3;

    x = x + 1;  //4
    System.out.println("x=" + x);

    x++; //5
    System.out.println("x=" + x);

    x += 1; // same as x = x+1;
    System.out.println("x=" + x);

    x += 2; // same as x = x+2;
    System.out.println("x=" + x);

    ++x; //same as x = x+1
    System.out.println("x=" + x);
  
    int y = 4;
    
    y = y - 1;
    System.out.println("y=" + y);
    y--;
    System.out.println("y=" + y);
    --y;
    System.out.println("y=" + y);
    y-=1;
    System.out.println("y=" + y);
    
  
  }

}