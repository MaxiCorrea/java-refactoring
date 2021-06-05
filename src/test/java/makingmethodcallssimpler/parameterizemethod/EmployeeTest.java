package makingmethodcallssimpler.parameterizemethod;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class EmployeeTest {

  private static final BigDecimal INITIAL_SALARY = BigDecimal.valueOf(100.00);
 
  private Employee employeeSUT;
  
  @Before
  public void setup() {
    employeeSUT = new Employee(INITIAL_SALARY);
  }
  
  @Test
  public void test10PercentRaiseSalary() {
    BigDecimal expectedSalary = new BigDecimal("110.00");
    employeeSUT.tenPercentRaise();
    assertEquals(expectedSalary, employeeSUT.getSalary());
  }
  
  @Test
  public void test5PercentRaiseSalary() {
    BigDecimal expectedSalary = new BigDecimal("105.000");
    employeeSUT.fivePercentRaise();
    assertEquals(expectedSalary, employeeSUT.getSalary());
  }

}
