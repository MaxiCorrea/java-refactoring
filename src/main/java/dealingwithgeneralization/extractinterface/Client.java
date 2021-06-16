package dealingwithgeneralization.extractinterface;

/**
 * 
 * @author mxcorrea
 *
 */
public class Client {

  public double charge(
      final Billable billable, 
      final int days) {
    int base = billable.getRate() * days;
    return billable.hasSpecialSkill() ? base * 1.05 : base;
  }

}
