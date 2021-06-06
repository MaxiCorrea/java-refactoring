package makingmethodcallssimpler.replaceerrorcodewithexception;

import static org.junit.Assert.assertEquals;
import java.math.BigDecimal;
import org.junit.Test;
/**
 * 
 * @author mxcorrea
 *
 */
public class AccountTest {

  @Test
  public void testWithdrawInvalidAmount() {
    Account account = new Account(new BigDecimal("10"));
    int expectedErrorCode = -1;
    assertEquals(expectedErrorCode , account.withdraw(new BigDecimal("20")));
    BigDecimal expectedBalance = new BigDecimal("10");
    assertEquals(expectedBalance , account.getBalance());
  }

  @Test
  public void testWithdrawValidAmount() {
    Account account = new Account(new BigDecimal("10"));
    int expectedErrorCode = 0;
    assertEquals(expectedErrorCode , account.withdraw(new BigDecimal("5")));
    BigDecimal expectedBalance = new BigDecimal("5");
    assertEquals(expectedBalance , account.getBalance());
  }
  
}
