package deck;

import java.util.Random;

public class RandomArrayPrinter {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();

        while (array.length > 0) {
            int index = random.nextInt(array.length);
            int item = array[index];
            System.out.println(item);
            array = removeElement(array, index);
        }
    }

    private static int[] removeElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }
}