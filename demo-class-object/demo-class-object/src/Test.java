
import java.util.List;
import java.util.Random;
import deck.Deck;

public class Test {

   static String S = "(al)G(al)()()G";

   public static String interpret(String command) {

      command = command.replace("()", "o");
      command = command.replace("(al)","al");
      System.out.println(command);
      return command;
  }

   public static void main(String[] args) {
      Test t = new Test();
      System.out.println(Test.interpret(S));
    

   }

}
