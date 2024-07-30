import java.math.BigDecimal;

public class NumberBox<T extends Number> {    // we can extends or super here,( but !!! 99% using extends here )
  private T number;

  public NumberBox(T number) {
    this.number = number;
  }

  public static void main(String[] args) {
    NumberBox<Byte> byteBox = new NumberBox<>((byte) 1);  //int -> byte -> Byte

    //#sir version notes

    NumberBox<BigDecimal> bBox = new NumberBox<BigDecimal>(BigDecimal.valueOf(3.4));

  }
}
