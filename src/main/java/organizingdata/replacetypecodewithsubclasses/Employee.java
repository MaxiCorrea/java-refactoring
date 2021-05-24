package organizingdata.replacetypecodewithsubclasses;
/**
 * 
 * @author mxcorrea
 *
 */
public class Employee {

  public static final Employee create(
      final int paymentCode) {
    if(paymentCode == Employee.ENGINEER)
      return new Engineer();
    if(paymentCode == Employee.SALESMAN)
      return new Salesman();
    if(paymentCode == Employee.MANAGER)
      return new Manager();
    throw new IllegalArgumentException("Incorrect type code value");
  }
  
  public static final int ENGINEER = 0;
  public static final int SALESMAN = 1;
  public static final int MANAGER = 2;
  
  private final int paymentCode;
  
  Employee(
      final int paymentCode) {
    this.paymentCode = paymentCode;
  }
   
  public int getPaymentCode() {
    return paymentCode;
  }
  
}
