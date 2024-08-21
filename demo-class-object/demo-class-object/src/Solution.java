import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution {

    public String restoreString(String s, int[] indices) {  
        int l = s.length();
        // String str = "";
        char[] cArr = new char[l];
 
        for (int i = 0; i < l; i++) {
            cArr[indices[i]] = s.charAt(i);
        }
        System.out.println(cArr);
        
        return String.valueOf(cArr);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.restoreString("codeleet",
                new int[] {4, 5, 6, 7, 0, 2, 1, 3}));

    }
}

