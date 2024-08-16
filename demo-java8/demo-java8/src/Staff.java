public class Staff {
  private String department;
  private String name;
  private int salary;

  public Staff(String d, String n) {
    this.department = d;
    this.name = n;
  }

  public Staff(String d, String n, int s) {
    this.department = d;
    this.name = n;
    this.salary = s;
  }

  public String getDepartment() {
    return this.department;
  }

  public String getName() {
    return this.name;
  }

  public int getSalary() {
    return this.salary;
  }


  @Override
  public String toString(){
    return " Staff : " + this.department + ", " + this.name + ", " + this.salary;
  }
}
