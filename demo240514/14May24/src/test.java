public class test{

  public static void main(String[] args) {
    int x = 3;
   // int y = (x++ + 3) * x++;
   int y = x++;

    System.out.println("y=" + y);
    System.out.println("x=" + x);
  }

}