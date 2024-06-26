package markSix;

import java.util.Arrays;
import java.util.Objects;
import java.util.SortedMap;

public class Ball {
  private int number;


  public int getNumber() {
    return this.number;
  }

  public Ball(){

  }

  public Ball(int n){
    this.number = n;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Ball))
      return false;

    Ball ball = (Ball) obj;

    return Objects.equals(number, ball.getNumber());
  }

  @Override
  public String toString(){
    return " ball number : " + this.number;
  }

  // byte is not good because
  //
  public static void main(String[] args) {
    byte b1 = 48; // java ( special conversion: int -> byte, but without casting in downcast )
    int i1 = 48;
    byte b2 = (byte) i1; // i1 type is int, we have to convert the value by (cast)

    Ball b3 = new Ball();
   

    int[] arr = new int[3];
System.out.println(Arrays.toString(arr));

    int[] arr2 = new int[3];
    System.out.println(Arrays.toString(arr2));
    System.out.println(arr.equals(arr2));  //(false) equals method of int is not yet override
    System.out.println(Arrays.equals(arr, arr2)); // (true)

    Object bb = new Ball(48);
   // bb.getNumber(); // Oject dont have getNumber method

   System.out.println( bb.getClass());  // > class markSix.Ball

   Class<?> clazz = bb.getClass();
    System.out.println(clazz);    //class markSix.Ball

    System.out.println(bb instanceof Ball);

  }
}
