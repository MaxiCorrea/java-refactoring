package dealingwithgeneralization.extractsuperclass;

import static org.junit.Assert.*;
import java.math.BigDecimal;
import org.junit.Test;

/**
 * 
 * @author mxcorrea
 *
 */
public class DepartmentTest {

  @Test
  public void testDepartmentConstructor() {
    Department department = new Department("Alfred", 58, BigDecimal.TEN);
    assertEquals("Alfred", department.getName());
    assertEquals(58, department.getHeadCount());
    assertEquals(BigDecimal.TEN, department.getTotalAnnualCost());
  }

}
