
public class Test {

   public String removeTrailingZeros(String num) {
      int last = num.length() - 1;
      int i = num.length() - 1;
      System.out.println(i);
      boolean b = num.charAt(i) == '0';
      System.out.println(b);
      while (num.charAt(i) == '0') {

         i = i - 1;
         System.out.println(i);
       
      }
      // System.out.println(i);
      num = num.substring(0, i+1);
      return num;
   }

   public static void main(String[] args) {
      Test t = new Test();
      String s = t.removeTrailingZeros("51230100"); // 94353214300000000000000000000000000000000000000000000000000000 51230100
      System.out.println(s);
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




class Solution {
   public String removeTrailingZeros(String num) {     
   int i = num.length() - 1;  
   while (num.charAt(i) == '0') {
      i = i - 1;       
   }
   // System.out.println(i);
   num = num.substring(0, i+1);
   return num;
}
}