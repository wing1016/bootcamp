import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

class Solution {

    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] arr = new int[2];
        int l = grid.length * grid.length;
 
        Integer[] oneDArray = new Integer[l];

        // Flatten 2D array to 1D array...
        int s = 0;
        for (int i = 0; i < grid.length; i++)
            for (int j = 0; j < grid.length; j++) {
                oneDArray[s] = grid[i][j];
                s++;
            }

        Arrays.sort(oneDArray);
         System.out.println(oneDArray.length);
        for (int i = 1; i < oneDArray.length; i++) {
            System.out.println( oneDArray[i] + " !! " + oneDArray[i - 1] );
            if (oneDArray[i].equals(oneDArray[i - 1])) {
                arr[0] = oneDArray[i];
            }
  
        }

        List<Integer> mySet = new ArrayList<>(Arrays.asList(oneDArray));
        
        // String sArr = Arrays.toString(oneDArray);
        // System.out.println(sArr);
        // System.out.println(mySet);
        System.out.println(mySet.size());
        for (int i = 1; i < mySet.size()+1; i++) {
            // System.out.println(mySet.contains(i));
            if ( !mySet.contains(i)) {
                arr[1] = i;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.findMissingAndRepeatedValues(
                new int[][] {{478,635,207,394,307,601,87,237,177,477,217,326,170,526,251,488,480,79,342,243,137,433,514,80,597,218},{430,34,213,146,233,607,413,419,385,662,121,32,412,98,150,206,23,618,549,133,297,542,575,302,230,154},{471,552,446,257,12,465,638,283,615,513,5,76,674,238,29,6,274,165,143,651,327,160,404,580,529,61},{37,157,54,463,497,591,269,530,17,498,435,384,339,536,541,423,129,410,60,153,58,69,147,144,132,428},{582,74,138,315,277,565,491,201,21,71,122,241,605,358,123,253,348,271,621,72,364,104,595,227,330,187},{288,216,111,31,195,270,483,334,393,264,553,332,221,25,356,661,313,449,656,45,495,81,198,252,265,336},{314,447,550,540,3,83,28,36,557,632,560,2,260,169,492,429,443,259,130,472,86,534,273,301,411,317},{255,300,43,496,73,452,298,442,469,667,8,70,194,268,371,77,669,528,611,175,349,234,479,407,117,610},{665,13,85,267,337,275,4,559,183,613,261,90,26,448,663,235,100,316,152,666,439,20,56,197,426,493},{502,637,390,457,322,456,485,416,535,290,88,386,424,503,563,451,171,643,293,15,354,624,544,304,162,675},{425,244,50,366,329,484,396,318,289,574,626,281,232,134,593,35,377,382,7,398,62,630,279,319,116,415},{19,482,470,579,263,603,438,161,617,63,408,200,468,668,367,38,155,619,521,444,186,53,374,286,576,52},{191,164,658,583,628,344,653,467,113,214,14,266,586,176,27,507,670,642,489,18,450,518,324,92,310,10},{66,546,328,179,357,159,564,657,520,434,172,65,335,436,148,373,641,639,431,511,355,97,634,156,223,305},{459,616,49,33,571,192,225,508,202,16,422,476,395,285,115,320,178,291,184,379,360,512,464,361,474,555},{24,381,370,453,149,141,650,590,68,645,276,142,105,126,585,350,278,623,22,620,299,287,558,196,375,589},{11,458,573,372,460,254,644,625,125,106,84,400,247,119,118,570,455,341,481,311,272,166,556,135,242,402},{323,203,108,383,646,303,378,554,44,91,608,475,368,82,499,523,220,501,204,506,627,654,494,306,647,569},{660,362,47,107,136,599,531,462,445,224,51,584,578,59,592,182,120,209,461,40,519,168,600,208,581,93},{347,622,351,321,222,655,210,9,246,672,539,110,151,124,522,409,524,510,140,505,612,376,548,596,572,294},{75,614,226,173,527,369,258,199,466,167,359,67,109,487,64,598,515,421,331,401,96,631,312,397,236,389},{248,262,112,525,131,343,211,352,427,391,212,420,239,388,48,46,437,490,562,346,568,240,649,89,41,473},{403,158,249,363,418,517,566,127,190,405,659,671,676,538,1,594,139,180,325,547,652,602,345,440,99,42},{551,640,282,533,295,128,228,308,94,103,399,205,609,114,516,189,673,30,365,174,181,387,296,406,587,340},{629,486,333,284,231,633,338,432,441,309,414,537,250,57,256,353,145,185,215,606,545,188,636,543,55,245},{504,193,561,532,95,454,380,417,39,292,500,648,577,78,604,531,163,588,102,219,392,101,229,280,509,664}})));

    }
}



/*
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

