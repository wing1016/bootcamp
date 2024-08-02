import java.util.Comparator;

public class SortByWhat implements Comparator<Long> {

  @Override
  public int compare(Long l1, Long l2) {

    return l2.compareTo(l1);
    //return l2 > l1 ? 1 : -1;  <<OK but not recommend
    
    // !!! Java will convert from Long to long !!!
    // Object must use compareTO to compare
    // only use > < when primitive !!! 
    
  }

  // @Override
  // public int compare(Object o1, Object o2) {
  // // TODO Auto-generated method stub
  // throw new UnsupportedOperationException("Unimplemented method 'compare'");
  // }

}
