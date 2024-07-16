public class PrimitiveDemo {
  public static void main(String[] args) throws Exception {
      System.out.println("Hello, World!");
      int x = 10; // x -> not a object reference , x is an variable , right side 10 -> int value
      //compiler check if 10 can be assigned to x

      long l = x; //long range is wider than int type ( upcast ) 
     short s =(short)x; // short is narrower then int type ( downcast ) 
     // compiler is not concert the value assigned to x during compile time
     // instead , it concerns the range of type only

     //ascii
     int y = 100;
     char c = (char) y; //int is wider than char , so error comes , so need to (char)
     int z = c;

     //Primitive default value
     long l2 =0L; // Declaration
     System.out.println(l2);  // you cannot use a variable without initialization

     long l3 = 7L;
     float f = 0.3f; // we need to use after the 0.3, because 0.3 is a double value by default
     byte b = 9;  //Java still allow int value assigned to type byte and short 
     double d2 = 9.3d;  // 9.3 is also ok ( usually use lower case 'd' )
  }
}


