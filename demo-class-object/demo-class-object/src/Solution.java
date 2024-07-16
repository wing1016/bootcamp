import java.util.Arrays;

class Solution {
    public String truncateSentence(String s, int k) {

        String[] arr = s.split(" ");
        s = "";
        System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < k; i++) {
            s += arr[i] + " ";
        }
        return s.trim();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
       System.out.println(s.truncateSentence("What is the solution to this problem", 4)); 
    }
}
