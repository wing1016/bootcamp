import java.util.Arrays;

public class Box {

  //static variable ( static means belongs to class )
  private static String prefix = "apple";
  private  String name;



  //instance variable
  private String[] strings;

  public Box(){
    this.strings = new String[0];
    }

  public Box(String[] strings) {
    this.strings = strings;
  }

  public void setName(String s){
    this.name = Box.prefix.concat(" - ").concat(s);
  }

  public String getName(){
    return this.name;
  }

  public String[] geStrings() {
    return this.strings;
  }

  public void setString(int i, String s) {
    this.strings[i] = s;
  }

  public String toString() {
    return "Box(" + "String = " + Arrays.toString(this.strings) + " )";
  }

  public void addString(String s) {
    String[] tmp = new String[this.strings.length + 1];
    f String[] tmp = new String[this.strings.length + 1];or (int i = 0; i < this.strings.length; i++) {
      tmp[i] = this.strings[i];
    }
    tmp[this.strings.length] = s;
    this.strings = tmp; // tmp will be destroy after method addString is finished
  }

  public void deleteString(String s){
    //reverse arr string, and remove corresponding Strings
    String[] tmp = new String[this.strings.length - 1];

  }

  public static void main(String[] args) {
    Box box = new Box(new String[] {"aaa", "bbb", "ccc"});

    Box box1 = new Box();
    box1.addString("Kawai");
    System.out.println(box1);

    System.out.println("- - - - ");
    System.out.println(Arrays.toString(box.geStrings()));
    System.out.println(box);

    box.setString(1, new String(" world")); // box.setString(1, "world");
    System.out.println(box);

    box.addString("yeah");
    System.out.println(box);

    box.setName("hahaha");
    System.out.println(box.getName());
  }
}
