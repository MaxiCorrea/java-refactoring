package dealingwithgeneralization.formtemplatemethod;
/**
 * 
 * @author mxcorrea
 *
 */
public class LifelineSite extends Site {

  public LifelineSite(
      final int unit ,
      final double rate) {
    super(unit, rate);
  }
  
  @Override
  public double calculateBillableAmount() {
    double base = getBaseAmount();
    double tax = getTaxtAmount(base);
    return base + tax;
  }

  public double getBaseAmount() {
    return getUnit() * getRate();
  }
  
  public double getTaxtAmount(double base) {
    return base * Site.TAX_RATE;
  }

}
