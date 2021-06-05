package makingmethodcallssimpler.preservewholeobject;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Room {

  private final HeatingPlan plan;
  
  public Room(
      final HeatingPlan plan) {
    this.plan = plan;
  }
  
  public boolean withinPlan(
      final HeatingPlan plan) {
    int low = daysTempRange().getLow();
    int high = daysTempRange().getHigh();
    return plan.withinRange(low, high);
  }

  private TempRange daysTempRange() {
    return plan.getTempRange();
  }
  
}
