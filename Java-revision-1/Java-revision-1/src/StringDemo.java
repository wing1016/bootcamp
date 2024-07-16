import java.math.BigDecimal;

public class StringDemo {
  public static void main(String[] args) {
    String s = "Hello";
    String s2 = s.concat(" World");// concat() method return new String Object(address), no impact to s
    System.out.println(s);
    System.out.println(s2);  //s2 is an object reference, helping you to remain the way to find the Object

    StringBuilder sb = new StringBuilder("Hello");
    sb.append(" World");    //no need use a Variable name to hold it (diff from String)
    // you dont need to save the address of sb, because u already changed the value of stored. 
    System.out.println(sb); // Hello World
    sb.append(" !!!"); 
    System.out.println(sb);

    //As a developer, you have to find out the impact of each instance method of each class

    //BigDecimal
    BigDecimal bd = BigDecimal.valueOf(3.3);
    BigDecimal bd2 = BigDecimal.valueOf(3.4);
    bd.add(bd2);    //you have to worry about the impact on bd. Is bd 6.7?

    BigDecimal bd3 = bd.multiply(BigDecimal.valueOf(2.0));
    System.out.println(bd3);    //6.6

    //Writing java , it mean writing class, it means writing instance method
    //Writing java , -> control of hardware, control of memory, the dead or alive of memory

  }
}
