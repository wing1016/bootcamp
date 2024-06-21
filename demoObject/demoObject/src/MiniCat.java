import java.util.Objects;

public class MiniCat {
  

    private String name;  //
  private String color;

  public MiniCat(String name, String color){
    this.name = name;
    this.color = color;
  }

  @Override
  public int hashCode(){
    return Objects.hash(this.name, this.color);   // if cat have same name and same color, hashcode is the same
  }


}
