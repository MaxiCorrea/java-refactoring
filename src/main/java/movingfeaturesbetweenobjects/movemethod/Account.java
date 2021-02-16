package movingfeaturesbetweenobjects.movemethod;

/**
 * 
 * @author mxcorrea
 *
 */
public class Account {

  private AccountType accountType;
  private int daysOverdrawn;

  public Account(
      final AccountType accountType, 
      final int daysOverdrawn) {
    this.accountType = accountType;
    this.daysOverdrawn = daysOverdrawn;
  }

  public double overdraftCharge() {
    if (accountType.isPremium()) {
      double result = 10;
      if (daysOverdrawn > 7)
        result += (daysOverdrawn - 7) * 0.85;
      return result;
    } else
      return daysOverdrawn * 1.75;
  }

  public double bankCharge() {
    double result = 4.5;
    if (daysOverdrawn > 0)
      result += overdraftCharge();
    return result;
  }

}
