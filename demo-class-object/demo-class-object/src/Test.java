import java.util.Arrays;

public class Test {

    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        String tmp = "";
        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i].toLowerCase();
            if (arr[i].length() > 2) {
                char c = arr[i].charAt(0);

                arr[i] = arr[i].substring(0, 1).toUpperCase()
                        + arr[i].substring(1);
            }
            System.out.println(title);
            tmp = tmp + arr[i];
        }
        return String.join(" ", arr);
    }



    public static void main(String[] args) {

        Test t = new Test();
        System.out.println(t.capitalizeTitle("First leTTeR of EACH Word"));

    }
}

















// "The quick brown fox jumped over the lazy dog"
// I speak Goat Latin
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
