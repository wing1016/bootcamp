import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    // 17 types ( 8 primitives + 8 wrapper classes + String )
    // similar to valueOf
    LocalDateTime Ldt;
    LocalDate ld = LocalDate.of(2022, 12, 31);
    System.out.println(ld.toString());

   // LocalDate ld1 = LocalDate.of(2002, 12, 32);   < error  32 is wrong

   System.out.println(ld.plusDays(1L)); // 2002-12-31
   System.out.println(ld.plusMonths(3L));// 2003-03-31
   System.out.println(ld.plusYears(3L));    // if add 1.5 year , you can add 18 months

   System.out.println(ld.minusMonths(4)); //2002-08-31

   Month month = ld.getMonth();
   String monthString = month.toString();
   System.out.println(ld.getMonth()); //DECEMBER

   System.out.println("month String is " + monthString); //

   System.out.println(ld.getYear()); // 2022, int
   System.out.println(ld.getDayOfMonth()); // 31, int
   System.out.println(ld.getDayOfYear()); // 365
   System.out.println(ld.getDayOfWeek()); // SATURDAY

   DemoDate dd = new DemoDate();

  }
}
