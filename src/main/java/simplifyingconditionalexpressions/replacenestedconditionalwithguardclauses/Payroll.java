package simplifyingconditionalexpressions.replacenestedconditionalwithguardclauses;

import java.math.BigDecimal;

/**
 * 
 * @author mxcorrea
 *
 */
public final class Payroll {

  private static final BigDecimal DEAD_AMOUNT = BigDecimal.valueOf(0.0);
  private static final BigDecimal SEPARATE_AMOUNT = BigDecimal.valueOf(100_000_000);
  private static final BigDecimal RETIRED_AMOUNT = BigDecimal.valueOf(120_000_000);
  private static final BigDecimal NORMAL_AMOUNT = BigDecimal.valueOf(200_000_000);
    
  public BigDecimal calculatePayAmount(
      final Employee employee) {
    if (employee.isDead()) return deadAmount();
    if (employee.isSeparated()) return separatedAmount();
    if (employee.isRetired()) return retiredAmount();
    return normalPayAmount();
  }

  private BigDecimal deadAmount() {
    return DEAD_AMOUNT;
  }
  
  private BigDecimal separatedAmount() {
    return SEPARATE_AMOUNT;
  }
 
  private BigDecimal retiredAmount() {
    return RETIRED_AMOUNT;
  }

  private BigDecimal normalPayAmount() {
    return NORMAL_AMOUNT;
  }

}
