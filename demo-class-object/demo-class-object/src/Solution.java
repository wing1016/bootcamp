import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution {

    public int[] decompressRLElist(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int fre;
        int val;
        // ArrayList<Integer> integers2 = new ArrayList<Integer>();
        // List<Integer> markSix = new LinkedList<>();
        for (int i = 0; i < nums.length; i += 2) {
            fre = nums[i];
            val = nums[i + 1];
            for (int j = 0; j < fre; j++) {
                arr.add(val);
            }
            fre = 0;
            val = 0;
        }
        int l = arr.size();
        int[] tmp = new int[l];
        for (int i = 0; i < l; i++) {
           tmp[i] = arr.get(i); 
        }
        System.out.println(arr);
        return tmp;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.decompressRLElist(new int[] {1, 2, 3, 4}));
    }
}
