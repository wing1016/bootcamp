public class ArrayDemo {
  public static void main(String[] args) {
    //Array , is an Object
    int[] arr = new int[]{1,2,3};   // right side : array Object
    //left side : Object reference

  //  Integer[] integers = new int[]{1,2,3};  // it is Not upcasting


    //how many object are created in this statement?
    Integer[] integers2 = new Integer[]{1,2,3}; //upcasting here , 1 :int value to Integer value 1
    //Answer : 4 Object are newed here and 1 Object point
    //1. Array Object
    //2. Integer Object with value 1
    //3. Integer Object with value 2
    //4. Integer Object with value 3
    System.out.println(integers2[2]); // 3
    //integers2[2] -> is the Object address of Integer Object with value 3
  }
}
