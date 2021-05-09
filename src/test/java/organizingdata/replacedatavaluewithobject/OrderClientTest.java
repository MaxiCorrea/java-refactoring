package organizingdata.replacedatavaluewithobject;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import java.util.List;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class OrderClientTest {

  private static final List<Order> ORDERS = asList(
      new Order("Customer 1") , 
      new Order("Customer 2"), 
      new Order("Customer 1"));
  
  @Test
  public void numberOfOrdersForExistingCustomer() {
    OrderClient client = new OrderClient(ORDERS);
    int expectedOcurrences = 2;
    assertEquals(expectedOcurrences, client.numberOfOrdersFor("Customer 1"));
  }
  
  @Test
  public void numberOfOrdersForNonExistentCustomer() {
    OrderClient client = new OrderClient(ORDERS);
    int expectedOcurrences = 0;
    assertEquals(expectedOcurrences, client.numberOfOrdersFor("Customer 3"));
  }
  
}
