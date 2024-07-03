public class CurrecnyHolder {
  private final String currency;
  private final int DBvalue;

  public CurrecnyHolder(String currency, int DBvalue) {
    this.currency = currency;
    this.DBvalue = DBvalue;
  }

  public String getCurrency() {
    return this.currency;
  }

  public boolean isHKD() {
    return "HKD".equals(this.currency);
  }

  public static boolean isHKD(CurrecnyHolder ch) {
 //   return "HKD".equals(ch.currency); // check with #sir version (wing vers.)
    return "HKD".equals(ch.getCurrency()); // sir version 
  }

  public static boolean isHKD(String currency) {
    return "HKD".equals(currency);
  }

   // Solution: use enum as parameters (type-safe: compiler time ensure/check the scope of values)
  public static boolean isHKD2(Currency c) {
    return "HKD".equals(c.name()); // check with #sir version
  }

  // 1. cannot gurantee there is ONLY one hkd Object memory

  public static void main(String[] args) {
    CurrecnyHolder ch1 = new CurrecnyHolder("HKD", 1);
    CurrecnyHolder ch2 = new CurrecnyHolder("HKD", 1);

    // 2. String is not a good idea to represent a parameter that with finite numbers of object
    System.out.println(ch1.isHKD());

    System.out.println(CurrecnyHolder.isHKD(new CurrecnyHolder("HKD", 1))); // true #sir version
    System.out.println(CurrecnyHolder.isHKD(new CurrecnyHolder("HKDs", 1))); // false
    System.out.println(CurrecnyHolder.isHKD(new CurrecnyHolder("HDK", 1))); // false
    System.out.println(CurrecnyHolder.isHKD(new CurrecnyHolder("hkd", 1))); // false . ascii difference

    // solution : enum
    // enum.class defined a finite number of values, so that complier can validate the parameter
    System.out.println(isHKD2(Currency.USD));

     // valueOf(), String -> ENUM (turn String to enum)
  }

}
