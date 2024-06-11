public class StringHelper {

  private String str;   //attribute

  public StringHelper(String str) {
    this.str = str;
  }

  // instance method;

  public void setCharAt(int i, char c) {
    String s = "";
    for (int j = 0; j < this.str.length(); j++) {
      if (j == i) {
        s += c;
      } else {
        s += this.str.charAt(j);
      }
    }
    this.str = s; // revise the string object inside StringHelper object
  }

  public String toString() {
    return this.str;
  }

  public StringHelper append(String s) {
    this.str += s;
    return this;
  }

  public int length() {
    return str.length();
  }

  public String substring(int start, int end) {

    String s = "";
    for (int i = start; i < end ; i++) {
      s += this.str.charAt(i);
    }
    // this.str = s;    << no this line , didnot replace itself
    return s;
  }

  public static void main(String[] args) {
    StringHelper sh = new StringHelper("Hello");
    sh.setCharAt(3, 'x');
    System.out.println();

    sh.append(" world");
    System.out.println(sh.toString());

    sh.append(" !!!");
    System.out.println(sh.toString());

    sh.append(" haha").append(" i am wing").setCharAt(2, '#');
    System.out.println(sh.toString());

    "Hello".charAt(1); // nothing

    System.out.println(sh.substring(2, 5));

  }
}



// public static void main(String[] args) {
// private String str;

// public StringHelper(String str){
// this.str = str;
// }

// //instance method;



// StringHelper sh = new StringHelper("Hello");
// }

