import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

    public String[] uncommonFromSentences(String s1, String s2) {
        String s = String.join(" ", s2, s1);
        List<String> arr = new ArrayList<>();
        List<String> arr2 = new ArrayList<>();
        String[] sArr;
        arr = Arrays.asList(s.split(" "));
        // arr.addAll(Arrays.asList(s2.split(" ")));

        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            // System.out.println(arr.get(i));
          //  System.out.println(arr.lastIndexOf(arr.get(i)) == arr.indexOf(arr.get(i)));
                    if ( arr.lastIndexOf(arr.get(i)) == arr.indexOf(arr.get(i))) {
                        arr2.add(arr.get(i));
                    }
        }
        System.out.println(arr2);
        sArr = new String[arr2.size()];
        arr2.toArray(sArr);
        System.out.println(Arrays.toString(sArr));
        return sArr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();


        System.out.println(s.uncommonFromSentences("sweet",
                "sweetb"));

    }
}



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
// System.out.println(s.indexOf(String.valueOf(i)) + " ! " + (s.indexOf(String.valueOf(i)) >=0) + " ^ " + i);
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
