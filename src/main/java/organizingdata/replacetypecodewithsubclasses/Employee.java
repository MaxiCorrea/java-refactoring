package organizingdata.replacetypecodewithsubclasses;
/**
 * 
 * @author mxcorrea
 *
 */
public final class Employee {

  public static final Employee create(
      final int paymentCode) {
    return new Employee(paymentCode);
  }
  
  public static final int ENGINER = 0;
  public static final int SALESMAN = 1;
  public static final int MANAGER = 2;
  
  private final int paymentCode;
  
  private Employee(
      final int paymentCode) {
    this.paymentCode = paymentCode;
  }
   
  public int getPaymentCode() {
    return paymentCode;
  }
  
}
