public class DemoStringBuilder {
  public static void main(String[] args) {
    String x = "hello"; // String is very slow performance

    // StringBuilder . is a class 
    // Why use Stringbuilder ? > fast performance 
    StringBuilder sb = new StringBuilder("hello"); // new StringBuilder() is a constructor

    Cat cat = new Cat();

    x += " world";
    sb.append(" world");  // no need like that > sb = sb.append(" world");

    System.out.println(sb);
    System.out.println(sb.toString());

    //replace < method is self return ( return itself )
    sb.replace(1, 2, "xx");  // no need like that > sb = sb.replace(1, 2, "xx"); 
    System.out.println(sb.toString());

    //.reverse
    System.out.println(sb.reverse());

    //insert
    
    System.out.println(sb.insert(4, '*'));

    String s = sb.substring(0)

    //deleteCharAt

  }
}
