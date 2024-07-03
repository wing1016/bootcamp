import javax.naming.directory.DirContext;

public enum Direction {

  EAST(1), NORTH(2), WEST(-1), SOUTH(-2);

  private int i;

  private Direction(int i) {
    this.i = i;
  }

  public int getValue() {
    return this.i;
  }

  // Advantage : able to present some relationship among the enum object

  public boolean isOppsite_wing(Direction d) {
    if (this.i + d.i == 0) {
      return true;
    }
    return false;
  }

  public boolean isOpposite(Direction d) { // because use . method , so need to left side in "="
    return this.getValue() == d.getValue() * -1;
  }

  public static boolean isOpposite(Direction d1, Direction d2) {
    return d1.getValue() == d1.getValue();
  }

  public Direction opposite() {
    for (Direction d : Direction.values()) {
      if (d.getValue() == this.i * -1) {
        return d;
      }
    }
    return null;
  }

  public static Direction opposite(Direction d) {
    for (Direction direction : Direction.values()) {
      if (direction.getValue() == d.getValue() * -1) {
        return direction;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    Direction d = Direction.EAST;

    System.out.println(" isOpposite : " + d.isOpposite(Direction.WEST)); // true
    System.out.println(" isOpposite : " + d.isOpposite(Direction.NORTH)); // false

    // static
    System.out.println(Direction.isOpposite(Direction.EAST, Direction.WEST));

    System.out.println(Direction.EAST.opposite());
    System.out.println(Direction.opposite(Direction.WEST));
  }



}
