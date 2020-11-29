package composingmethods.inlinetemp;

import static org.junit.Assert.*;
import org.junit.Test;

public class InvoiceTest {

  private static final Order ORDER_WITH_BASE_PRICE_90 = new Order(90);
  private static final Order ORDER_WITH_BASE_PRICE_2000 = new Order(2000);
  
  @Test
  public void testBasePrice() {
    Invoice invoice = new Invoice(ORDER_WITH_BASE_PRICE_90);
    assertFalse(invoice.check());
    invoice = new Invoice(ORDER_WITH_BASE_PRICE_2000);
    assertTrue(invoice.check());
  }

}
