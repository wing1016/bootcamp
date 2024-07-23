import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Solution {

        public List<String> splitWordsBySeparator(List<String> words,
                char separator) {
            ArrayList<String> al = new ArrayList<>();
            String s = "\\" + separator;
            System.out.println(s);
            List<String> wordList = new ArrayList<>();
            // String[] sArr =
            for (int i = 0; i < words.size(); i++) {
                // System.out.println(Arrays.toString(words.get(i).split(".")));
                // Arrays.asList(words.get(i).split("\\.")).get(1);
                System.out.println(Arrays.toString(words.get(i).split(s)));
                System.out.println(words.get(i).split(s).length);
                for (int j = 0; j < words.get(i).split(s).length; j++) {
                    if (words.get(i).split(s)[j] != "") {
                        wordList.add(words.get(i).split(s)[j]);
                    }
                }
            }

            return wordList;
        }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("$easy$","$problem$");
        Solution s = new Solution();

        System.out.println(s.splitWordsBySeparator(list, '$'));

        // String str = "how.to.split.a.string.in.java";
        // String[] arrOfStr = str.split("\\.");
        // System.out.println( Arrays.toString(arrOfStr) );

    }
}
