package dealingwithgeneralization.extractsuperclass;

import java.math.BigDecimal;

/**
 * 
 * @author mxcorrea
 *
 */
public class Employee {

  private final int id;
  private final String name;
  private final BigDecimal anualCost;
  
  public Employee(
      final int id,
      final String name,
      final BigDecimal anualCost) {
    this.id = id;
    this.name = name;
    this.anualCost = anualCost;
  }

  public int getId() {
    return id;
  }
  
  public String getName() {
    return name;
  }
  
  public BigDecimal getAnualCost() {
    return anualCost;
  }
}
