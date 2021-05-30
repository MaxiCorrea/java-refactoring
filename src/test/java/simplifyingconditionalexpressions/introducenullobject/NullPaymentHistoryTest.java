package simplifyingconditionalexpressions.introducenullobject;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class NullPaymentHistoryTest {

  @Test
  public void testNullPaymentHistory() {
    PaymentHistory history = PaymentHistory.newNull();
    assertNotNull(history);
    assertTrue(history instanceof NullPaymentHistory);
    assertEquals(0 , history.getWeeksDelinquentInLastYear());
  }

}
