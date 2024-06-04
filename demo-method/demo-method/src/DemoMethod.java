import java.util.Arrays;

public class DemoMethod {
    public static void main(String[] args) throws Exception {

        // Method: get some input to provide output for you
        // Calling method
        System.out.println("Hello, World!");

        // call method sum
        int result = sum(10, 3);
        System.out.println("result : " + result);

        char lc = lastChar("applexxx");
        System.out.println("last char : " + lastChar("appleere KK"));

        System.out.println(toString(new char[] {'a', 'b', 'c', 'x'})); // important
        System.out.println(max(new int[] {2, 1, 8, 77, 4, 1}));
        System.out.println(isElderly(65));
        System.out.println(isSubstring("apple", "pplx"));

        int g = 3;
        System.out.println(++g * 8);

        // circle area
        System.out.println(circleArea(3));


        //double * double > error . fix double
        System.out.println(0.2 * 0.1);

    }

    public static int sum(int x, int y) {

        // need a "return" keyword
        return x + y; // int + int -> int
    }

    public static char lastChar(String s) {

        return s.charAt(s.length() - 1); // remember to - 1 when charAt
    }


    public static String toString(char[] arr) {
        // Approach 1
        String resulString = "";
        // for (int i = 0; i < arr.length; i++) {
        // resulString += arr[i];
        // }
        // return resulString;
        // }

        // Approach 2

        return String.valueOf(arr);
    }

    public static int max(int[] arr) {
        // int maxInt = arr[0];
        int maxInt = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxInt) {
                maxInt = arr[i];
            }
        }
        return maxInt;
    }

    public static boolean isElderly(int age) {
        // >65
        // Approach 1
        // if (age > 65) {
        // return true;
        // }
        // return false;

        // Approach 2
        System.out.println("isElderly ?");
        return age > 65;

    }

    public static boolean isSubstring(String str, String substr) {
        // check if substr is a substring of str

        // Approach 1
        System.out.println("isSubstring? ");
        // return str.contains(substr);

        // Approach 2
        // indexOf() method will return an int index . return -1 if not found
        // return str.indexOf(substr) != -1;


        // Approach 3 str : hello substr : ll
        boolean isSubstring = false;
        for (int i = 0; i < str.length() - substr.length() + 1; i++) {

            for (int j = 0; j < substr.length(); j++) {
                // 00 0
                // 01 1
                // 02 2
                // 03 3

                if (str.charAt(i + j) != substr.charAt(j)) {
                    break;
                }
                if (j == substr.length() - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    //java > pi
    public static double circleArea(int radius) {

        return radius * radius * Math.PI; // int * int * double 2*2*2.0=8.0
    }

    
    
    class Solution {
        public int scoreOfString(String s) {
            //for loop
            //chatAt
            //Chat -> int
    
            int tmp; 
            int tmp2;
            int tmpSum;
    
            for(int i = 0; i<s.length() ;i++){
                // tmp = s.toString;
            }
            
            return 1;
        }
    }


}
