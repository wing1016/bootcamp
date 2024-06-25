import java.util.Objects;

public class Person {
  private String hkid;
  private String name;

  public Person(String id, String nm){
    this.hkid = id;
    this.name = nm;
  }

  public Person(){

  }

  //hashcode()
  // main ->
  @Override
  public  int hashCode(){
    return Objects.hash(this.hkid, this.name);
  }

  public static void main(String[] args) {
      Person p = new Person("123","Wing");
      System.out.println(p.hashCode());
  }

  

}
