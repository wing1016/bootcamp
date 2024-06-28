//25Jun24

package markSix;

import java.time.LocalDate;
import java.util.Objects;

public class Result {
  private Ball[] balls;
  private LocalDate date;

  public Result(LocalDate d) {
    this.balls = new Ball[0];
    this.date = d;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Result)) { // "instanceof" is checking if the object pointing by reference is an object produced by Result.class
      return false;
    }
    Result result = (Result) obj; // cast to Result because i want to use method of Rresult object

    return Objects.equals(this.date, result.getDate()); // no need to compare balls becasue only 1 marksix for 1 day

  }

  private LocalDate getDate() {
    return this.date;
  }

  public static void main(String[] args) {

    Result r1 = new Result(LocalDate.of(2024, 6, 25));
    Result r2 = new Result(LocalDate.of(2024, 6, 25));

    System.out.println(r1.equals(r2));

  }
}
