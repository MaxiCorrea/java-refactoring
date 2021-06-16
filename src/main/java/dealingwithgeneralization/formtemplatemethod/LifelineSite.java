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
    double base = getUnit() * getRate();
    double tax = base * Site.TAX_RATE;
    return base + tax;
  }

}
