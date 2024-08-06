import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoArrayException {
  public static void main(String[] args) {
    int[] arr = new int[5];
    arr[0] = 1;
    arr[1] = 1;
    arr[2] = 1;
    arr[3] = 1;
    arr[4] = 1;
    // arr[5] = 1; // ArrayIndexOutOfBoundsException
    // arr[7] = 1;

    int idx = 0;
    if (idx >= 0 && idx < arr.length) {
      arr[idx] = 10;
    }

    try {
      arr[5] = 1;
    } catch (Exception e) {
      // TODO: handle exception
    }
    System.out.println("End of program");

    String str = "Hello";
    str.charAt(1);
    str.charAt(str.length() - 1); // java.lang.String.charAt(String.java:1517)
    // String is an char array
    // str.substring(0, 6); // java.base/java.lang.String.checkBoundsBeginEnd

    int result;
    try {

      result = Integer.parseInt("hello"); // string to int
      // java.base/java.lang.NumberFormatException
      System.out.println(result);
    } catch (NumberFormatException e) {
      result = -1;
      System.out.println("NumberFormatException : " + e.getMessage());
    }
    System.out.println(result);

    try {
      System.out.println(getDescription(-18));
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    List<String> strings = new ArrayList<>();   // List - resize when list call get.
    strings.get(0); //<<
  
    List<String> strings2 = new LinkedList<>();   // List - resize when list call get.
    strings2.get(0);    //<< 
  }

  public static String getDescription(int age) {
    if (age < 0) {
      throw new IllegalArgumentException("age should not be negative");
    }
    if (age > 66) {
      return "Elderly";
    } else if (age >= 18) {
      return "Audult";
    }
    return "Children";
  }


}
