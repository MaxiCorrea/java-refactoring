package dealingwithgeneralization.formtemplatemethod;
/**
 * 
 * @author mxcorrea
 *
 */
public final class LifelineSite extends Site {

  public LifelineSite(
      final int unit ,
      final double rate) {
    super(unit, rate);
  }
  
  public double getBaseAmount() {
    return getUnit() * getRate();
  }
  
  public double getTaxAmount(
      final double base) {
    return base * Site.TAX_RATE;
  }

}
