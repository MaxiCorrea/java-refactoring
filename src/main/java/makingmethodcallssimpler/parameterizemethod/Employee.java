package makingmethodcallssimpler.parameterizemethod;

import java.math.BigDecimal;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Employee {

  private BigDecimal salary;
  
  public Employee(
      final BigDecimal salary ) {
    this.salary = salary;
  }
  
  public final void tenPercentRaise() {
    salary = salary.multiply(BigDecimal.valueOf(1.1));
  }
  
  public final void fivePercentRaise() {
    salary = salary.multiply(BigDecimal.valueOf(1.05));
  }
  
  public final BigDecimal getSalary() {
    return salary;
  }
  
}
