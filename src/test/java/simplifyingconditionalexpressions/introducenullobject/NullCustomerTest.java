package simplifyingconditionalexpressions.introducenullobject;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class NullCustomerTest {

  @Test
  public void testNullCustomerInstance() {
    Customer customer = Customer.newNull();
    assertNotNull(customer);
    assertTrue(customer.getHistory() instanceof NullPaymentHistory);
    assertEquals(customer.getName(), "occupant");
    assertNotNull(customer.getPlan());
    assertEquals(0 ,customer.getPlan().getWeeksDelinquentInLastYear());
  }

}
