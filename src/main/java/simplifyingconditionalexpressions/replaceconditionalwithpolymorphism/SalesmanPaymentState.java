package simplifyingconditionalexpressions.replaceconditionalwithpolymorphism;
/**
 * 
 * @author mxcorrea
 *
 */
public final class SalesmanPaymentState implements PaymentType {

  @Override
  public int getTypeCode() {
    return PaymentType.SALESMAN;
  }

}
