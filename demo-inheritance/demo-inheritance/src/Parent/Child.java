package Parent;

import java.security.PublicKey;
import javax.swing.plaf.metal.MetalBorders.PopupMenuBorder;

public class Child extends Father {


  public Child() {

  }

  // implicitly empty constructor
  public Child(String n) {
    // super();
    super(n);
  }

  public static void main(String[] args) {
    Child c = new Child();
    Father f = new Father();
    Father f2 = new Child("Wing");
    Child c1 = new Father(); // Type mismatch: cannot convert from Father to Child

    int x = 1; // x -> int object reference type, 1 -> primitive int value ****

  }
}
