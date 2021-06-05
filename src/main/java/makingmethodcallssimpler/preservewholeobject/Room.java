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
    return plan.withinRange(daysTempRange());
  }

  private TempRange daysTempRange() {
    return plan.getTempRange();
  }
  
}
