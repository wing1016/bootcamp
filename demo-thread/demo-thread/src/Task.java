// package demo-thread.demo-thread.src;

public class Task implements Runnable {

  // sir

  @Override
  public void run() {
    for (int i = 0; i < 5; i++) {
      System.out.println("i = " + i);
    }
  }
}
