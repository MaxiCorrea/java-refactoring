package movingfeaturesbetweenobjects.movemethod;
/**
 * 
 * @author mxcorrea
 *
 */
public interface AccountType {

  default double overdraftCharge(
      final int daysOverdrawn) {
    return daysOverdrawn * 1.75;
  } 
  
  public default double bankCharge(
      final int daysOverdrawn) {
    double result = 4.5;
    if (daysOverdrawn > 0)
      result += overdraftCharge(daysOverdrawn);
    return result;
  }
}
