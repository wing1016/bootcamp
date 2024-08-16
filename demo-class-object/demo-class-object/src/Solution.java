import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public boolean strongPasswordCheckerII(String password) {
        boolean lo = false;
        boolean up = false;
        boolean di = false;
        boolean sc = false;
        boolean adj = false;
        Integer inte;
        if (password.length() < 8) {
            return false;
        }
        for (int i = 0; i < password.length(); i++) {
            inte = Integer.valueOf(password.charAt(i));

            if (inte > 96 && inte < 123) {
                lo = true;
            }
            if (inte > 64 && inte < 91) {
                up = true;
            }
            if (inte > 47 && inte < 58) {
                di = true;
            }
            if (inte == 33 || (inte > 34 && inte < 39) || inte == 64
                    || inte == 94 || (inte > 39 && inte < 46) || inte == 94) {
                sc = true;
            }
            if (i != password.length()-1) {
                if (password.charAt(i) == password.charAt(i+1)) {
                    adj = true;
                }                
            }

            System.out.println(Integer.valueOf(password.charAt(i)));
        }
        System.out.println(lo + "" + up + di + sc);
        if (lo == true && up == true && di == true && sc == true && adj == false) {
            return true;
        }

        return false;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.strongPasswordCheckerII("1!*wWW!@#$%"));

    }
}



/*
 * "2019-01-09" "2019-02-10"
 * 
 * public int distanceTraveled(int numBottles, int additionalTank) { int d = 0; while (numBottles > 0) { System.out.println(d + "  " + numBottles + "  " + additionalTank); if (numBottles >= 5) { d = d
 * + 5 * 10; numBottles -= 5; if (additionalTank >= 1) { additionalTank -= 1; numBottles += 1; } System.out.println(d + "  " + numBottles + "  " + additionalTank); } System.out.println(d + "  " +
 * numBottles + "  " + additionalTank); if (numBottles < 5) { d = d + numBottles * 10; numBottles = numBottles - numBottles; }
 * 
 * System.out.println(d + "  " + numBottles + "  " + additionalTank);
 * 
 * 
 * }
 * 
 * return d; }
 * 
 * 
 * 
 */

/*
 * 
 * public int pivotIndex(int[] nums) { int left = 0; int ttl = 0;
 * 
 * for (int i = 0; i < nums.length; i++) { ttl += nums[i]; } System.out.println(ttl);
 * 
 * for (int k = 0; k < nums.length; k++) { ttl = ttl - nums[k]; if (left == ttl) { return k; } left += nums[k]; }
 * 
 * return -1; }
 * 
 * public static void main(String[] args) { Solution s = new Solution(); System.out.println(s.pivotIndex(new int[] {1, 7, 3, 6, 5, 6}));
 * 
 * 
 * }
 */

/*
 * public int pivotIndex(int[] nums) { int left = 0; int right = 0; for (int i = 0; i < nums.length; i++) { // 0 1 (2) 3 4 5 for (int j = 0; j <= i; j++) { //0 1 left += nums[j]; //
 * System.out.println("i : " + i + " j : " + j); } for (int k = i ; k < nums.length; k++) { // 3 4 5 // System.out.println(k); right += nums[k]; // System.out.println("i : " + i + " k : " + k); } if
 * (left == right) { return i; } System.out.println("left : " + left); System.out.println("right : " + right); left = 0; right = 0; } return -1; }
 */

/*
 * 
 * 
 * 
 * public int countPrimes(int n) { int cnt = 0; for (int i = 1; i < n; i++) { // 1 2 3 4 5 6 7 8 9 10 int a = i/2+1; for (int j = 2; j <= i; j++) { // System.out.println("i : " + i + " j : " + j +
 * " cnt : " + cnt); if (i % j == 0 && i != j) { break; } if (j == a) { // System.out.println(i); cnt++; break; } } } return cnt; }
 * 
 * public static void main(String[] args) { Solution s = new Solution();
 * 
 * System.out.println(s.countPrimes(499979));
 * 
 * 
 * 
 */

/*
 * 2-0
 * 
 * 2 3 5 7 11 13 17 19 23 2 3 5 7 9 11 13 15 17 19 21 23 25 27
 * 
 */
// 18 -- 2, 3, 5, 7, 11, 13, 17
//
// 17 6 ! 27 9 ! 18 7 ! 57 16
//
// 2 3 5 7
// { 2,3,4,0 } 29 23 7 17 19 False
//

// "bella","label","roller"
// "cool", "lock", "cook"
// "dadaabaa","bdaaabcc","abccddbb","bbaacdba","ababbbab","ccddbbba","bbdabbda","bdabaacb"
// "bbddabab","cbcddbdd","bbcadcab","dabcacad","cddcacbc","ccbdbcba","cbddaccc","accdcdbb"

// public int missingNumber(int[] nums) {
// // int[] arr = new int[nums.length + 1]
// String s = Arrays.toString(nums);
// System.out.println(s);
// System.out.println(nums.length);
// System.out.println(s.length());
// StringBuilder sb = new StringBuilder();
// sb.append(nums);
// String res = sb.toString();

// for (int i = 0; i < s.length(); i++) {
// System.out.println(s.indexOf(String.valueOf(i)) + " ! " +
// (s.indexOf(String.valueOf(i)) >=0) + " ^ " + i);
// if (s.indexOf(String.valueOf(i)) < 0) {
// return i;
// }
// }
// return 999;
// }

// public List<String> commonChars(String[] words) {
// List<String> result = new ArrayList<>();

// for (char c = 'a'; c <= 'z'; c++) {

// int minCount = Integer.MAX_VALUE;

// for (String word : words) {
// int count = 0;

// for (char ch : word.toCharArray()) {
// if (ch == c) {
// count++;
// }
// }

// minCount = Math.min(minCount, count);

// if (minCount == 0) {
// break;
// }
// }

// for (int i = 0; i < minCount; i++) {
// result.add(String.valueOf(c));
// }
// }

// return result;
// }

