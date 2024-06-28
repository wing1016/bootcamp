//26Jun24

package markSix;

import java.util.Objects;

public class SmallBall extends Ball {
  private String color;

  // constructor

  public SmallBall() {

  }

  public SmallBall(int n, String c) {
    super(n);
    this.color = c;

  }

  public String getColor() {
    return this.color;
  }

  // toString, equals, hashcode

  @Override
  public String toString() {
    return "color : " + this.color + " number : " + super.toString();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof SmallBall))
      return false;
    SmallBall smallBall = (SmallBall) obj;
    // return Objects.equals(color, smallBall.color) && Objects.equals(super.getNumber(), smallBall.getNumber());
    // or
    return Objects.equals(color, smallBall.getColor())
        && Objects.equals(this.getNumber(), smallBall.getNumber());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.color, super.getNumber());
  }

  public static void main(String[] args) {
    SmallBall sb = new SmallBall(4, "Red");
    SmallBall sb2 = new SmallBall(4, "Red");
    SmallBall sb3 = new SmallBall(6, "SuperSuperRed");

    System.out.println(sb.equals(sb2));
    System.out.println(sb.equals(sb3));

    System.out.println(sb.hashCode());
    System.out.println(sb2.hashCode());
    System.out.println(sb3.hashCode());

    System.out.println(sb.toString());
  }

}
