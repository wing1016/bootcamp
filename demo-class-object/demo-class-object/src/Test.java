import java.util.Arrays;

public class Test {

    public boolean isValid(String word) {
        char c = ' ';
        int itg = 0;
        word = word.toLowerCase();
        if (word.length() < 3) {
            return false;
        }

        if (word.indexOf('a') != -1 || word.indexOf('e') != -1 || word.indexOf('i') != -1 || word.indexOf('o') != -1
                || word.indexOf('u') != -1) {
            System.out.println("VV");
        }

        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            itg = (int) c;
            if (!((c >= 48 && c <= 57) || (c >= 65 && c <= 90) || (c >= 97 && c <= 122))) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        String s = "acbfgf";
        char c = ' ';

        s = s.toLowerCase();
        System.out.println(s);
        System.out.println(s.indexOf("s"));
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



// public int countOperations(int num1, int num2) {
// int c = 0;
// while (num1 != 0 && num2 != 0) {
// if (num1 - num2 >= 0) {
// num1 = num1 - num2;
// // c++;
// } else {
// num2 = num2 - num1;
// // c++;
// }
// c++;
// }
// return c;
// }



// public char repeatedCharacter(String s) {
// int count = 2;
// int place = s.length();
// char letter = '-';
// for (int i = 0; i < s.length(); i++) {
// count = 2;
// for (int j = 0; j < s.length() ; j++) {
// System.out.println(s.charAt(i) + " : " + s.charAt(j));
// if (s.charAt(i) == s.charAt(j)) {
// System.out.println(" count : " + count);
// count--;
// }
// if (count == 0 && j < place) {
// place = j;
// System.out
// .println("result : " + count + ", j :" + j + " ");
// letter = s.charAt(i);
// System.out.println(letter);
// // break;
// }
// }

// }
// return letter;

// }
