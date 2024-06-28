public class DemoEnum {


  // Constant
  // Weekday
  public static final String monday = "MONDAY";
  public static final String tuesday = "TUESDAY";
  public static final String wednesday = "WEDNESDAY";
  public static final String thursday = "THURDSAY";
  public static final String friday = "FRIDAY";
  public static final String saturday = new String("SATURDAY");


  public static void main(String[] args) throws Exception {

    System.out.println(Weekday.MONDAY);  // Calling Weekday enum MONDAY toString()

    System.out.println(Weekday.TUESDAY);
    System.out.println(Weekday.WEDNESDAY);
    // what happen in heap memory
    // Answer: static variable would not point to object

    // Before the main method being excute, it loads all the enum
    // enum actually is a class at the background
    //by default Weekday.class already @Override toString


    //Other example Q 
    //North, south, west, east

    Direction d =  Direction.EAST;   
    if(d == Direction.WEST ){
      
    }

  }
}
