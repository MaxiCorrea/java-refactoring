package composingmethods.splittemporalvariable;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Train {

  private final double primaryForce;
  private final double secondaryForce;
  private final double mass;
  private final int delay;

  public Train(
      final double primaryForce ,
      final double secondaryForce ,
      final double mass ,
      final int delay) {
    this.primaryForce = primaryForce;
    this.secondaryForce = secondaryForce;
    this.mass = mass;
    this.delay = delay;
  }
  
  public double getDistanceTravelled(
      final int time) {
    double result;
    final double primaryAcc = primaryForce / mass;
    int primaryTime = Math.min(time, delay);
    result = 0.5 * primaryAcc * primaryTime * primaryTime;
    int secondaryTime = time - delay;
    if (secondaryTime > 0) {
      double primaryVel = primaryAcc * delay;
      final double secondaryAcc = (primaryForce + secondaryForce) / mass;
      result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
    }
    return result;
  }

}
