package dealingwithgeneralization.extractsuperclass;

import java.math.BigDecimal;

/**
 * 
 * @author mxcorrea
 *
 */
public class Employee extends Party {

  private final int id;
  private final BigDecimal anualCost;
  
  public Employee(
      final int id,
      final String name,
      final BigDecimal anualCost) {
    super(name);
    this.id = id;
    this.anualCost = anualCost;
  }

  public int getId() {
    return id;
  }
   
  public BigDecimal getAnualCost() {
    return anualCost;
  }
}
