import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution {

    public String[] sortPeople(String[] names, int[] heights) {
        String[] res = new String[names.length];
        HashMap<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            hm.put(heights[i], names[i]);
        }
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        int index = 0;
        Arrays.sort(heights);
        System.out.println(Arrays.toString(heights));
        for (int i = heights.length - 1; i >= 0; i--) {
            System.out.println(i + " ! " + index);
            res[index++] = hm.get(heights[i]);
        }
        System.out.println(Arrays.toString(res));
        return res;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.sortPeople(new String[] {"Mary", "John", "Emma"},
                new int[] {180, 165, 170}));
    }
}

