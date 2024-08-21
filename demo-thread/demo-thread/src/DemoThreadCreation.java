public class DemoThreadCreation {
  public static void main(String[] args) {
    Integer x = 1; //x is an object reference -> Integer Object
    x++; // 2   // 1) take the 1 out , 2) add 1 on it , 3) put back the 2 into heap memory ( in this line do 3 steps )
    System.out.println(x);
    ++x; // 3


    Task task1 = new Task();
    Thread thread1 = new Thread(task1);   // main thread, thread1
    thread1.start();  //run()

    
    //By default, main thread would proceed without waiting for thread1
    //But you can use join(), then both main thread & thread1 will wait each other
    try {
      thread1.join();     // throw checked exception     //main thread will wait thread1 ends
    } catch (InterruptedException e) {
      
    }
    System.out.println("--- Program End ---");

    //Extends Thread.class
   // Thread thread2 = new AddStringManyTimeThread();
    AddStringManyTimeThread thread2 = new AddStringManyTimeThread();
    thread2.start();    //run()
      
    try {
        thread2.join();
    } catch (InterruptedException e) {
       
    }
        System.out.println(thread2.getStrings().size());
    //sir
  }
}
