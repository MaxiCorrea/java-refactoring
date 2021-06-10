package dealingwithgeneralization.extractsuperclass;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;

/**
 * 
 * @author mxcorrea
 *
 */
public class EmployeeTest {

  @Test
  public void testEmployeeConstructor() {
    Employee employee = new Employee(1, "Maxpower", new BigDecimal("123"));
    assertEquals(1, employee.getId());
    assertEquals("Maxpower", employee.getName());
    assertEquals(new BigDecimal("123"), employee.getAnnualCost());
  }

}
