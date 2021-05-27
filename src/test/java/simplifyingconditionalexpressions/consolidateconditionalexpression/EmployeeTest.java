package simplifyingconditionalexpressions.consolidateconditionalexpression;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author mxcorrea
 *
 */
public class EmployeeTest {

  @Test
  public void testDisabilityAmount() {
    Employee employee = new Employee(1, 1, false);
    assertEquals(0.0, employee.disabilityAmount(), 0.0);
    employee = new Employee(2, 13, false);
    assertEquals(0.0, employee.disabilityAmount(), 0.0);
    employee = new Employee(3, 1, true);
    assertEquals(0.0, employee.disabilityAmount(), 0.0);
    employee = new Employee(3, 1, false);
    assertEquals(-1.0, employee.disabilityAmount(), 0.0);
  }

}
