package Parent;

public class Father {

  private String name;

  public Father(){
    
  }

//when there is a non empty constructor,
// the class will remove the empty constructor
  public Father(String name){
    this.name = name;
  }
}
