package deck;


import java.util.Arrays;
import java.util.Random;

public class RandomPickArr {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        randomPrintArray(array);
    }

    public static void randomPrintArray(int[] array) {
        Random rand = new Random();
        int remainingItems = array.length;

        while (remainingItems > 0) {
            int index = rand.nextInt(array.length);

            if (array[index] != -1) {
                System.out.println(array[index]);
                array[index] = -1;
                remainingItems--;
            }
        }
    }
}




// package deck;

// import java.util.Random;

// public class RandomPickArr {

//     public static int[] arr = new int[] {0,1, 2, 3, 4, 5, 6, 7, 8,9};
//     public static int tmp = 0;

    
//     public static void main(String[] args) {
        

//         for (int i = 0; i < arr.length; i++) {

//             int ran =  new Random().nextInt(10);
//             System.out.print(arr[ran] + "  ");

//             // System.out.println(i);
//         }

//     }


// }
