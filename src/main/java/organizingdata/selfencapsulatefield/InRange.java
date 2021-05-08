package organizingdata.selfencapsulatefield;
/**
 * 
 * @author mxcorrea
 *
 */
public final class InRange {

  public static final InRange newInstance(
      final int low ,
      final int high) {
    return new InRange(low, high);
  }
  
  private final int low;
  private final int high;
  
  private InRange(
      final int low ,
      final int high) {
    this.low = low;
    this.high = high;
  }
  
  public final boolean includes(
      final int value) {
    return value >= getLow() && value <= getHigh();
  }
  
  public int getLow() {
    return low;
  }
  
  public int getHigh() {
    return high;
  }
  
}
