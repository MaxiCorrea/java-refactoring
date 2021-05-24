package organizingdata.replacetypecodewithsubclasses;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Employee {

  public static final int ENGINER = 0;
  public static final int SALESMAN = 1;
  public static final int MANAGER = 2;
  
  private final int paymentCode;
  
  public Employee(
      final int paymentCode) {
    this.paymentCode = paymentCode;
  }
   
}
