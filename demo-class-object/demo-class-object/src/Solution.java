import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

class Solution {

    public int[][] flipAndInvertImage(int[][] image) {
        int[][] newArr = new int[image.length][image[0].length];
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 0) {
                    newArr[i][j] = 1;
                } else {
                    newArr[i][j] = 0;
                }
            }
        }
        System.out.println(Arrays.deepToString(newArr));
        int t;
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length / 2; j++) {
                t = newArr[i][j];
                newArr[i][j] = newArr[i][(newArr[i].length - 1) - j];
                newArr[i][(newArr[i].length - 1) - j] = t;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.deepToString(s.flipAndInvertImage(
                new int[][] {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}})));
    }
}
