public enum Direction {

  EAST(1), NORTH(2), WEST(-1), SOUTH(-2);

  private int i;

  private Direction(int i) {
    this.i = i;
  }

  // Advantage : able to present some relationship among the enum object

  public boolean isOppsite(Direction d) {
    if (this.i + d.i == 0) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Direction d = Direction.EAST;

    System.out.println(" isOpposite : " + d.isOppsite(Direction.WEST)); // true
    System.out.println(" isOpposite : " + d.isOppsite(Direction.NORTH)); // false
  }

}
