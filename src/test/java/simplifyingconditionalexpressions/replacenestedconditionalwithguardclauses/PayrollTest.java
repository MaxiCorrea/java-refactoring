package simplifyingconditionalexpressions.replacenestedconditionalwithguardclauses;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class PayrollTest {

  private final Employee deadEmployee = new Employee() {
    @Override public boolean isSeparated() { return false; }
    @Override public boolean isRetired() { return false; }
    @Override public boolean isDead() { return true; }
  };

  private final Employee retiredEmployee = new Employee() {
    @Override public boolean isSeparated() { return false; }
    @Override public boolean isRetired() { return true; }
    @Override public boolean isDead() { return false; }
  };
  
  private final Employee separatedEmployee = new Employee() {
    @Override public boolean isSeparated() { return true; }
    @Override public boolean isRetired() { return false; }
    @Override public boolean isDead() { return false; }
  };
  
  private final Employee normalEmployee = new Employee() {
    @Override public boolean isSeparated() { return false; }
    @Override public boolean isRetired() { return false; }
    @Override public boolean isDead() { return false; }
  };
  
  @Test
  public void testDeadAmount() {
    Payroll payroll = new Payroll();
    BigDecimal expectedAmount = BigDecimal.valueOf(0.0);
    BigDecimal actualAmount = payroll.calculatePayAmount(deadEmployee);
    assertEquals(expectedAmount, actualAmount);
  }

  @Test
  public void testRetiredAmount() {
    Payroll payroll = new Payroll();
    BigDecimal expectedAmount = BigDecimal.valueOf(120_000_000);
    BigDecimal actualAmount = payroll.calculatePayAmount(retiredEmployee);
    assertEquals(expectedAmount, actualAmount);
  }
  
  @Test
  public void testSeparatedAmount() {
    Payroll payroll = new Payroll();
    BigDecimal expectedAmount = BigDecimal.valueOf(100_000_000);
    BigDecimal actualAmount = payroll.calculatePayAmount(separatedEmployee);
    assertEquals(expectedAmount, actualAmount);
  }
  
  @Test
  public void testNormalAmount() {
    Payroll payroll = new Payroll();
    BigDecimal expectedAmount = BigDecimal.valueOf(200_000_000);
    BigDecimal actualAmount = payroll.calculatePayAmount(normalEmployee);
    assertEquals(expectedAmount, actualAmount);
  }
  
}
