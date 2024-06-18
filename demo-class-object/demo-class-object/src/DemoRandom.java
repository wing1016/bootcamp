import java.util.Random;

public class DemoRandom {

  private  int baseSalary = 6000;

  public static void main(String[] args) {


    // JDK
    // random -> usually integer
    int Random = new Random().nextInt(3); // 0,1,2
    System.out.println(Random);

    int Random2 = new Random().nextInt(3) + 1; // 1-3

    System.out.println(Random2);

    int Random3 = new Random().nextInt(3 - 1) + 1; // 1-2
    System.out.println(Random3);

    int Random4 = new Random().nextInt(2) + 49; //    new Random().nextInt(range) + shift
    System.out.println(Random4);

  }

  public static int sum(int x, int y){
    return x + y;  //  return x + y + this.z; << no need like this to make a instance method
  }

  public   int sum2(int x, int y){
    return x + y;  //  no need to make instance method like this. it is just a simple tools
  }

  public void setBaseSalary(int baseSalary){
    this.baseSalary = baseSalary;
  }

  public int getSalary(int bonus){    //  this is suitable for instanced method, because it have state
    return this.baseSalary + bonus;
  }
}
