package dealingwithgeneralization.extractsubclass;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class JobItemTest {

  private static final Employee employee = new Employee(10);
  
  @Test
  public void theUnitPriceForAJobWithoutAnEmployee() {
    JobItem item = new JobItem(300, 2, false, employee);
    int expectedUnitPrice = 300;
    int actualUnitPrice = item.getUnitPrice();
    assertEquals(expectedUnitPrice , actualUnitPrice);
  }

  @Test
  public void theUnitPriceForAJobWithAnEmployee() {
    JobItem item = new JobItem(300, 2, true, employee);
    int expectedUnitPrice = 10;
    int actualUnitPrice = item.getUnitPrice();
    assertEquals(expectedUnitPrice , actualUnitPrice);
  }
  
  @Test
  public void theTotalPriceForAJobWithoutAnEmployee() {
    JobItem item = new JobItem(300, 2, false, employee);
    int expectedTotalPrice = 600;
    int actualTotalPrice = item.getTotalPrice();
    assertEquals(expectedTotalPrice, actualTotalPrice);
  }

  @Test
  public void theTotalPriceForAJobWithAnEmployee() {
    JobItem item = new JobItem(300, 2, true, employee);
    int expectedTotalPrice = 20;
    int actualTotalPrice = item.getTotalPrice();
    assertEquals(expectedTotalPrice, actualTotalPrice);
  }
  
}
