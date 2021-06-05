package makingmethodcallssimpler.preservewholeobject;
/**
 * 
 * @author mxcorrea
 *
 */
public final class HeatingPlan {

  private TempRange range;
  
  public HeatingPlan(
      final TempRange range) {
    this.range = range;
  }
  
  public boolean withinRange (
      final TempRange otherRange) {
    return (otherRange.getLow() >= this.range.getLow() && 
            otherRange.getHigh() <= this.range.getHigh());
  }

  public TempRange getTempRange() {
    return range;
  }
  
}
