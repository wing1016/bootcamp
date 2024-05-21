import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArray {

  public static void main(String[] args) {

    int[] arr = new int[3];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = -3;
    System.out.println(arr[1]);

    // run time exception
    // arr[4] = 200; // Index 4 out of bounds for length 3

    // complie time exception
    // arr[3] = "abc"; //int array cant store string

    int[] arr2 = new int[] {10, 20, -3};
    System.out.println(arr2[0]);
    System.out.println(arr2[1]);
    System.out.println(arr2[2]);

    // String array > hello , abc , xyz
    // print all 3 values;

    String[] arr3 = new String[] {"hello", "abc", "xyz"};
    System.out.println(arr3[0]);
    System.out.println(arr3[1]);
    System.out.println(arr3[2]);

    System.out.println(Arrays.toString(arr3));

    boolean[] arrBoo = new boolean[] {true, false};


    // Arrays
    System.out.println(Arrays.toString(arr3));

    System.out.println(Arrays.toString(arrBoo));

    // System.out.println(Arrays.toString(array));

    // 9, -3, -100, 90, 66, -4
    // for loop print out all
    int[] arr6 = new int[] {9, -3, -100, 90, 66, -4};
    for (int i = 0; i < arr6.length; i++) {
      // for (int i = 0; i < 6; i++) {
      // System.out.println(arr6[1]);
      System.out.println(arr6[i]);
    }
    // int max = Integer.MIN_VALUE;// < remember
    int max = arr6[0];
    // System.out.println(max);
    for (int i = 0; i < arr6.length; i++) {
      // for (int i = 0; arr6.length; i++) { << wrong wrong ,missing " i <"
      if (arr6[i] > max) {
        max = arr6[i];
      }
    }
    System.out.println("max = " + max);



    // int min = Integer.MAX_VALUE;// < remember
    int min = arr6[0];
    // System.out.println(min);
    for (int i = 0; i < arr6.length; i++) {
      if (arr6[i] < min) {
        min = arr6[i];
      }
    }
    System.out.println("min = " + min);

    // 1 count number of e
    // 2 if 'r' exist
    // 3 String result to store "qreel"
    char[] arrChar = new char[] {'l', 'e', 'e', 'r', 'q'};

    int count = 0;
    for (int i = 0; i < arrChar.length; i++) {
      if (arrChar[i] == 'e') {
        count += 1;
      }
    }
    System.out.println("number of 'e' is " + count);

    boolean isExist = false;
    for (int i = 0; i < arrChar.length; i++) {
      if (arrChar[i] == 'r') {
        isExist = true;
        break;
      }
    }
    System.out.println("Does 'r' exist? : " + isExist);

    // String result[] = new String[];
    String result = "";
    for (int i = arrChar.length - 1; i >= 0; i--) {
      result += arrChar[i];
    }
    System.out.println("reversed array : " + result);


    // 4 Given 2 char array, result > append all characters to a String value
    char[] c1 = new char[] {'o', 'a', 'k', 'p'};
    char[] c2 = new char[] {'a', 'b', 'f', 't'};
    // 4a result > "oakpabft"
    // 4b even index get c1, odd index get c2 .result "obkt"
    String r1 = "";
    String r2 = "";

    for (int k = 1; k < 3; k++) {
      for (int i = 0; i < 4; i++) {

        if (k == 1) {
          r1 += c1[i];
        } else if (k == 2) {
          r1 += c2[i];
        }
        // System.out.println(i + "-" + r1);
      }
    }
    System.out.println("c1 : " + r1);
    // System.out.println(Arrays.toString(c1));
    // System.out.println(Arrays.toString(c1) + Arrays.toString(c2));

    String r3 = "";
    for (int i = 0; i < 4; i++) {
      if (i % 2 == 0) {
        r3 += c1[i];
      } else {
        r3 += c2[i];
      }
    }
    System.out.println(r3);

  }
}
