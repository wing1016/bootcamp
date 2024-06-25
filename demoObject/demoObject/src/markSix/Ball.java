package markSix;

public class Ball {
  private int number;


  public int getNumber(){
    return this.number;
  }

  // byte is not good because
  //
  public static void main(String[] args) {
    byte b1 = 48; // java ( special conversion: int -> byte, but without casting in downcast )
    int i1 = 48;
    byte b2 = (byte) i1; // i1 type is int, we have to convert the value by (cast)



  }
}
