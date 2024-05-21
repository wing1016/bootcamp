public class DemoNestedLoop {
  public static void main(String[] args) {
    // for (int i = 0; i < 4; i++) { // < can miss a open {

    // for (int j = 0; j < 2; j++) {

    // System.out.println("hello " + "i=" + i + ",j=" + j);

    // }

    // }


    for (int i = 0; i < 4; i++) {
      if (i % 2 == 0) {
        continue;
      }
      for (int j = 0; j < 2; j++) {
        if (j % 2 == 1) {
          continue;
        }
        System.out.println("hello " + "i=" + i + ",j=" + j);

      }
    }



    // for (int i = 0; i < 4; i++) {

    // for (int j = 0; j < 2; j++) {
    // if (i % 2 != 0 && j % 2 == 0) {
    // System.out.println("hello " + "i=" + i + ",j=" + j);
    // }

    // }
    // }


    // question
    // 1 - 20
    // 1 3 5 7 9 12 14 16 18 20 < need to print this from between 1 - 20



    for (int i = 1; i < 21; i++) {
      if (i % 2 == 1 && i < 10) {
        System.out.print(i + " ");
      } else if (i % 2 == 0 && i > 10) {
        System.out.print(i + " ");
      }
    }

    System.out.println("");

    // searching
    // Find the index of first character 'a' answer is 14
    String s = "Vincent Book Game Laptop";
    char ch;
    for (int i = 0; i < s.length(); i++) {
      ch = s.charAt(i);
      if (ch == 'a') {
        System.out.println("index of first 'a' is " + i);
        break; // break is for exit Loop, not If
      }
      // System.out.println(ch);
      // System.out.println("index of first a is" + i);
    }

    // System.out.println(s.charAt(14));
    // System.out.println(s.length());

  }

}
