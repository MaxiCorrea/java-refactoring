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
    return range.includes(otherRange);
  }

  public TempRange getTempRange() {
    return range;
  }
  
}
