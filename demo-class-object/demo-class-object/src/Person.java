import java.math.BigDecimal;
import java.math.RoundingMode;

public class Person {

  //attribute
  private String firstName;
  private String lastName;

  private double weight;
  private double height;
  private double bmi; // << dont do that;

  //constructor - empty construction
  public Person(){

  }

  // All arguments construction
  public Person(String firstName, String lastName, double w, double h){
    this.firstName = firstName;
    this.lastName = lastName;
    this.weight = w;
    this.height = h;

  }

  public double calBmi() {

    // return this.weight/this.height*this.height;
    return BigDecimal.valueOf(this.weight)
        .divide(BigDecimal.valueOf(Math.pow(this.height, 2)),
            RoundingMode.HALF_UP)
        .doubleValue();

    // return BigDecimal.valueOf(Math.pow(this.height, 2)).doubleValue();
    // return this.height;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getHeight() {
    return this.height;
  }

  public void setWeight(double w) {
    this.weight = w;
  }

  public void setHeight(double h) {
    this.height = h;
  }

  public static double sBmi(double w, double h) {

    return BigDecimal.valueOf(w)
        .divide(BigDecimal.valueOf(Math.pow(h, 2)), RoundingMode.HALF_UP)
        .doubleValue();
  }

  // toString
  public String toString() {

    return "Full Name : " + this.fullName() + " Bmi : " + this.bmi;
  }


  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public void setFirstName(String s) {
    this.firstName = s;
  }

  public void setLastName(String s) {
    this.lastName = s;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public static void main(String[] args) {
    // create person
    // set first/last name
    // get full name

    Person p1 = new Person(); // << create a Person object in memory
    p1.setFirstName("Ng");
    p1.setLastName("Wing");
    p1.setWeight(65);
    p1.setHeight(1.7);
    //System.out.println(65.0 / (1.7 * 1.7));
    System.out.println(p1.calBmi());
    System.out.println(p1.fullName());


    System.out.println(Person.sBmi(65, 1.7));
    System.out.println(p1.toString());

    Person p2 = new Person("Chan", "Tai Man", 55, 1.4);
    System.out.println(p2.calBmi());

    Person p3 = p1;
    System.out.println(p1.fullName());
    System.out.println(p3.fullName());

    p1.setFirstName("Sam");
    p1.setLastName("Hui");
    System.out.println(p1.fullName());
    System.out.println(p3.fullName());

  }

}
