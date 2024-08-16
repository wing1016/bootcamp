public class DemoSwitchExpression {

  public static enum Color {
    RED, BLACK, YELLOW;
  }

  public static void main(String[] args) {
    Color color = Color.BLACK;
    switch (color) {
      case RED:
        System.out.println("RED");
        break;
      case BLACK:
        System.out.println("Black");
        break;
      case YELLOW:
        System.out.println("Black");
        break;

    }

    // Swtich Expression -> return something
    // 1. return something
    // 2. check if all possible enum value is handled
    // 3. no break, because it is for return value
    String result = switch (color) {
      case RED -> "RED";    // no need to break, like return
    //  case BLACK -> "BLACK"; // no need to break
    case BLACK, YELLOW -> "BLACK or YELLOW"; 

    };

    System.out.println(result);

    //yield
    // for Lambda expression , block more than 1 line , to use "yield"
    // "yield" like "return"
    String result2 = switch (color){
      case RED -> {
        int x = 3;
        if (x >=3) {
          yield "red";
        } else {
          yield "RED !!!";
        }
      }
      case BLACK, YELLOW -> "BLACK or YELLOW";
    } 

  }
}
