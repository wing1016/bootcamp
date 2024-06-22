import java.util.Arrays;

public class Test {


   public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

      Boolean bo = false;
      String w1 = "";
      String w2 = "";
      for (int i = 0; i < word1.length; i++) {
          w1 += word1[i];
          w2 += word2[i];

          System.out.println(word2[4]);
      }
      System.out.println(w1);
      System.out.println(w2);
      if (w1.equals(w2)) {
          bo = true;
      }

      return bo;
  }
   public static void main(String[] args) {
      Test t = new Test();
      System.out.println();
      System.out.println(t.arrayStringsAreEqual(new String[] {"a", "cb"},
            new String[] {"ab", "c"}));
   }

}



// public String removeTrailingZeros(String num) {

// for (int i = 0; num.contains("0")&& num.lastIndexOf("0") == num.length() - 1; i++) {

// if (num.contains("0") && num.lastIndexOf("0") == num.length() - 1) {

// num = num.substring(0, num.length() - 1);

// } else {
// break;
// }
// }
// // System.out.println(num);
// return num;
// }



// class Solution {
// public String removeTrailingZeros(String num) {
// int i = num.length() - 1;
// while (num.charAt(i) == '0') {
// i = i - 1;
// }
// // System.out.println(i);
// num = num.substring(0, i+1);
// return num;
// }
// }

// public String removeTrailingZeros(String num) {
// int last = num.length() - 1;
// int i = num.length() - 1;
// System.out.println(i);
// boolean b = num.charAt(i) == '0';
// System.out.println(b);
// while (num.charAt(i) == '0') {

// i = i - 1;
// System.out.println(i);

// }
// // System.out.println(i);
// num = num.substring(0, i+1);
// return num;
// }
