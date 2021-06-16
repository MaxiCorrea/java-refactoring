package dealingwithgeneralization.formtemplatemethod;
/**
 * 
 * @author mxcorrea
 *
 */
public class ResidentialSite extends Site {

  public ResidentialSite(
      final int unit ,
      final double rate) {
    super(unit,rate);
  }
  
  @Override
  public double calculateBillableAmount() {
    double base = getBaseAmount();
    double tax = getTaxAmount(base); 
    return base + tax;
  }

  public double getTaxAmount(double base) {
    return base * Site.TAX_RATE * 0.2;
  }

  public double getBaseAmount() {
    return getUnit() * getRate() * 0.5;
  }

}
