package dealingwithgeneralization.extractsuperclass;

import java.math.BigDecimal;

/**
 * 
 * @author mxcorrea
 *
 */
public abstract class Party {

  private final String name;
  
  public Party(
      final String name) {
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public abstract BigDecimal getAnnualCost();
}
