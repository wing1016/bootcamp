import java.util.Arrays;

public class Test {

    public String toGoatLatin(String sentence) {
        String vw = "aeiouAEIOU";
        String[] s = sentence.split(" ");
        String newS = "";

        for (int i = 0; i < s.length; i++) {
            String nstr = "";
            char ch;

            if (vw.indexOf(s[i].charAt(0)) == -1) {
                // ch = s[i].charAt(0);
                // nstr = s[i].substring(1);
                nstr = s[i].substring(1) + s[i].charAt(0);
            } else {
                nstr = s[i];
            }
            nstr = nstr + "ma";
            for (int k = 0; k <= i; k++) {
                nstr = nstr + "a";
            }
            newS = newS + nstr + " ";
            // System.out.println(nstr);
        }

        return newS.trim();
    }

    public static void main(String[] args) {

        String x = "The quick brown fox jumped over the lazy dog";
        String[] a = x.split(" ");

        Test t = new Test();


        System.out.println(Arrays.toString(a));
        System.out.println(t.toGoatLatin(x));


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
