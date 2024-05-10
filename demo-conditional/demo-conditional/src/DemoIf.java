public class DemoIf{
    public static void main(String[] args) {
      
      //conditinal : if

      int x = 3;
      if (x >=3){ //code block
        System.out.println("x >=3");


      }

      int y = 4;
      if (y >= 3) {
        System.out.println("y >= 3");
      } else {
        System.out.println("y < 3");
      }

      int a = 10000;
      int b = 100;
   //   boolean res = a > b;
      if (a > b) {
        System.out.println("max = " + a);
      } else {
        System.out.println("max. = " + b);
      }
    //  System.out.println(res);
      // print max = 10
    }
}