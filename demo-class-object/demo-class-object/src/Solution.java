import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class Solution {

    public List<String> commonChars(String[] words) {
 
        List<String> ls = new ArrayList<>();
        int exist = 0;
        for (int i = 0; i < words[0].length(); i++) { // 0 1 2 3
            for (int j = 0; j < words.length; j++) { // 0 1 2
                if (words[j].indexOf(words[0].charAt(i)) != -1) {
                    exist++;
                }
            }
            if (exist == words.length) {
                // ls.add(words[0].charAt(i), null);
                System.out.println(words[0].charAt(i));
                ls.add(String.valueOf(words[0].charAt(i)));
            }
            exist = 0;
        }
        return ls;
    }

    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out
                .println(s.commonChars(new String[] {"cool", "lock", "cook"}));
    }
}

// "bella","label","roller"
// "cool", "lock", "cook"
