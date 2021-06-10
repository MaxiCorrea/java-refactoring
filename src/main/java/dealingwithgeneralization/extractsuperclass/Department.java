package dealingwithgeneralization.extractsuperclass;

import java.math.BigDecimal;

/**
 * 
 * @author mxcorrea
 *
 */
public class Department extends Party {

  private final int headCount;
  private final BigDecimal totalAnnualCost;  
   
  public Department(
      final String name,
      final int headCount,
      final BigDecimal totalAnnualCost) {
    super(name);
    this.headCount = headCount;
    this.totalAnnualCost = totalAnnualCost;
  }
   
  public int getHeadCount() {
    return headCount;
  }
  
  public BigDecimal getAnnualCost() {
    return totalAnnualCost;
  }

}
