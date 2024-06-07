public class Test {


   public static void main(String[] args) {

      String s1 = "abcde";
      char[] arr1 = s1.toCharArray();

      for (int i = 0; i < arr1.length; i++) {
         System.out.println(arr1[i]);
      }

      System.out.println(s1.indexOf('b'));
      // System.out.println(Math.abs(1-4));

      String[] arr = new String[]{"--X","X++","X++"};
      System.out.println(finalValueAfterOperations(arr));

   }

   //["--X","X++","X++"]
//   public class Solution {
      public static int finalValueAfterOperations(String[] operations) {

         int result = 0;
         int x = 0;
         String s = "";
         for (int i = 0; i < operations.length; i++) {
          s = operations[i];
          System.out.println(s);
          if (s.equals("--X")) {
            --x;
            continue;
          }
          if (s.equals("X--")) {
            x--;
            continue;
          }
          if (s.equals("++X")) {
            ++x;
            continue;
          }
          if (s.equals("X++")) {
            x++;
            continue;
          }
         

         }

         return x;

      }
   // }
}
