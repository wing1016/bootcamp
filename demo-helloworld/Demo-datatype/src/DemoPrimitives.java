public class DemoPrimitives {

  public static void main(String[] args){
    //shift ctrl P > create java project > no build tools
    // numbers / string (test)
    // numbers (integers/decimal)
    //int ->integer
    //int x = 3.5;
    int x = 3;
    int z = -9;
    int total = x + z; //-6
    System.out.println(total);
    // + - * /
    int tryTotal = x * z - z / z;
    int tryTotal2 = x * z - z / (x+z);
    int tryTotal3 = 32 / 3;
    System.out.println(tryTotal);
    System.out.println(tryTotal3);
    // 10May24
    double d1 = 10.3;
    double d2 = 3.1415; double d3 = -3.14;
    double result2 = d1 + d2 - d3;
    System.out.println(result2); // double +-*% will have issue
                                // result > 16.581500000000002

    int f1 = 7;
    double f2 = 8.8;
    int f3 = f1 + f2; //Type mismatch: cannot convert from double to int
        // int + double > double(7.0) + double(8.8) ->double
        // double can't be stored in "int"
        // double higher grade than int

      //Primitive: char 
      char c1 = '!'; // single quote. double for String
      char c2 = ' ';
      //char c3 = ''; // char must contain 1 character
      //char c4 = 'aa'; // cannot asign 2 char in char


      // Primitive: boolean -> true / false
      boolean b1= true;
      boolean b2= false;
     // boolean b3= TRUE;  cannot be capital letter
   //   boolean b3= FALSE;
        
        //Primitive for interger
        // int, long, byte, short
        //byte can be only from -128 to 127
        byte by1 = 126;
     //   byte by2 = 129;  < wrong

     short s1 = 32678;
     int i1 = -2147483648;

     long lo = -9223337203854664L; // -9223337203854664 ->int
     // L means a way to specify this value is a long value

    //local variable, within the 'main'block
    // Primitives for number with decimal 
    // 10.2 is a double
    // cannot asign a double value to float . double higher level than float
      double d10 = 10.2;
      float f10 = 10.2f; //f mean float value  

      float result11 = 10.2f + 10.2; // float + double -> double,
      //cannot asign double to float

      double d12; //variable declaration
      d12 = 12.2; //value assignment

      double d13 = 13.13; //declaration & assignment
            d13 = 19.2; // re-assignment


      } 
}