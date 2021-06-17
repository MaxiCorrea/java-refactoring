package dealingwithgeneralization.formtemplatemethod;
/**
 * 
 * @author mxcorrea
 *
 */
public final class ResidentialSite extends Site {

  public ResidentialSite(
      final int unit ,
      final double rate) {
    super(unit,rate);
  }
  
  public double getBaseAmount() {
    return getUnit() * getRate() * 0.5;
  }

  public double getTaxAmount(
      final double base) {
    return base * Site.TAX_RATE * 0.2;
  }
  
}
