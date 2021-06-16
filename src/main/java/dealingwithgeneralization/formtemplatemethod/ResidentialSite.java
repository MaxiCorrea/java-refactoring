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
    double base = getUnit() * getRate() * 0.5;
    double tax = base * Site.TAX_RATE * 0.2; 
    return base + tax;
  }

}
