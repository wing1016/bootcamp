public class StringBox {

  //#sir , check sir version

  private String value;

  public StringBox(){

  }

  public StringBox(String v){
    this.value = v;
  }

  public String getValue(){
    return this.value;    
  }

  public void setValue(String v){
    this.value = v;
  }

  public static void main(String[] args) {
    StringBox sb = new StringBox("abc");
    System.out.println(sb.getValue());        //abc

    String sb2 = new StringBox(1);  // #sir  , check sir version

  }

}
