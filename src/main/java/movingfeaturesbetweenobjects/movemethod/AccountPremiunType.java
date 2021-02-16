package movingfeaturesbetweenobjects.movemethod;

/**
 * 
 * @author mxcorrea
 *
 */
public class AccountPremiunType implements AccountType {

  @Override
  public double overdraftCharge(
      final int daysOverdrawn) {
    double result = 10;
    if (daysOverdrawn > 7)
      result += (daysOverdrawn - 7) * 0.85;
    return result;
  }

}
