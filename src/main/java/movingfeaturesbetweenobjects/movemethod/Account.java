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
    return accountType.overdraftCharge(daysOverdrawn);
  }

  public double bankCharge() {
    return accountType.bankCharge(daysOverdrawn);
  }

}
