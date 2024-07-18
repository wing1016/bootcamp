import java.util.Arrays;

class Solution {

    public int countDigits(int num) {
        int l = String.valueOf(num).length();
       
        char[] chArr = Integer.toString(num).toCharArray();
        int count = 0;
        String temp = Integer.toString(num);
        int[] a = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            a[i] = temp.charAt(i) - '0';
        }

        for (int i = 0; i < a.length; i++) {
           
            if (a[i] == 0) {
                continue;
            }
            if ( num % a[i]  == 0) {
                count++;
            }
        }

        System.out.println(Arrays.toString(a));

        if (l == 1) {
            return 1;
        }
        return count;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countDigits(7));

    }
}
