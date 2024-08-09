import java.util.function.Function;

public class StringLength implements Function<String, Integer> {


  // sir #sir
  @Override
  public Integer apply(String s) {
    return s.length();
  }
}
