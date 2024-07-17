import java.util.Arrays;

public class ArrayList1 {
  private Integer[] integers;

  public ArrayList1() {
    this.integers = new Integer[0];
  }

  // Wing version add method
  public void add1(Integer i) {
    Integer[] arr = new Integer[this.integers.length + 1];
    for (int j = 0; j < arr.length - 1; j++) {
      arr[j] = this.integers[j];
      if (j == this.integers.length + 1) {
        arr[j] = i;
      }
    }
  }

  public int size() {
    return this.integers.length;
  }

  public void remove(int i) {
    Integer[] arr = new Integer[this.integers.length - 1];
    int idx = 0;
    for (Integer x : this.integers) {   // #sir version
      System.out.println(x + " : " + idx);
      if (idx != i) {        
        arr[idx] = x;
      } else {
        continue;
      }
      idx++;
    }
    this.integers = arr;
  }

  public void add(Integer i) {
    Integer[] arr = new Integer[this.integers.length + 1];
    int idx = 0;
    for (Integer x : this.integers) {
      arr[idx++] = x;
    }
    arr[idx] = i;
    this.integers = arr;
  }

  public Integer[] getIntegers() {
    return this.integers;
  }

  public boolean isEmpty(){
    return this.size() == 0;
  }

  @Override
  public String toString() {
    return Arrays.toString(this.integers);
  }

  public static void main(String[] args) {
    ArrayList1 list = new ArrayList1();
    list.add(10);
    list.add(2);
    list.add(-4);
    for (Integer i : list.getIntegers()) {
      System.out.println(i);
    }
    System.out.println(list);

    list.add(100);
    System.out.println(list);

    System.out.println(list.size());
    list.remove(1);
    System.out.println(list);

   
  }
}
