package dealingwithgeneralization.extractsuperclass;

import java.math.BigDecimal;

/**
 * 
 * @author mxcorrea
 *
 */
public class Department {

  private final String name;
  private final int headCount;
  private final BigDecimal totalAnnualCost;  
   
  public Department(
      final String name,
      final int headCount,
      final BigDecimal totalAnnualCost) {
    this.name = name;
    this.headCount = headCount;
    this.totalAnnualCost = totalAnnualCost;
  }
  
  public String getName() {
    return name;
  }
  
  public int getHeadCount() {
    return headCount;
  }
  
  public BigDecimal getTotalAnnualCost() {
    return totalAnnualCost;
  }

}
