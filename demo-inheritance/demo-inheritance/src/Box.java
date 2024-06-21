//21Jun24


public class Box {    // similar to StringBuilder
  private String x;

  public Box(){
    this.x = "";
  }

  public Box append(String y){
    this.x += y;
    return this;
  }

  public String toString(){
    return this.x;
  }

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    sb.append("hello");
    System.out.println(sb);  // hello

    Box box = new Box();
    box.append("hello box");
    System.out.println(box);
  }

  // need to see vincent version ..
}
