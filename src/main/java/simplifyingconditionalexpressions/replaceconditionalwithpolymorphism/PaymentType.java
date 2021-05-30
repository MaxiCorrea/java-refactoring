package simplifyingconditionalexpressions.replaceconditionalwithpolymorphism;

/**
 * 
 * @author mxcorrea
 *
 */
public interface PaymentType {
  
  public static final int ENGINEER = 0;
  public static final int SALESMAN = 1;
  public static final int MANAGER = 2;
  
  int getTypeCode();

  static PaymentType newType(
      final int paymentCode) {
    if(paymentCode == ENGINEER) 
      return new EngineerPaymentState();
    if(paymentCode == SALESMAN) 
      return new SalesmanPaymentState();
    if(paymentCode == MANAGER) 
      return new ManagerPaymentState();
    throw new RuntimeException("Incorrect Payment code");
  }
}
