package organizingdata.unidirectionalassociationtobidirectional;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * 
 * @author mxcorrea
 *
 */
public class CustomerTest {

  @Test
  public void initiallyTheCustomerHasNoOrders() {
    Customer customer = new Customer();
    assertNotNull(customer.friendOrders());
    assertTrue(customer.friendOrders().isEmpty());
  }

  @Test
  public void testingCustomerWithAnOrder() {
    Customer customer = new Customer();
    Order order = new Order(customer);
    assertFalse(customer.friendOrders().isEmpty());
    assertEquals(order.getCustomer(), customer);
  }

}
