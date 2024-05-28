import java.lang.reflect.Array;
import java.util.Arrays;

public class DemoArray {

  public static void main(String[] args) {

    int[] arr = new int[3]; // array is an object
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
          r1 += c1[i]; // String value + char > output is string
        } else if (k == 2) {
          r1 += c2[i];
        }
        // System.out.println(i + "-" + r1);
      }
    }
    System.out.println("c1 : " + r1);
    // System.out.println(Arrays.toString(c1));
    // System.out.println(Arrays.toString(c1) + Arrays.toString(c2));


    char[] c3 = new char[] {'o', 'a', 'k', 'p', 'a', 'b'};
    char[] c4 = new char[] {'a', 'b', 'f', 't'};
    // result : obkta
    String r3 = "";

    int length = c3.length > c4.length ? c3.length : c4.length; // < Elegant

    for (int i = 0; i < length; i++) {
      if (i % 2 == 0 && i < c3.length) {
        r3 += c3[i];
      } else if (i % 2 == 1 && i < c4.length) {
        r3 += c4[i];
      }
      // if (r3.length()==5) {
      // break;
      // }
    }
    System.out.println(r3); // obkt

    // Array
    int[] arr5 = new int[] {4, 8, 3};
    int sum = 0;
    int count1 = 0;
    for (int i = 0; i < arr5.length; i++) {
      sum += arr5[i];
      count1++;
    }
    System.out.println("Average is " + sum / count1);

    // swapping in array
    int[] arr7 = new int[] {6, 10, -4, 15};
    // swap -4 and 6 -> {-4, 10, 6, 15}
    int temp = arr7[2];
    arr7[2] = arr7[0];
    arr7[0] = temp;

    System.out.println(Arrays.toString(arr7)); // [-4, 10, 6, 15]

    // Sorting -> [-4, 10, 6, 15]
    // for loop
    // nested loop


    // Level 1 : arr7 -> [-4, 6, 10, 15]
    // move -4 to the tail > [6, 10, 15, -4]
    int maxArr = Integer.MAX_VALUE;
    int tm;
    for (int i = 0; i < arr7.length - 1; i++) {

      tm = arr7[i];
      arr7[i] = arr7[i + 1];
      arr7[i + 1] = tm;

    }

    System.out.println(Arrays.toString(arr7));



    // int tmp;
    // int max1 = Integer.MIN_VALUE;
    // for (int i = 0; i < arr7.length; i++) {
    // if (isExist) {

    // }
    // }


    // move max to the last
    int[] arr8 = new int[] {10, 6, 15, -4};
    int max8 = Integer.MAX_VALUE;
    int tmp8;

    for (int i = 0; i < arr8.length - 1; i++) {
      if (arr8[i] > arr8[i + 1]) {
        // swap
        tmp8 = arr8[i];
        arr8[i] = arr8[i + 1];
        arr8[i + 1] = tmp8;
      }
    }
    System.out.println(Arrays.toString(arr8));

    // Level 3  : sort array from small to large
    for (int j = 0; j < arr8.length; j++) {

      for (int i = 0; i < arr8.length - 1; i++) {
        if (arr8[i] > arr8[i + 1]) {
          // swap
          tmp8 = arr8[i];
          arr8[i] = arr8[i + 1];
          arr8[i + 1] = tmp8;
        }
      }
    }
    System.out.println("Swap max to end");
    System.out.println(Arrays.toString(arr8));

    // Swap char value
    String s ="hello";  // swap e and o > holle
    String tmpChar ="";
    // convert to Char Array
    char[] arr9 = new char[s.length()];
    char t2 = ' ';

    arr9 = s.toCharArray();

    // for (int i = 0; i < s.length(); i++) {
    //   arr9[i] += s.charAt(i);      
    // }

    t2 = arr9[1];
    arr9[1] = arr9[4];
    arr9[4] = t2;

    
     s = String.valueOf(arr9);
    System.out.println(s);

  }
}
