package simplifyingconditionalexpressions.consolidateduplicateconditionalfragments;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import simplifyingconditionalexpressions.consolidateduplicateconditionalfragments.Product.Sender;

/**
 * 
 * @author mxcorrea
 *
 */
public class ProductTest {

  private Sender senderMock;

  @Before
  public void setup() {
    senderMock = new Product.Sender() {
      @Override public void send() {}
    };
  }

  @Test
  public void testWithSpecialDeal() {
    Product product = new Product(30, senderMock, true);
    double expected = 30 * 0.95;
    double actual = product.calculateTotalAndSend();
    assertEquals(expected, actual, 0.0);
  }

  @Test
  public void testWithoutSpecialDeal() {
    Product product = new Product(30, senderMock, false);
    double expected = 30 * 0.98;
    double actual = product.calculateTotalAndSend();
    assertEquals(expected, actual, 0.0);
  }

}
