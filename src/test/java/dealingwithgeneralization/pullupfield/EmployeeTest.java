package dealingwithgeneralization.pullupfield;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class EmployeeTest {

  @Test
  public void testSalesmanName() {
    Employee salesman = new Salesman("Oscar");
    String expectedName = "Oscar";
    String actualName = salesman.getName();
    assertEquals(expectedName , actualName);
  }

  @Test
  public void testEngineerName() {
    Employee engineer = new Engineer("Max");
    String expectedName = "Max";
    String actualName = engineer.getName();
    assertEquals(expectedName, actualName);
  }
  
}
