package makingmethodcallssimpler.preservewholeobject;
/**
 * 
 * @author mxcorrea
 *
 */
public final class TempRange {

  private final int low;
  private final int high;
  
  public TempRange(
      final int low,
      final int high) {
    validateLowHigh(low, high);
    this.low = low;
    this.high = high;
  }
  
  private void validateLowHigh(
      final int low ,
      final int high) {
    if(low > high) {
      throw new IllegalArgumentException("low > hight");
    }
  }
  
  public boolean includes(
      final TempRange otherRange) {
    return (otherRange.getLow() >= this.getLow() && 
            otherRange.getHigh() <= this.getHigh());
  }
  
  public int getLow() {
    return low;
  }
  
  public int getHigh() {
    return high;
  }
  
}
