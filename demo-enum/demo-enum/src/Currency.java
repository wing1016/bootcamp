

public enum Currency {
  HKD("HK Dollar", 1), USD("US Dollar", 2), JPY("YEN", 3),;
  // KRW("Korea Dollar",4),
  // TWD("Taiwan Money",5),;


  // instance variable
  private final String description; // you can final this instance variable
  private int DBvalue; // but meaningless , because here dont hava setter and it is private variable

  // Always private
  // Overriding empty constructor
  private Currency(String dc, int db) { // object new by JVM
    this.description = dc;
    this.DBvalue = db;
  }

  // instance method
  public String getDescription() {
    return this.description;
  }

  public int getDBvalue() {
    return this.DBvalue;
  }

  @Override
  public String toString() {
    return this.name() + " :-> " + this.description;
  }

  // 2 -> USD, 3 -> JPY
  public static Currency getW(int db) { // wing version
    Currency d = null;
    for (Currency c : Currency.values()) {
      if (db == c.getDBvalue()) {
        d = c;
      }
    }
    return d;
  }

  public static Currency get(int db) {
    for (Currency c : Currency.values()) { // vincent version
      if (db == c.getDBvalue()) {
        return c;
      }
    }
    return null;
  }

  public static int get(Currency c) {
    return c.getDBvalue();
  }

  public static String fullDescription(Currency c) {
    // if (c == Currency.HKD) {
    // return "It is HK Dollar";
    // } else if (c == Currency.USD) {
    // return String.valueOf(c.getDescription());
    // }

    // return null;

    //Alternative : switch (before Java 14)
    switch (c) {
      case HKD:
        return "IT is HK Money";      // break after return is no meaning . break here means leave the method
      case USD:
        return "Hello world";
      case JPY:
        return "Hell yeah";
      default:
        break;
    }
    return "dead end";
  }


  public static void main(String[] args) {
    // Currency currency = "HKD";
    Currency currency = Currency.HKD; // in heap memory
    Currency currency9 = HKD;



    System.out.println(Currency.get(3));

    if (currency == Currency.USD) {
      System.out.println("It is USD");
    } else if (currency == Currency.HKD) {
      System.out.println("It is HKD");
    } else if (currency == Currency.JPY) {
      System.out.println("It is" + currency.getDescription());
    }

    System.out.println(" DB value is " + currency.getDBvalue());
    // use == to compare, no need equal, because it is whole world unique

    // enum already overvide .toString() method
    System.out.println(currency);
    // no override toSting() method, but print out name but not print Object reference

    // default instance method provided by enum.class
    System.out.println(currency.name());

    // 2. values() -> usually use by for each
    System.out.println(Currency.values());
    for (Currency c : Currency.values()) {
      System.out.println(c.getDescription());
    }

    for (Currency c : Currency.values()) {
      System.out.println(c.DBvalue);
    }

    // 3. valueOf() -> static method

    System.out.println(Currency.valueOf("HKD").name()); // "HKD", String to enum , then to String -> "HKD"
    System.out.println(Currency.valueOf("123").name()); // error

    System.out.println(Currency.values().length);
    // .length is only for array. so Currency is an array

    System.out.println(currency.hashCode()); // 1418481495
    System.out.println(Currency.HKD.hashCode()); // 1418481495
    System.out.println(Currency.USD.hashCode()); // 303563356

    System.out.println(Currency.JPY.equals(currency)); // false
    System.out.println(Currency.HKD.equals(currency)); // true
    System.out.println(currency.equals(Currency.HKD)); // !!QQ ( bad )

    System.out.println(currency != null && currency.equals(Currency.HKD)); // better
    // if left side is not OK, computer wont go to right side

    String x = "abc";

    // Not OK
    if (x.equals("abc")) { // potentially null pointer exception
      // null.equals () is NOT OK
    }

    // OK
    if ("abc".equals(x)) { // true or false only.
      // this is good coding style
    }

  }

  // Object - top
  // Enum - middle
  // Currecny - here

  // enum GOOD point



}
