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
    
    // *=
      int p = 4;
      p = p * 2; //8
      p *=2; //16
      p /= 4; //4 . p = 16 / 4.
      System.out.println("p=" + p);

      int z = 10;
      z = z % 3; //1
      int j = 10;
      j %= 3 ;
      System.out.println("z=" + z +", j=" + j);

      String s = "Hello";
      s = s + "world";
      s += "!!!";
      System.out.println("s=" + s);

      // >, <, >=, <=
    boolean r1 = 10 > 3;
    boolean r3 = 10 >=10;
    System.out.println(r1);
    System.out.println(r3);

    // and (&&), or (!!) (||)
    boolean r5 = 10 > 3 && 20 >=20; // true & true => true
    boolean r6 = 10 > 3 && 4 < 4; // true & false => false
    System.out.println(r5); System.out.println(r6);

    boolean r7 = 10 > 3 && 20 >= 20; // true or true => true 
    boolean r8 = 10 > 3 && 20 < 18; // true or false => true
    boolean r9 = 3 > 10 && 20 < 19; //false or false => false

    char c10 = 'A';
    char c11 = 'B';
    boolean b12 = c10 ==c11; // false  係咪等如
    System.out.println("b12=" + b12);

    boolean b13 = 'c' != '0'; // true , 係咪唔等如 !=
    System.out.println("b13=" + b13);


    int n =3;
    int resultn = n++ * 3; 
    //original n multiply 3 first , then assign 9 to resultn , then n=n+1

    System.out.println(resultn);//9
    System.out.println(n);//4

    int m =3;
    int resultm = ++m * 5;
    //m = m + 1 first, multiply 5, assign 25 to resultm
    System.out.println(resultm); //25
    System.out.println(m);//5


    int k =4;
    int resultk = k++ * 7 * ++k;
    // 168 = (4 * 7) * 6
    System.out.println(resultm); 
    System.out.println(m);



  }

}