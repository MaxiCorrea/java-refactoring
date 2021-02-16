package movingfeaturesbetweenobjects.movemethod;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AccountTest {

  private static final AccountType PREMIUN = new AccountPremiunType();
  private static final AccountType DEFAULT = new AccountDefaultType();

  @Test
  public void overdraftChargePremiunTypeMoreOfSevenDaysOverdrawn() {
    Account account = new Account(PREMIUN, 8);
    double expectedOverdraftCharge = 10.85;
    double actualOverdraftCharge = account.overdraftCharge();
    assertEquals(expectedOverdraftCharge, actualOverdraftCharge, 0.0);
  }

  @Test
  public void overdraftChargePremiunTypeMoreOfTwoDaysOverdrawn() {
    Account account = new Account(PREMIUN, 2);
    double expectedOverdraftCharge = 10.0;
    double actualOverdraftCharge = account.overdraftCharge();
    assertEquals(expectedOverdraftCharge, actualOverdraftCharge, 0.0);
  }
  
  @Test
  public void overdraftChargeDefaultTypeMoreOfSevenDaysOverdrawn() {
    Account account = new Account(DEFAULT, 8);
    double expectedOverdraftCharge = 14.0;
    double actualOverdraftCharge = account.overdraftCharge();
    assertEquals(expectedOverdraftCharge, actualOverdraftCharge, 0.0);
  }

  @Test
  public void overdraftChargeDefaultTypeMoreOfTwoDaysOverdrawn() {
    Account account = new Account(DEFAULT, 2);
    double expectedOverdraftCharge = 3.5;
    double actualOverdraftCharge = account.overdraftCharge();
    assertEquals(expectedOverdraftCharge, actualOverdraftCharge, 0.0);
  }
  
}
