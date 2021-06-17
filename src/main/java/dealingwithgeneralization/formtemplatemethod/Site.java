package dealingwithgeneralization.formtemplatemethod;
/**
 * 
 * @author mxcorrea
 *
 */
public abstract class Site {

  public static final int TAX_RATE = 10;
  
  private final int unit;
  private final double rate;
  
  public Site(
      final int unit ,
      final double rate) {
    this.unit = unit;
    this.rate = rate;
  }
 
  public final double calculateBillableAmount() {
    double base = getBaseAmount();
    double tax = getTaxAmount(base); 
    return base + tax;
  }

  abstract double getTaxAmount(double base);

  abstract double getBaseAmount();

  public int getUnit() {
    return unit;
  }
  
  public double getRate() {
    return rate;
  }
  
}
