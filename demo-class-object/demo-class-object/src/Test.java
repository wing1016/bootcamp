import java.util.Arrays;

public class Test {

    public int countOperations(int num1, int num2) {
        int c = 0;
        while (num1 != 0 && num2 != 0) {
            if (num1 - num2 >= 0) {
                num1 = num1 - num2;
                // c++;
            } else {
                num2 = num2 - num1;
                // c++;
            }
            c++;
        }
        return c;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.countOperations(2, 3));

    }

}



// public String removeTrailingZeros(String num) {

// for (int i = 0; num.contains("0")&& num.lastIndexOf("0") == num.length() - 1; i++) {

// if (num.contains("0") && num.lastIndexOf("0") == num.length() - 1) {

// num = num.substring(0, num.length() - 1);

// } else {
// break;
// }
// }
// // System.out.println(num);
// return num;
// }



// class Solution {
// public String removeTrailingZeros(String num) {
// int i = num.length() - 1;
// while (num.charAt(i) == '0') {
// i = i - 1;
// }
// // System.out.println(i);
// num = num.substring(0, i+1);
// return num;
// }
// }

// public String removeTrailingZeros(String num) {
// int last = num.length() - 1;
// int i = num.length() - 1;
// System.out.println(i);
// boolean b = num.charAt(i) == '0';
// System.out.println(b);
// while (num.charAt(i) == '0') {

// i = i - 1;
// System.out.println(i);

// }
// // System.out.println(i);
// num = num.substring(0, i+1);
// return num;
// }
