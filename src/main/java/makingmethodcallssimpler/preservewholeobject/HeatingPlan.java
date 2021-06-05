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
      final int low, 
      final int high) {
    return (low >= range.getLow() && high <= range.getHigh());
  }

  public TempRange getTempRange() {
    return range;
  }
  
}
