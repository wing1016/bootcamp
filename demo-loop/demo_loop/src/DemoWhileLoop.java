public class DemoWhileLoop {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    System.out.println(" -= -= -= -=");

    int i = 0;
    while (i < 5) {
      System.out.println(i);
      i++;
    }

    int[] arr = new int[] {10, -100, 9, 7};
    // sum all number by while loop
    int j = 0;
    int sum = 0;
    while (j < arr.length) {
      sum += arr[j];
      j++; // i++ can add condition to here, when to do i++
    }

    System.out.println("arr sum is " + sum);

    // break at while loop
    i = 0;
    while (i < 100) {
      if (i > 30) {
        break;
      }
      i++;
    }
    System.out.println("i is " + i);

    // 123 -> 1 + 2 + 3 -> 6
    // 100 -> 1 + 0 + 0 -> 1
    // 4563 -> 4 + 5 + 6 + 3 -> 18

    // while
    i = 0;
    int a = 123;
    sum = 0;
    String tmp = "";
    while (a > 0) {
      sum += a % 10;
      // a = a - sum;
      a = a / 10;

    }
    System.out.println(sum); // answer is 6
  }
}


// 123 > 12
// 1 2
// 0 1
