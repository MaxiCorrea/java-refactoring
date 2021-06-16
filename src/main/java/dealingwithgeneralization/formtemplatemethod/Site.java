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
 
  abstract double calculateBillableAmount();

  public int getUnit() {
    return unit;
  }
  
  public double getRate() {
    return rate;
  }
  
}
