public class DemoCharSequence {
  public static void main(String[] args) {


   // CharSequence method is part of String method ( narrower )

    String s = "abc";
    System.out.println(s.length());

    String s3 = s;

    CharSequence cs = "abc";      //left side is narrower than right hand side
    System.out.println(cs.length());  //3 polymorisim

    System.out.println(s.hashCode());
    System.out.println(cs.hashCode());
    // determine the scope of object cab be accessed by "cs"
    // cs.replace() // error CharSequence have no replace() method

    // String s2 = cs;// complier concern the type of cs only
     String s2 = (String) cs;     //it may some risk during run time
    // compile time cannot realize the actual object referenced by "cs"

    // both Parent class and interface relationship can apply downcasting

    if (cs instanceof String) {     // ensure the type safety
      s2 = (String) cs;
    }

    s2.replace("b", "a");

    StringBuilder sb = new StringBuilder("hello");
    System.out.println(sb.length());
    System.out.println(sb.charAt(1));
    System.out.println(sb.reverse());

    CharSequence cs3 = new StringBuilder("hello");
    System.out.println(cs3.length());
    System.out.println(cs3.charAt(1));

    //System.out.println(cs3.reverse());  //CharSequence dont have reverse();

    StringBuilder sb2 = (StringBuilder) cs;     //run time error,  cs is String object
    //while object reference sb2 is StringBuilder.
  }
}
