import javax.management.loading.PrivateClassLoader;

public class Person {
  private String hkid;
  private String name;

  //hashcode()
  // main ->
  @Override
  public  int hashcode(){
    return Object.hashCode(this.hkid);
  }

}
