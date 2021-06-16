package dealingwithgeneralization.extractinterface;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class EmployeeTest {

  @Test
  public void testConstructorAndGetters() {
    Employee employee = new Employee(12,"Max",true);
    int expectedRate = 12;
    int actualRate = employee.getRate();
    assertEquals(expectedRate, actualRate);
    String expectedName = "Max";
    String actualName = employee.getName();
    assertEquals(expectedName, actualName);
    assertTrue(employee.hasSpecialSkill());
  }

  @Test
  public void testBillableObject() {
    Billable employee = new Employee(12,"Max",true);
    int expectedRate = 12;
    int actualRate = employee.getRate();
    assertEquals(expectedRate, actualRate);
    assertTrue(employee.hasSpecialSkill());
  }
  
}
