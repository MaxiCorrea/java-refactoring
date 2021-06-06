package dealingwithgeneralization.extractsubclass;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class JobItemTest {

  private static final Employee EMPLOYEE_STUB = new Employee(10);
  
  @Test
  public void theUnitPriceForAJobWithoutAnEmployee() {
    JobItem item = new JobItem(300, 2, false, EMPLOYEE_STUB);
    int expectedUnitPrice = 300;
    int actualUnitPrice = item.getUnitPrice();
    assertEquals(expectedUnitPrice , actualUnitPrice);
  }

  @Test
  public void theUnitPriceForAJobWithAnEmployee() {
    JobItem item = new LaborItem(300, 2, true, EMPLOYEE_STUB);
    int expectedUnitPrice = 10;
    int actualUnitPrice = item.getUnitPrice();
    assertEquals(expectedUnitPrice , actualUnitPrice);
  }
  
  @Test
  public void theTotalPriceForAJobWithoutAnEmployee() {
    JobItem item = new JobItem(300, 2, false, EMPLOYEE_STUB);
    int expectedTotalPrice = 600;
    int actualTotalPrice = item.getTotalPrice();
    assertEquals(expectedTotalPrice, actualTotalPrice);
  }

  @Test
  public void theTotalPriceForAJobWithAnEmployee() {
    JobItem item = new LaborItem(300, 2, true, EMPLOYEE_STUB);
    int expectedTotalPrice = 20;
    int actualTotalPrice = item.getTotalPrice();
    assertEquals(expectedTotalPrice, actualTotalPrice);
  }
  
}
